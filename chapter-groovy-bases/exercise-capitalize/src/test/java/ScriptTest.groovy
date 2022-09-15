import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

public class ScriptTest {

    Script script

    @BeforeEach
    void before() {
        def shell = new GroovyShell()
        script = shell.parse(new File("src/main/groovy/Script.groovy"));
    }

    @Test
    void testScript() {
        assert script.method() == "test";
        assert script.run() == "Hello world"
    }
}