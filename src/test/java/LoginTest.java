import models.User;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        if (app.user().isLoggedIn()){
            app.user().logout();
        }

    }

    @Test
    public void loginTest(){
        app.user().openLoginForm();
        app.user().fillLoginFor(new User().withEmail("robertocarlos123@gmail.com")
                .withPassword("$Robertocarlos123"));
        app.user().cliclLoginButton();
        app.user().pause(2000);
        app.user().successLogin();
        app.user().pause(2000);
        Assert.assertTrue(app.user().isLoggedIn());

    }

    @AfterMethod
    public void postconditions(){
        app.user().logout();
    }

}
// Roberto123 Carlos123 robertocarlos123@gmail.com $Robertocarlos123