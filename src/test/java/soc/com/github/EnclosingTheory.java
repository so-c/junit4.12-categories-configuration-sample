package soc.com.github;

import org.junit.experimental.runners.Enclosed;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class EnclosingTheory {
    
    @RunWith(Theories.class)
    public static class EnclosedTheory {
        @DataPoints
        public static Fixture fixtures[] = {
                new Fixture(1, 5),
                new Fixture(2, 10)
        };
        
        @Theory
        public void testCase(Fixture f) throws Exception {
            System.out.println("input: " + f.input);
            System.out.println("expected: " + f.expected);
        }
        
        public static class Fixture {
            int input;
            int expected;

            public Fixture(int input, int expected) {
                super();
                this.input = input;
                this.expected = expected;
            }
        }
    }
}
