import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

public class PyramidTest {

    @Test
    void test1() {
        Assertions.assertEquals (["#"], Pyramid.pyramid(1))
    }

    @Test
    void test2() {
        Assertions.assertEquals (
                [" # ",
                 "###"], 
                Pyramid.pyramid(2))
    }

    @Test
    void test3() {
        Assertions.assertEquals (
                ["  #  ",
                 " ### ",
                 "#####"],
                Pyramid.pyramid(3))
    }

    @Test
    void test4() {
        Assertions.assertEquals (
                ["   #   ",
                 "  ###  ",
                 " ##### ",
                 "#######"],
                Pyramid.pyramid(4))
    }
    
}