import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigate_to_next_website {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.amazon.com//");
        //driver.manage().window().maximize();   // helps to maximize the window
        driver.manage().window().minimize();    //  helps to minimize the window
        //Thread.sleep(4000);                   // helps to stop/freeze/sleep window for given seconds ( here 4s )
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 14");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.linkText("iPhone 13, 128GB, Pink - Unlocked (Renewed Premium)")).click();
        //driver.navigate().to("https://www.flipkart.com/");         //helps to navigate to next website .
        String at = driver.getTitle();
        String et ="Amazon.com";
        if (at.equalsIgnoreCase(et)){
            System.out.println("Test case Pass");
        }
        else {
            System.out.println("Fail");
        }
    }

}
