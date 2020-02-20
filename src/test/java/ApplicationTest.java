import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    @Test
    public void test1() {
        Application application = new Application();

        assertEquals('a', application.getFirstSingleChar("a"));

    }
    @Test
    public void test2() {
        Application application = new Application();

        assertEquals('-', application.getFirstSingleChar("aa"));
    }

    @Test
    public void test3() {
        Application application = new Application();

        assertEquals('b', application.getFirstSingleChar("aab"));
    }

    @Test
    public void test4() {
        Application application = new Application();

        assertEquals('a', application.getFirstSingleChar("abb"));
    }

    @Test
    public void test5() {
        Application application = new Application();

        assertEquals('-', application.getFirstSingleChar("aabb"));
    }

    @Test
    public void test6() {
        Application application = new Application();

        assertEquals('b', application.getFirstSingleChar("aabB"));
    }

    @Test
    public void test7() {
        Application application = new Application();

        assertEquals('-', application.getFirstSingleChar("ccaabb"));
    }

    @Test
    public void test8() {
        Application application = new Application();

        assertEquals('c', application.getFirstSingleChar("caabb"));
    }

    @Test
    public void test9() {
        Application application = new Application();

        assertEquals('a', application.getFirstSingleChar("ccabb"));
    }

    @Test
    public void test10() {
        Application application = new Application();

        assertEquals('b', application.getFirstSingleChar("ccaab"));
    }

    @Test
    public void test11() {
        Application application = new Application();

        assertEquals('b', application.getFirstSingleChar("aAbBABac"));
    }
}
