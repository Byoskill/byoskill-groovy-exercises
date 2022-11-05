import groovy.lang.Script;
import groovy.transform.Field;

public class Run extends Script {

    @Field
    Integer a = 4;

    public Object method() {
        binding.variables.put c = 10;
    }

    public void run() {

        binding.variables.put("b",  10);



        method();

        class A {
            def method2() {
                println a
            }
        }

        A abc = new A();
        abc.method2()

        println "${a} ${b} ${c}"



    }
}