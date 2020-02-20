import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    Application application = new Application();

    @Test
    public void test1() {

        assertEquals("a", application.getFirstSingleChar("a"));

    }
    @Test
    public void test2() {
        assertEquals("-", application.getFirstSingleChar("aa"));
    }

    @Test
    public void test3() {
        assertEquals("b", application.getFirstSingleChar("aab"));
    }

    @Test
    public void test4() {
        assertEquals("a", application.getFirstSingleChar("abb"));
    }

    @Test
    public void test5() {
        assertEquals("-", application.getFirstSingleChar("aabb"));
    }

    @Test
    public void test6() {
        assertEquals("b", application.getFirstSingleChar("aabB"));
    }

    @Test
    public void test7() {
        assertEquals("-", application.getFirstSingleChar("ccaabb"));
    }

    @Test
    public void test8() {
        assertEquals("c", application.getFirstSingleChar("caabb"));
    }

    @Test
    public void test9() {
        assertEquals("a", application.getFirstSingleChar("ccabb"));
    }

    @Test
    public void test10() {
        assertEquals("b", application.getFirstSingleChar("ccaab"));
    }

    @Test
    public void test11() {
        assertEquals("b", application.getFirstSingleChar("aAbBABac"));
    }
}
