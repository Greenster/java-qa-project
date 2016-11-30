/**
 *   File Name: SignIn_Action.java<br>
 *
 *   Green, Lorne<br>
 *   Java <br>
 *   <br>
 *   Created: Nov 30, 2016
 *
 */

package com.automation.appmodule;

import org.openqa.selenium.*;

import com.automation.pageobjects.*;

/**
 * SignIn_Action //ADDD (description of class)
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
public class SignIn_Action {

	/**
	 * @param args
	 */
	public static void Execute(WebDriver driver) {

		Home_Page.lnk_SignIn(driver).click();

		LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");

		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");

		LogIn_Page.btn_LogIn(driver).click();

	}

}
