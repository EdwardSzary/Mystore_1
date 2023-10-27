package Mystore;
import io.cucumber.datatable.DataTable;
import io.cucumber.datatable.UndefinedDataTableTypeException;
import io.cucumber.java.en.And;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class StepDefinition {

    private static WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    //@AfterAll
    //public static void teardown() {
       // driver.quit();
    //}

    @Given("User is logged in")
    public void user_is_logged_in() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php");

        WebElement element;
        element = driver.findElement(By.className("user-info"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        element.click();
        WebElement email = driver.findElement(By.id("field-email"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        email.click();
        email.sendKeys("gkqvuzdwzxoltwlnij@ckptr.com");
        driver.findElement(By.id("field-password")).sendKeys("qwerty1");
        WebElement sign = driver.findElement(By.id("submit-login"));
        sign.click();

    }
    @When("add address is clicked")
    public void add_address_is_clicked() {

        WebElement address;
        address = driver.findElement(By.xpath("//*[@id=\"footer_account_list\"]/li[4]/a"));
        address.click();
        WebElement clkaddress;
        clkaddress = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/a"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clkaddress.click();
    }
    @Then("fill in credentials with <alias>")
    public void fill_in_credentials_with(String alias){

        driver.findElement(By.className("col-md-6")).sendKeys(alias);
        //alias.sendKeys(Userdata.cell(1,1));
    }
    @And("submit and close the page")
        public void ubmit_and_close_the_page() {
            driver.quit();
    }
}
