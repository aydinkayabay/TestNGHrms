package com.hrms.testcases;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;

public class sauceParameterDemo extends CommonMethods{
	@Parameters({"username","password"})
	@Test
	public void login(String username,String password) {
		
		
		
	}

}
