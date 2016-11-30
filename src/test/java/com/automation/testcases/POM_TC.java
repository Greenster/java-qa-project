/**
 *   File Name: POM_TC.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 30, 2016
 *
 */

package com.automation.testcases;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;

import com.automation.pageobjects.*;

/**
 * POM_TC //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Green, Lorne
 * @version 1.0.0
 * @since 1.0
 *
 */
public class POM_TC {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.store.demoqa.com");

		// Use page Object library now

		Home_Page.lnk_MyAccount(driver).click();

		LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");

		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");

		LogIn_Page.btn_LogIn(driver).click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		Home_Page.lnk_LogOut(driver).click();

		driver.quit();

	}

}
