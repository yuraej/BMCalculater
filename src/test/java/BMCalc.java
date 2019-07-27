import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BMCalc {
    @Test
    public void Test1 (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("100");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        String result = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals("Your category is Obese", result);
        driver.quit();
    }
    @Test
    public void Test2 (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://healthunify.com/bmicalculator");
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        String result = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals("Your category is Normal", result);
        driver.quit();
    }
    @Test
    public void Test3 (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://healthunify.com/bmicalculator");
        driver.findElement(By.name("opt1")).sendKeys("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        String result = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals("Your category is Normal", result);
        driver.quit();
    }
    @Test
    public void Test4 (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://healthunify.com/bmicalculator");
        driver.findElement(By.name("opt1")).sendKeys("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("opt2")).sendKeys("6'");
        driver.findElement(By.name("opt3")).sendKeys("5''");
        driver.findElement(By.name("cc")).click();
        String result = driver.findElement(By.name("desc")).getAttribute("value");
        assertEquals("Your category is Normal", result);
        driver.quit();
    }
    @Test
    public void Test5 (){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://healthunify.com/bmicalculator");
        driver.findElement(By.name("opt1")).sendKeys("pounds");
        driver.findElement(By.name("wg")).clear();
        driver.findElement(By.name("wg")).sendKeys("80");
        driver.findElement(By.name("ht")).sendKeys("180");
        driver.findElement(By.name("cc")).click();
        String result = driver.findElement(By.name("us")).getAttribute("value");
        assertEquals("11.41", result);
        driver.quit();
    }
}
