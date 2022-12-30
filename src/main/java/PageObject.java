import configurations.BaseClass;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class PageObject extends BaseClass{
    @Test
    public void formTest(){

        String mainURL = "https://ithillel.ua/courses/java-basic";

        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://ithillel.ua/courses/java-basic");
        }

        Lesson15_PageObject pageObject = PageFactory.initElements(driver, Lesson15_PageObject.class);

        System.out.println(pageObject.getCourseTitle());
        System.out.println(pageObject.getCourseRate());
        System.out.println(pageObject.getCourseDescription());
        System.out.println(pageObject.getCourseGoals());
    }
}
