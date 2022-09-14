import groovy.test.GroovyTestCase

class Test1 extends GroovyTestCase {

    void test() {
        var liste = [1,2,2,3,4]
        println liste.collect { it ->"un"}


        println "Hello"
        assert false
    }
}