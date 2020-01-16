package Canvas.Gradle;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Screenshot {
	
	public void takeScreenshot() throws Exception {
        java.io.File scrFile = ((TakesScreenshot)Browser.getInstance()).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(scrFile, new File("C:\\screenshot.png")));
    }

}
