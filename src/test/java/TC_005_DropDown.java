import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_005_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void dropDown(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/select.xhtml");
    }

    @Test
    public void leafgroundDropdown(){
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select =new Select(dropdown);
        select.selectByIndex(1);
        select.selectByVisibleText("Playwright");


        //using sendkeys for selecting dropdown
       dropdown.sendKeys("Selenium");

    }

   

}

