package Com.Vtiger.generic;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ProppertyFiles 
	{
		public String readDatafrompropertyfile(String key) throws IOException {
			FileInputStream fis = new FileInputStream("D:\\KCSM12\\TYSS_Soumi\\Vtiger.properties");

			Properties prop = new Properties();
			prop.load(fis);

			return	prop.getProperty(key);

		}


}
	

	


	

