import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InventoryPage {
    WebDriver driver;

    By addToCartButton = By.id("add-to-cart");
    By anchorId = By.id("item_1_img_link");
    By cartIcon = By.className("https://www.saucedemo.com/cart.html");
    By sortDropdown = By.className("product_sort_container");


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickItemAnchor() {
        driver.findElement(anchorId).click();
    }



    public void addToCartButton() {
        driver.findElement(addToCartButton).click();
    }


    public void sortBy(String sortOption) {
        try {
            WebElement dropdown = driver.findElement(sortDropdown);
            Select select = new Select(dropdown);
            select.selectByValue(sortOption);
        } catch (Exception e) {
            System.out.println("Error selecting sort option: " + e.getMessage());
            throw e;
        }
    }

    public boolean isSortedByPrice() {
        return false;
    }
}