package sorting;

import basetest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sorting extends BaseTest {

    @Test
    public void sortByNameAZ() {
        homePage.sortProduct("Name (A - Z)");
        Assert.assertEquals(homePage.getSelectedSortOption(), "Name (A - Z)");
    }

    @Test
    public void sortByNameZA() {
        homePage.sortProduct("Name (Z - A)");
        Assert.assertEquals(homePage.getSelectedSortOption(), "Name (Z - A)");
    }

    @Test
    public void sortByPriceHighLow() {
        homePage.sortProduct("Price (High - Low)");
        Assert.assertEquals(homePage.getSelectedSortOption(), "Price (High - Low)");
    }

    @Test
    public void sortByPriceLowHigh() {
        homePage.sortProduct("Price (Low - High)");
        Assert.assertEquals(homePage.getSelectedSortOption(), "Price (Low - High)");
    }

    @Test
    public void sortByCo2AE() {
        homePage.sortProduct("CO₂ Rating (A - E)");
        Assert.assertEquals(homePage.getSelectedSortOption(), "CO₂ Rating (A - E)");
    }

    @Test
    public void sortByCo2EA() {
        homePage.sortProduct("CO₂ Rating (E - A)");
        Assert.assertEquals(homePage.getSelectedSortOption(), "CO₂ Rating (E - A)");
    }
}
