import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC_002_LinkExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void testLink(){
        // take me to dashboard
        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();

    }
    @Test
    public void brokenLink(){
        // test broken  link
        WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
        brokenLink.click();

        String title = driver.getTitle();
        if (title.contains("404")){
            System.out.println("page is broken");
        }else{
            System.out.println("not broken");
        }

    }

}
