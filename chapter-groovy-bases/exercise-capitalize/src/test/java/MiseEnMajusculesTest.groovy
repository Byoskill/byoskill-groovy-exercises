import groovy.test.GroovyTestCase
import org.codehaus.groovy.ant.Groovy

class MiseEnMajusculesTest extends GroovyTestCase {

    def miseEnMajuscules(str) {

    }

    void test1() {
        assert miseEnMajuscules("ceci") == "Ceci"
    }

    void test2() {
        assert miseEnMajuscules("ceci est") == "Ceci Est"
    }

    void test3() {
        assert miseEnMajuscules("") == ""
    }

}