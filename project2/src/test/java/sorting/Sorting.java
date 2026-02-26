package sorting;

import basetest.BaseTest;
import org.testng.annotations.Test;

public class Sorting extends BaseTest {

    @Test
    public void testSorting() {
        homePage.sortProduct("Name oogg");
        homePage.sortProduct("Price (High - Low)");
        homePage.sortProduct("CO₂ Rating");
    }
}
