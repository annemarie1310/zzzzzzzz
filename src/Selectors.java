import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selectors {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1996074949%3A1679836036558850&ifkv=AQMjQ7Sn9vy5xzvpkrZ95e4OuPlefB5f7NF_U19ZUBEEFL9J7b48uVk2W1mUyhS5RaNi8MLQRKiVtw&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        driver.findElement(By.id("identifierId")).sendKeys("ZZZ@gmail.com");
        driver.findElement(By.linkText("Learn more")).click();
        driver.findElement(By.name("identifier")).sendKeys("zzz@gmail.com");
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("zzz@gmail.com"); // ( # is used for id & '.' dot for class ).
        driver.findElement(By.partialLinkText("Learn")).click();
        /* Below is Relative Xpath ( it starts with tag name, @ it selector, [] is in which path should be written & rest given below.  */
        //driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("zzz@gmail.com");



        Thread.sleep(4000);
        driver.close();

    }
}
