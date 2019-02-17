package com.testautomation.Listeners;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.testautomation.Utility.ExcelHandler;
import com.testautomation.Utility.PropertiesFileReader;
import com.testautomation.Utility.TestDataHandler;

public class ITestListenerImpl extends ExtentReportListener implements ITestListener
{
	private static ExtentReports extent;

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
//		PropertiesFileReader obj= new PropertiesFileReader();	
//		TestDataHandler testdata=new TestDataHandler();
//		Map<String,String> testData=testdata.getTestDataInMap();
//		
//		Properties properties;
//		try {
//			properties = obj.getProperty();
//			ExcelHandler.UpdateTestResultsToExcel( properties.getProperty("testdatafilepath"), 
//					properties.getProperty("sheetname"),"PASS",testData.get("TestCaseId"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  		
//		
		
		System.out.println("PASS");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("FAIL");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("SKIP");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Execution started on UAT env...");
		extent= setUp();
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution completed on UAT env...");
		extent.flush();		
		System.out.println("Generated Report. . .");	
		
	}
	

}
