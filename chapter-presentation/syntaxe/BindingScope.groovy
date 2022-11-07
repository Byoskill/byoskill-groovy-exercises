import groovy.transform.Field


var a = 4
var b = 10

def method() {
    c = 10;
}

method()

/**
class A {
    def method2(int b) {
        println a
        b  + 2
    }
}

A abc = new A();
c = abc.method2(b)
 **/

println binding.hasVariable("c")

println "${a} ${b} ${c}"



