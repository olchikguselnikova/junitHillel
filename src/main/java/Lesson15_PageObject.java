import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lesson15_PageObject {
    @FindBy(xpath = "//span[contains(@class,\"course-descriptor_header-text\")]")
    WebElement courseTitle;

    @FindBy(xpath = "//span[contains(@class,\"course-rating_average\")]")
    WebElement courseRate;

    @FindBy(xpath = "//*[contains(@class,\"introduction_info introduction-info\")]//child::p")
    WebElement courseDescription;

    @FindBy(xpath = "//div[contains(@class,\"introduction-info-redactor_section\")]")
    WebElement courseGoals;

    public String getCourseTitle(){
        return courseTitle.getText();
    }
    public String getCourseRate(){
        return courseRate.getText();
    }
    public String getCourseDescription(){
        return courseDescription.getText();
    }
    public String getCourseGoals(){
        return courseGoals.getText();
    }
}

