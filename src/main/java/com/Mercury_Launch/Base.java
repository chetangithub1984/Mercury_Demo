package com.Mercury_Launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Base {

    WebDriver driver;
    String userName = getAlphaNumericString(6) + "@xyz.com";

    static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

    public WebDriver getWebDriver() {


        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.get("http://newtours.demoaut.com/");
        driver.get("http://www.demoqa.com/automation-practice-form");
        return driver;
    }

    public void registration() {
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys(getAlphaNumericString(6));
        driver.findElement(By.name("lastName")).sendKeys(getAlphaNumericString(3));
        driver.findElement(By.name("phone")).sendKeys("21313819");
        System.out.println("UserName is - " + userName);
        driver.findElement(By.name("userName")).sendKeys(userName);
        driver.findElement(By.name("address1")).sendKeys(getAlphaNumericString(8));
        driver.findElement(By.name("city")).sendKeys("Pune");
        driver.findElement(By.name("state")).sendKeys("MH");
        driver.findElement(By.name("postalCode")).sendKeys("12345");
        driver.findElement(By.name("country")).sendKeys("INDIA");
        driver.findElement(By.name("email")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("confirmPassword")).sendKeys("123456");
        driver.findElement(By.name("register")).click();

    }

    public void login() {

        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.name("userName")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("login")).click();

    }

    public void flightBooking() throws InterruptedException {
        driver.findElement(By.name("tripType")).click();
        driver.findElement(By.name("findFlights")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("reserveFlights")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("passFirst0")).sendKeys("Chetan");
        driver.findElement(By.name("passLast0")).sendKeys("Patel");
        driver.findElement(By.name("creditnumber")).sendKeys("432525");
        driver.findElement(By.name("buyFlights")).click();
    }

    public void toolsQaformFillup() {

        driver.findElement(By.id("firstName")).sendKeys("Chetan");
        driver.findElement(By.id("lastName")).sendKeys("Patel");
        driver.findElement(By.id("userEmail")).sendKeys("abc@dj.com");
        driver.findElement(By.xpath("//*[@for='gender-radio-1']")).click();
        driver.findElement(By.id("userNumber")).sendKeys("3214321413");
        //driver.findElement(By.id("hobbies-checkbox-2")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("abc def ght ");
        WebElement state = driver.findElement(By.xpath("//*[contains(text(),'Select State')]"));
        state.click();
        driver.findElement(By.xpath("//*[contains(text(),'Uttar Pradesh')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Select City')]")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Agra')]")).click();
		driver.findElement(By.id("submit")).click();


		/*Select oselect = new Select(state);
		oselect.selectByIndex(0);*/


    }

}
