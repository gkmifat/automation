package automation.gico.config;

public class Util {
	/* You can change the Path of FireFox based on your environment here */
	public static final String FIREFOX_DRIVER_PATH = "F:\\Software Driver\\Firefox Driver\\geckodriver.exe";
	
	public static final String CHROME_DRIVER_PATH = "F:\\Ifat J2EE Workspace\\Jars\\Selenium\\latest chrome\\chromedriver_win32\\chromedriver.exe";       
	
	
	public static final String CHROME_PATH = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
	//C:\Program Files\Mozilla Firefox
	// Setting Base URL
	public static final String BASE_URL = "http://www.demo.guru99.com/";
    
	// Time to wait when searching for a GUI element 
	public static final int WAIT_TIME = 30; 
	
	public static final String BROWSER = "chrome";
	
	public static final String CHROME = "chrome";
	public static final String FIREFOX = "firefox";
	public static final String IE = "iexplorer";
	public static final String EDGE = "edge";

	
    public static final String PATTERN = ":";
    public static final String FIRST_PATTERN = "mngr";
    public static final String SECOND_PATTERN = "[0-9]+";

	// Valid account for login
	public static final String USER_NAME = "mngr1336";
	public static final String PASSWD = "dAnavUq";
	
	// You can change the information of your data file here
	public static final String FILE_PATH = "F:\\Ifat J2EE Workspace\\guru99\\src\\test\\java\\testData.xls"; // File Path
	public static final String SHEET_NAME = "Data"; // Sheet name
	public static final String TABLE_NAME = "testData"; // Name of data table



	// Expected output
	public static final String EXPECT_TITLE = "Guru99 Bank Manager HomePage";
	public static final String EXPECT_ERROR = "User or Password is not valid";
}
