package Com.Vtiger.TestCases;

import org.testng.annotations.Test;

import Com.Practise.Browser;
import Com.Vtiger.ObjectRepo.CreateNewOrgPage;
import Com.Vtiger.ObjectRepo.HomePage;
import Com.Vtiger.ObjectRepo.OrgInfopage;
import Com.Vtiger.generic.BaseTest;
import Com.Vtiger.generic.JavaUtil;
import Com.Vtiger.generic.TestData;
import Com.Vtiger.generic.WebDriverUtil;

public class Tc03_CreateOrg_DD  extends BaseTest{
 @Test
 public void createorg_dd() throws Throwable   {
		HomePage homePage=new HomePage(driver);
		homePage.getOrglink().click();
  
		OrgInfopage orgInfoPage=new OrgInfopage(driver);
		
		orgInfoPage.getCreateorgbtn().click();
		
		TestData testdata =new TestData();
		 JavaUtil javautil=new JavaUtil();
		 String orgname=testdata.getOrgname()+javautil.createRandomnumber();
		  CreateNewOrgPage createNewOrgPage=new CreateNewOrgPage(driver);
		  createNewOrgPage .getOrgname().sendKeys(orgname);
		  Thread.sleep(2000);
		     WebDriverUtil webDriverUtil = new WebDriverUtil(driver);
		     webDriverUtil.selectValuefromdd("Active",createNewOrgPage.getRating());
		  webDriverUtil.selectValuefromdd(createNewOrgPage.getIndustry(), "Education");
		 webDriverUtil.selectValuefromdd(createNewOrgPage.getType(), 3);
		 createNewOrgPage.getSaveorgbtn().click();
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 homePage.getOrglink().click();
		 orgInfoPage.searchforOrg(orgname, "accountname");
		 Thread.sleep(4000);
		 String actualorgname=orgInfoPage.getfirstOrg().getText();
		 if(orgname.equals(actualorgname))
		 {
			 System.out.println("Tc Passes");
		 }
		 else {
			 System.out.println("Tc fail");
		 }
	  }


}
 

