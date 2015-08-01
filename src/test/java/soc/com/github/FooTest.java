package soc.com.github;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import soc.com.github.categories.Inner;
import soc.com.github.categories.Outer;

@RunWith(Enclosed.class)
@Category(Outer.class)
public class FooTest {
    @Category(Inner.class)
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
