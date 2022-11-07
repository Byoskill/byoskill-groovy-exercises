

class Hello {
    def method(Object object) {
        println "Ceci est un object"
    }

    def method(String string) {
        println "Ceci est une chaine de caractère"
    }
}



def hello = new Hello()
Object msg = "Hello"

/**
 * Résolution des appels est statique
 */
hello.method(msg);

// Hello.method(Ljava/lang/Object;)

// Hello.method(Ljava/lang/String;)
// Hello.call("method", msg.class.name => String)


class Shape  {
    def type() {
        "Shape"
    }
}

class Rectangle extends Shape  {
    def type() {
        "Rectangle"
    }
}

class Geometry {
    def apply(Shape shape) {
        println "Ceci est une shape qui est de type ${shape.type()}"
    }

    def apply(Rectangle shape) {
        println "Je suis un rectangle"
        println "Ceci est une rectangle qui est de type ${shape.type()}"
    }
}

Shape shape = new Rectangle();
def geometry = new Geometry()
geometry.apply(shape);


// blocs ARM (Automatic resource management)
try ( InputStream is = new FileInputStream("fdfdf.tt")) {

} finally {

}

def file = new File("test.txt")
def content = file.text


