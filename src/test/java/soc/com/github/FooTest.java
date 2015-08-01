package soc.com.github;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class FooTest {
    public static class FooBarTest {
        @Test
        public void testFooBar() throws Exception {
            System.out.println("FooBarTest.");
        }
    }

    public static class FooBazTest {
        @Test
        public void testFooBaz() throws Exception {
            System.out.println("FooBazTest.");
        }

    }
}
