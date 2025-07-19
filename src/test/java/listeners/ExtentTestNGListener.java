package listeners;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.*;

public class ExtentTestNGListener implements ITestListener{
	private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    public void onStart(ITestContext context) {
    	ExtentSparkReporter spark = new ExtentSparkReporter("reports/result.html");
       // ExtentHtmlReporter reporter = new ExtentHtmlReporter("reports/index.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    public void onTestStart(ITestResult result) {
        test.set(extent.createTest(result.getMethod().getMethodName()));
    }

    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.get().fail(result.getThrowable());
    }

    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
