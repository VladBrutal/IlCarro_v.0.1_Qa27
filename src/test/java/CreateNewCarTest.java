import models.Car;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewCarTest extends TestBase {

    @BeforeMethod
    public void preconditions(){

    }

    @Test
    public void createNewCar(){
        app.car().openCarCreationForm();
        app.car().fillCarCreationForm(new Car().withLocation("Tel Aviv, Israel").withMake("Honda")
                .withModel("Jazz").withYear("2018").withEngine("1.2").withFuel("Petrol")
                .withGear("AT").withWd("FWD").withDoors("5").withSeats("5").withCarClass("B")
                .withFuelConsumption("5.5").withCarRegistrationNumber("2952165")
                .withDistanceIncluded("78520").withAbout("Almost new car in good conditions")
                .withPicture("/Users/vladmac/toyota_prius.jpeg"));
        app.car().saveCarSubmit();
        app.car().carAddedPopUpShowCar();

        //Assert.assertTrue


    }

    @AfterMethod
    public void postcondition(){
        app.user().logout();
    }
}
