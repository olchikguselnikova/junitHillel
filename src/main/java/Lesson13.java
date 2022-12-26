import configurations.BaseClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson13 extends BaseClass {

    static By firstNameLocator = new By.ById("firstName");
    static By lastNameLocator = new By.ById("lastName");
    static By emailLocator = new By.ById("userEmail");
    static By mobileLocator = new By.ById("userNumber");
    static By subjectLocator= new By.ById("subjectsInput");


    @Test
    public void formTest() {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement firstName = driver.findElement(firstNameLocator);
        firstName.sendKeys("Olga");

        WebElement lastName= driver.findElement(lastNameLocator);
        lastName.sendKeys("Guselnikova");

        WebElement userEmail= driver.findElement(emailLocator);
        userEmail.sendKeys("oguselnikova@gmail.com");

        WebElement userNumber= driver.findElement(mobileLocator);
        userNumber.sendKeys("0633737976");

        WebElement subject= driver.findElement(subjectLocator);
        subject.sendKeys("IT");

    }
}
