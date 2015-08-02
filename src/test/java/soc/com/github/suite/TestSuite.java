package soc.com.github.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import soc.com.github.EnclosingTheory.EnclosedTheory;
import soc.com.github.FooTest;
import soc.com.github.FooTest.FooBarTest;
import soc.com.github.FooTest.FooBazTest;
import soc.com.github.categories.Inner;
import soc.com.github.categories.Outer;

public class TestSuite {
    @RunWith(Categories.class)
    @IncludeCategory(Outer.class)
    @SuiteClasses(FooTest.class)
    public static class Suite1 {
        // NoTestsRemainException is thrown.
    }
    
    @RunWith(Categories.class)
    @IncludeCategory(Outer.class)
    @SuiteClasses({FooTest.class, FooBarTest.class, FooBazTest.class})
    public static class Suite2 {
        // NoTestsRemainException is thrown.
    }
    
    @RunWith(Categories.class)
    @IncludeCategory(Inner.class)
    @SuiteClasses({FooBarTest.class, FooBazTest.class})
    public static class Suite3 {
        // run testFooBar. not testFooBaz.
    }
    
    @RunWith(Categories.class)
    @IncludeCategory(Inner.class)
    @SuiteClasses({FooBarTest.class, FooBazTest.class, EnclosedTheory.class})
    public static class Suite4 {
        // run testFooBar. not testFooBaz.
    }
}
