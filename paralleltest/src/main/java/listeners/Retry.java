package listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{
	
	int retrymaxcount = 3;
	int retrycount =0;

	@Override
	public boolean retry(ITestResult result) {
		if(retrycount < retrymaxcount) {
		
			if(!result.isSuccess()) {
				retrycount++;
				
				return true;
				
			}else {
				return false;
			}
	    }
		return false;
	}

}
