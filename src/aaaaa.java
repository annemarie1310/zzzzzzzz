import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class aaaaa {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");



    }

}
