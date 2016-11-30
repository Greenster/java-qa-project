/**
 *   File Name: Home_Page.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 30, 2016
 *
 */

package com.automation.pageobjects;

import org.openqa.selenium.*;

/**
 * Home_Page //ADDD (description of class)
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
public class Home_Page {

	private static WebElement element = null;

	public static WebElement lnk_LogOut(WebDriver driver) {

		element = driver.findElement(By.id("account_logout"));

		return element;

	}

	public static WebElement lnk_MyAccount(WebDriver driver) {

		element = driver.findElement(By.id("account"));

		return element;

	}

	/**
	 * @param driver
	 * @return
	 */
	public static WebElement lnk_SignIn(WebDriver driver) {

		return null;
	}
}
