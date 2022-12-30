import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Lesson15_PageObject {
    @FindBy(xpath = "//span[contains(@class,\"course-descriptor_header-text\")]")
    WebElement courseTitle;

    @FindBy(xpath = "//span[contains(@class,\"course-rating_average\")]")
    WebElement courseRate;

    @FindBy(xpath = "//div[contains(@class,\"introduction_info introduction-info\")]")
    WebElement courseDescription;

    public String getCourseTitle(){
        return courseTitle.getText();
    }
    public String getCourseRate(){
        return courseRate.getText();
    }
    public String getCourseDescription(){
        return courseDescription.getText();
    }
}
