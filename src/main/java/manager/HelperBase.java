package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }

    public void type(By locator, String text){
        if (text != null){
            WebElement el = wd.findElement(locator);
            el.click();
            el.clear();
            el.sendKeys(text);

        }
    }

    public void selectByText(By locator, String text){
        if (text != null){
            WebElement el = wd.findElement(locator);
            el.click();
            el.clear();
            Select dropdown = new Select(el);
            dropdown.selectByVisibleText(text);
        }
    }

    public void uploadPicture(By locator, String filePath){
        if (filePath != null){
            WebElement el = wd.findElement(locator);
            el.click();
            el.sendKeys(filePath);
        }
    }

    public void pause(int mills){

        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementPresent(By locator){
        return wd.findElements(locator).size()>0;
    }

}
