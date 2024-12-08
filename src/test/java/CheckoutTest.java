import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class CheckoutTest {
    WebDriver driver = LoginTest.driver;

    @Test
    public void testCheckout() {

        LoginTest.testLogin();


        InventoryPage inventoryPage = new InventoryPage(driver);
        inventoryPage.clickItemAnchor();
        inventoryPage.addToCartButton();


        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckoutButton();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.checkoutButton();
        checkoutPage.enterCheckoutInfo("Youssef", "Salah", "12345");
        checkoutPage.clickContinueButton();

    }
}
