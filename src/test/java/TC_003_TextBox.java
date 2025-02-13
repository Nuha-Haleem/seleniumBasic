import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TC_003_TextBox {

    WebDriver driver;

    @BeforeMethod
    public void openTextBoxLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0nphki22quoom1g3kttmjpm6ag7968424.node0");
    }

    @Test
    public void textBoxTest(){
        //Type your name
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Nuha Haleem");

        //Append Country to this City.
        WebElement  appendText = driver.findElement(By.id("j_idt88:j_idt91"));
        appendText.sendKeys("Sri Lanka");

        //Verify if text box is disable
       boolean enable = driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
       System.out.println("box enable"+ enable);

        //Clear the typed text.
        WebElement clearText= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
        clearText .clear();

        //Retrieve the typed text.
        WebElement textElement =driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println(value);

        //
       WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
       email.sendKeys("nuha12@gmail.com"+ Keys.TAB +"MOVE TO  NEXT ELEMENT");




    }
}
