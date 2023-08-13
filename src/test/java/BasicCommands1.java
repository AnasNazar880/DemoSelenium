import org.obs.utility.RandomData1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicCommands1 extends Base1 {
    @Test
    public void verifyTitle() {
        driver.get("https://demowebshop.tricentis.com/");
        String actualTitle = driver.getTitle();
        String expectTitle = "Demo Web Shop";
        Assert.assertEquals(actualTitle, expectTitle, "title is not verified");
    }

    @Test
    public void verifyLogin() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//div[@class='header-links']//a[@class='ico-login']"));
        login.click();
        String emailId1 = "muhammadanas.n@gmail.com";
        String passWord1 = "Hyrin@2023";
        WebElement emailId = driver.findElement(By.xpath("//input[@id='Email']"));
        emailId.sendKeys(emailId1);
        WebElement passWord = driver.findElement(By.xpath("//input[@id='Password']"));
        passWord.sendKeys(passWord1);
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
        WebElement userAccountEmail = driver.findElement(By.xpath("//div[@class='header-links']//a[@class='account']"));
        String actualEmailId = userAccountEmail.getText();
        Assert.assertEquals(actualEmailId, emailId1, "login denied");
    }

    @Test
    public void verifyWebElementCommands() {
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement registerButton = driver.findElement(By.id("register-button"));
        String regButton = registerButton.getTagName();
        String idAttributeValue = registerButton.getAttribute("id");
        String valueAttributeValue = registerButton.getAttribute("value");
        String nameAttributeValue = registerButton.getAttribute("name");
        String classAttributeValue = registerButton.getAttribute("class");
        System.out.println("idAttributeValue :" + idAttributeValue);
        System.out.println("tag name of the button:" + regButton);
        System.out.println("valueAttributeValue:" + valueAttributeValue);
        System.out.println("nameAttributeValue:" + nameAttributeValue);
        System.out.println("classAttributeValue:" + classAttributeValue);
    }
    @Test
    public void verifyRegisterButton(){
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement registerButton = driver.findElement(By.id("register-button"));
        boolean displayRegButton=registerButton.isDisplayed();
        boolean enableRegButton=registerButton.isEnabled();
        System.out.println("displayed:"+displayRegButton);
        Assert.assertTrue(displayRegButton,"register button not displayed");
        System.out.println("enabled:"+enableRegButton);
        Assert.assertTrue(enableRegButton,"register button not enabled");

    }
    @Test
    public void verifyCheckBox(){
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement maleCheckBox=driver.findElement(By.id("gender-male"));
        boolean notClickedMale=maleCheckBox.isSelected();
        Assert.assertFalse(notClickedMale,"select male checkbox");
        System.out.println("the status of the checkbox before clicking:"+notClickedMale);
        maleCheckBox.click();
        boolean afterClickingMale=maleCheckBox.isSelected();
        Assert.assertTrue(afterClickingMale,"male check box not selected");
        System.out.println("the status of the male checkbox after clicking:"+afterClickingMale);
    }

}
