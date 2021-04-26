package manager;

import models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase{
    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void openCarCreationForm() {
        click(By.xpath("//a[.=' Let the car work ']"));
    }

    public void fillCarCreationForm(Car car) {

        // click on location in dropdown
        selectByText(By.id("pickUpPlace"), car.getLocation());

        type(By.id("make"), car.getMake());
        type(By.id("model"), car.getModel());
        type(By.id("year"), car.getYear());
        type(By.id("engine"), car.getEngine());

        // selector chose from variants
        selectByText(By.id("fuel"), car.getFuel());
        selectByText(By.id("gear"), car.getGear());
        selectByText(By.id("wheelsDrive"), car.getWd());

        type(By.id("doors"), car.getDoors());
        type(By.id("seats"), car.getSeats());
        type(By.id("class"), car.getCarClass());
        type(By.id("fuelConsumption"), car.getFuelConsumption());
        type(By.id("serialNumber"), car.getCarRegistrationNumber());
        type(By.id("price"), car.getPrice());
        type(By.id("distance"), car.getDistanceIncluded());
        type(By.id("about"), car.getAbout());

        // uploading picture
        uploadPicture(By.xpath("//label[.='Add photos of your car']"), car.getPicture());

    }

    public void saveCarSubmit() {
        click(By.xpath("//button[.='Submit']"));
    }

    public void carAddedPopUpShowCar() {
        click(By.xpath("//button[.='Show car']"));
    }

    // photo
    // find element
    //click
    // attach photo - SendKey() - link on photo on comp
}
