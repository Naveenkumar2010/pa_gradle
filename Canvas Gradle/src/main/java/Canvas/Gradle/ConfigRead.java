package Canvas.Gradle;



import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class ConfigRead {


	PropertyResourceBundle prop = (PropertyResourceBundle) ResourceBundle.getBundle("Canvas.Gradle.Config"); 

	// Get Config values from the instance of class
	public String getProperty(String key) 
	{
		// get the property value and print it out
		
		String value = prop.getString(key);
		System.out.println(value);
		if (value.length() > 0) 
		{
			return value;
		}
		return "";
	}	

	}
	