import org.obs.utility.RandomData1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
    public void verifyRegisterButton() {
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement registerButton = driver.findElement(By.id("register-button"));
        boolean displayRegButton = registerButton.isDisplayed();
        boolean enableRegButton = registerButton.isEnabled();
        System.out.println("displayed:" + displayRegButton);
        Assert.assertTrue(displayRegButton, "register button not displayed");
        System.out.println("enabled:" + enableRegButton);
        Assert.assertTrue(enableRegButton, "register button not enabled");

    }

    @Test
    public void verifyCheckBox() {
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement maleCheckBox = driver.findElement(By.id("gender-male"));
        boolean notClickedMale = maleCheckBox.isSelected();
        Assert.assertFalse(notClickedMale, "select male checkbox");
        System.out.println("the status of the checkbox before clicking:" + notClickedMale);
        maleCheckBox.click();
        boolean afterClickingMale = maleCheckBox.isSelected();
        Assert.assertTrue(afterClickingMale, "male check box not selected");
        System.out.println("the status of the male checkbox after clicking:" + afterClickingMale);
    }

    @Test
    public void verifyNavigationCommands() throws InterruptedException {
        driver.navigate().to("https://www.obsqurazone.com/");
        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement mobileNumber = driver.findElement(By.xpath("//input[@class='accountLogin-input accountLogin-input-mobile']"));
        mobileNumber.sendKeys("7907779058");
        driver.navigate().refresh();
        driver.navigate().to("https://www.obsqurazone.com/software-testing-courses-kerala/");

    }
    @Test
    public void verifySelectGender(){
        driver.get("");//The driver.get method navigates to the registration page.
        List<WebElement>genders=driver.findElements(By.xpath("//a[@style='margin-left: 5px;color: #0000ee;text-decoration: underline;']"));//The driver.findElements method is used to locate all elements with the name "Gender" (assuming these are radio buttons for gender selection).
        selectGender("male",genders);
    }
    public void selectGender(String gender,List<WebElement>genders){
        for(int i=0;i<genders.size();i++){//Iterates through the list of WebElements.
            WebElement gen=genders.get(i);
            String idAttributeValue=gen.getAttribute("id");//For each element, it checks if the "id" attribute value contains the substring "gender".
            if(idAttributeValue.contains("gender")){
                gen.click();
                break;
            }
        }
    }
    @Test//using Switch
    public void verifyPanelSelection() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        List<WebElement> panels = driver.findElements(By.xpath("//a[@style='margin-left: 5px;color: #0000ee;text-decoration: underline;']"));
        selectPanel("Flights", panels);
    }

    public void selectPanel(String panel, List<WebElement> panels) {
        for (WebElement panelElement : panels) {
            String tagValue = panelElement.getText();

            switch (panel) {
                case "Flights":
                    if (tagValue.contains("Flights")) {
                        panelElement.click();
                    }
                    break;
                case "Home":
                    if (tagValue.contains("Home")) {
                        panelElement.click();
                    }
                    break;
                // Add more cases for other panels as needed
                default:
                    // Handle case when panel is not found
            }
        }}

}
