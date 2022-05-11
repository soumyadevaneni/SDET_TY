package Com.Vtiger.TestCases;

import org.testng.annotations.Test;

import Com.Vtiger.ObjectRepo.CreateNewOrgPage;
import Com.Vtiger.ObjectRepo.HomePage;
import Com.Vtiger.ObjectRepo.OrgInfopage;
import Com.Vtiger.generic.BaseTest;
import Com.Vtiger.generic.JavaUtil;
import Com.Vtiger.generic.TestData;

public class Tc01_CreateOrg  extends BaseTest {
	@Test
	public void createorg() throws InterruptedException {
		HomePage homePage=new HomePage(driver);
		homePage.getOrglink().click();
		OrgInfopage orgInfopage=new OrgInfopage(driver);
		orgInfopage.getCreateorgbtn().click();
		
		TestData testData=new TestData();
		JavaUtil javaUtil=new JavaUtil();
		
		String orgname=testData.getOrgname()+javaUtil.createRandomnumber();
		CreateNewOrgPage createnewOrgpage=new CreateNewOrgPage(driver);
		createnewOrgpage.getOrgname().sendKeys(orgname);

		createnewOrgpage.getSaveorgbtn().click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		homePage.getOrglink().click();
		orgInfopage.searchforOrg(orgname, "accountname");
		Thread.sleep(3000);
		String actualorgname=orgInfopage.getfirstOrg().getText();
		if(orgname.equals(actualorgname)) {
			System.out.println("Tc passes");
		}
		else {
			System.out.println("Tc fail");
		}
	}

}
