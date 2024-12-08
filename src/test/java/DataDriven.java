import org.testng.annotations.DataProvider;

public class DataDriven {


    public class LoginDataProvider {
        @DataProvider(name = "loginData")
        public static Object[][] loginData() {
            return new Object[][] {
                    {"problem_user", "secret_sauce", ""},
                    {"invalid_user", "invalid_pass", ": Username and password do not match any user in this service"},
                    {"", "", "Epic sadface: Username is required"},
            };
        }
    }

}
