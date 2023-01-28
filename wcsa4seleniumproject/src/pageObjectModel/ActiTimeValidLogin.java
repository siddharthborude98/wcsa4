package pageObjectModel;

import java.io.IOException;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		
		String usn = flib.readPropertyData(PROP_PATH, "Username");
		String pass = flib.readPropertyData(PROP_PATH, "Password");
		
		lp.ActiTimeInValidLoginPage(usn,pass);

		
		
	}
}
