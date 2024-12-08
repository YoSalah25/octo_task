import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    By checkoutButton = By.id("shopping_cart_container");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }
}
