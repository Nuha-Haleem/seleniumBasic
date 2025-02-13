import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_004_ClickButton {

      WebDriver driver;

    @BeforeMethod
    public void clickLink(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void clickTest(){
        WebElement click = driver.findElement(By.id("j_idt88:j_idt90"));
        click.click();
    }
}
