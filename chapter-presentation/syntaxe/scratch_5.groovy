import groovy.transform.MapConstructor
import groovy.transform.ToString
import org.codehaus.groovy.control.CompilerConfiguration
import org.fusesource.hawtjni.runtime.Library

class MyDSL {
    Libraries libraries = new Libraries();
    ProjectInfo projectInfo = new ProjectInfo();

    @ToString(fieldSeparator = ",\n")
    class ProjectInfo {
        String name
        String description
    }

    @MapConstructor
    @Constructor
    @ToString(fieldSeparator = ",\n")
    class Library {
        String id
        String size
    }

    @ToString(fieldSeparator = ",\n", includeFields = true)
    class Libraries {
        private List<Library> allLibraries = [];

        def library(Closure closure) {
            def library = new Library()
            closure.delegate = library
            closure.resolveStrategy = Closure.DELEGATE_FIRST
            closure.call()
            allLibraries += library;


        }

        def leftShift(Closure closure) {
            library(closure)
        }
        def leftShift(Map map) {
            libraries += new Library(map)
        }
    }



    def project(Closure closure) {
        closure.delegate = projectInfo
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure.call()
    }

    def libraries(Closure closure) {
        closure.delegate = libraries
        closure.resolveStrategy = Closure.DELEGATE_FIRST
        closure.call()
    }

    def print() {
        print projectInfo
        println libraries
    }

}

dsl = new MyDSL();
/**
 * Domain Syntaxic language
 */
dsl.project {
    // this = projectInfo
    name = "NOM "
    description = "test"
}

dsl.libraries {
    println this
    library {
        id = "LOAD.LIB.A"
        size = 1000
    }
    library {
        id = "LOAD.LIB.B"
    }
    library {
        id = "LOAD.LIB.C"
    }
    library {
        id = "LOAD.LIB.D"
    }
}

dsl.libraries << {
    id = "LOAD.LIB"
}
dsl.libraries << {
    id = "LOAD.LIB"
}

dsl.libraries << [
        id: "LOAD.LIB"
]


dsl.print()
/**
 Conversion DTO du DSL en entités après le chargement
dsl.libraries.each {
    library -> libraryDao.save(new LibraryEntity(library));
}
 **/