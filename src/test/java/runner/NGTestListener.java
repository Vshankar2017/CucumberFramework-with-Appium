package runner;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class NGTestListener implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult iTesResult)
	{
		System.out.println("one start");
	}
	@Override
	public void onTestSuccess(ITestResult iTesResult)
	{
		System.out.println("one onTestSuccess");
	}
	@Override
	public void onTestFailure(ITestResult iTesResult)
	{
		System.out.println("one onTestFailure");
	}
	@Override
	public void onTestSkipped(ITestResult iTesResult)
	{
		System.out.println("one onTestSkipped");
	}

}
