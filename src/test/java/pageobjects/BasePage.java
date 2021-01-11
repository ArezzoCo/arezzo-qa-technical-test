package pageobjects;

import models.BaseGeneric;
import utils.Element;
import org.openqa.selenium.WebElement;



public class BasePage extends Element {

    protected static void click(BaseGeneric generic) {
        waitForElementVisible(generic);
        WebElement element = element(generic);
        element.click();
    }

    protected static void fillInput(String text, BaseGeneric generic) {
        waitForElementVisible(generic);
        element(generic).clear();
        element(generic).sendKeys(text);
    }


}
