package pages;

 import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(){
        driver.get("http://qazando.com.br/curso.html");
        esperaElementoPresente(By.id("btn-ver-cursos"),10);
        Assert.assertEquals(true, driver.findElement(By.id("btn-ver-cursos")).isDisplayed());
    }
    public void scrollDown () throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0, 10000)");
        Thread.sleep(3000);
    }
    public void preencheEmail() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("alexhg2000@gmail.com");
        Thread.sleep(3000);
    }
    public void clickGanharDesconto(){
        driver.findElement(By.id("button")).click();
    }
    public void verificarCupomDesconto(){
        String texto_Cupom = driver.findElement(By.cssSelector("#cupom > h2 > span")).getText();
        Assert.assertEquals("O cupom esta errado", "QAZANDO15OFF", texto_Cupom);
    }
}
