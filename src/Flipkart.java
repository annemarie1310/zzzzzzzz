import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1996074949%3A1679836036558850&ifkv=AQMjQ7Sn9vy5xzvpkrZ95e4OuPlefB5f7NF_U19ZUBEEFL9J7b48uVk2W1mUyhS5RaNi8MLQRKiVtw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        String at = driver.getTitle();  // getTitle function return's the name of the webpage .
        String et ="Sign in - Google Accounts";
        if (at.equalsIgnoreCase(et)){
            System.out.println("Test case Pass");
        }
        else {
            System.out.println("Fail");
        }


    }
}
