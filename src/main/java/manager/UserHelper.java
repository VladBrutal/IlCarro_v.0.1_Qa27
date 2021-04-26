package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper  extends HelperBase{
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }

    public void fillLoginFor(User user) {
        type(By.id("email"), user.getEmail());
        type(By.id("password"), user.getPassword());
    }

    public void cliclLoginButton() {
        click(By.xpath("//button[.='Y’alla!']"));
    }

    public void successLogin() {
        click(By.xpath("//button[text()='Ok']"));
    }

    public boolean isLoggedIn(){
        return isElementPresent(By.xpath("//a[.=' Logout ']"));
    }

    public void logout() {
        click(By.xpath("//a[.=' Logout ']"));
    }
}
