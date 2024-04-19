import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoFillForm {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","D:\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();


        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Pranay");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khajindar");
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("Birds valley road,AVA avenue,15th floor,ft no :150,New York, USA");
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[3]/div/input")).sendKeys("ZZz@gmail.com");
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("15506552222");
        //  driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-invalid.ng-invalid-required.ng-valid-pattern.ng-touched")).sendKeys("15506552222");
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[5]/div//input")).click();
        driver.findElement(By.xpath("//form[@id='basicBootstrapForm']/div[6]/div/div[2]/input")).click();
     // driver.findElement(By.xpath("//div[@id='msdd']"));



    }
}
