package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			//Provide user-name
			WebElement username = driver.findElement(By.id("user-name"));
			username.sendKeys("standard_user");
			//provide password
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("secret_sauce");
			
			WebElement submit = driver.findElement(By.id("login-button"));
			submit.click();
			WebElement addtocart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
			addtocart.click();
			WebElement addtocart2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
			addtocart2.click();
			WebElement productcheck = driver.findElement(By.className("shopping_cart_badge"));
			productcheck.click();
			WebElement checkout = driver.findElement(By.id("checkout"));
			checkout.click();
			WebElement firstname = driver.findElement(By.id("first-name"));
			firstname.sendKeys("shah poran");
			WebElement lastname = driver.findElement(By.id("last-name"));
			lastname.sendKeys("vhuiyan");
			WebElement postalcode = driver.findElement(By.id("postal-code"));
			postalcode.sendKeys("1230");
			WebElement click = driver.findElement(By.id("continue"));
			click.click();
			WebElement finish = driver.findElement(By.id("finish"));
			finish.click();
			WebElement back = driver.findElement(By.id("back-to-products"));
			back.click();
			

	}

}
