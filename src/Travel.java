import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Travel {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.airnewzealand.co.nz/");
        WebElement source=driver.findElement(By.id("depart-from"));
        source.clear();
        source.sendKeys("Au");
        source.sendKeys(Keys.ENTER);
        WebElement destination=driver.findElement(By.id("depart-to"));
        destination.clear();
        destination.sendKeys("We");
        destination.sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".form-control.vui-obscured")).click();
        for(int i=0;i<3;i++) {
            driver.findElement(By.xpath("//div[@id='adultcount-stepper']/div[1]/button[2]")).click();
        }
        driver.findElement(By.xpath("//button[@type='submit']")).click();



    }
}
