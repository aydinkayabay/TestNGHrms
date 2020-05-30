package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseClass;
import com.utils.CommonMethods;

public class sauceDemoLoginPage extends CommonMethods{
	

	@FindBy(id="user-name")
	public WebElement userNameTextBox;

	@FindBy(id="password")
	public  WebElement passwordTextBox;
	 
	@FindBy(xpath="//input[@class='btn_action']")
	public WebElement loginButton;

	@FindBy()
	
	public sauceDemoLoginPage() {
		PageFactory.initElements(driver,this);
	}

}
