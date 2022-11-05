import groovy.transform.Internal

class TestMeta implements GroovyInterceptable {
    private Map<String, Object> jsonFields = [:];

    @Override
    void setProperty(String propertyName, Object newValue) {
        jsonFields.put(propertyName, newValue)
    }



    def affiche() {
        println jsonFields
    }
}

TestMeta dsl = new TestMeta()
dsl.a = 2
dsl.b = 2
dsl.c = 2

dsl.affiche()
