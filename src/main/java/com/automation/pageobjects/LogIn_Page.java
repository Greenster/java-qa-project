/**
 *   File Name: LogIn_Page.java<br>
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
 * LogIn_Page //ADDD (description of class)
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
public class LogIn_Page {

	private static WebElement element = null;

	public static WebElement btn_LogIn(WebDriver driver) {

		element = driver.findElement(By.id("login"));

		return element;

	}

	public static WebElement txtbx_Password(WebDriver driver) {

		element = driver.findElement(By.id("pwd"));

		return element;

	}

	public static WebElement txtbx_UserName(WebDriver driver) {

		element = driver.findElement(By.id("log"));

		return element;

	}

}
