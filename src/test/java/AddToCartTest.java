import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class AddToCartTest {

//    WebDriver driver = new ChromeDriver();
     WebDriver driver =LoginTest.driver;

    @Test
    public void testAddToCart() {
        LoginTest.testLogin();


        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickItemAnchor();
        inventoryPage.addToCartButton();


    }
}
