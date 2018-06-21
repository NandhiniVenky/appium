import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DocTalkTest {
	DocTalkCommon tc = new DocTalkCommon();
	
	@BeforeTest
	@Parameters({"deviceObjectName","bootStrapPort"})
	public void launchApp(@Optional("android1")String deviceObjectName,@Optional("5789")int bootStrapPort)throws Exception{
		tc.setUp();
	}
	@Test(priority = 0)
	@Parameters({"reproName"})
	public void enterValidRepositoryName(@Optional("vikramvi/AppiumSerenityPOC")String reproName)throws Exception{
		tc.enterReproName(reproName);
	}
   @Test(priority = 1)
   @Parameters({"reproName"})
   public void enterInvalidRepositoryName(@Optional("vikramvi/AppiumSerenity")String reproName)throws Exception{
		tc.enterReproName(reproName);
   }
   @Test(priority = 2)
   @Parameters({"reproName"})
   public void enterRandomRepositoryName(@Optional("gscr456")String reproName)throws Exception{
		tc.enterReproName(reproName);
   }
}
