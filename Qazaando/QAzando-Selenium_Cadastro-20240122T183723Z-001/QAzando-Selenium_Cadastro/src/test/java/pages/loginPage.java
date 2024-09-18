package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class loginPage extends Utils {

    WebDriver driver;
    private By create_email_field = By.id("email_create");
    private By create_email_button = By.id("submitCreate");

    public loginPage(WebDriver driver) {

        this.driver = driver;
    }

    public void acessarTelaLogin(){
         driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
         waitBeElementPresent(create_email_field, 20);
    }

    public void preencherEmail(){
        driver.findElement(create_email_field).sendKeys(getRandomEmail());

    }

    public void clicarBotaoCriarConta(){
        driver.findElement(create_email_button).click();
    }
}
