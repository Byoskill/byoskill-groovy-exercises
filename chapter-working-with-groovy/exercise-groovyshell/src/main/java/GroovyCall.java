import groovy.lang.Binding;
import groovy.util.Eval;
import groovy.util.GroovyScriptEngine;
import groovy.util.ResourceException;
import groovy.util.ScriptException;

import java.io.IOException;

public class GroovyCall {

    public static void main(String[] args) throws IOException, ScriptException, ResourceException {
        Eval.me("2+3+4");
        Eval.me("println 'toto'");

        Eval.x(4, "2+3+x");


        String path = "chapter-working-with-groovy/exercise-groovyshell/src/test/resources";
        final GroovyScriptEngine gse = new GroovyScriptEngine(path);
        final Object result = gse.run("Script1.groovy", new Binding());
        assert result == "Hello world";
        
    }
}
