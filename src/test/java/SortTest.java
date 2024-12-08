import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class SortTest {
    WebDriver driver = LoginTest.driver;

    @Test

       public void testSortByPrice() {
        LoginTest.testLogin();

        InventoryPage inventoryPage = new InventoryPage(driver);

//        Name (A to Z):	az
//        Name (Z to A):	za
//        Price (Low to High):	lohi
//        Price (High to Low):	hilo

        inventoryPage.sortBy("hilo");
        System.out.println("Error occurred while checking sorting: ");



    }
}
