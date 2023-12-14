import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.hukumonline.com/')

WebUI.maximizeWindow()

WebUI.getPageHeight()

WebUI.takeFullPageScreenshot()

WebUI.scrollToPosition(3000, 6086)

WebUI.sendKeys(findTestObject('test', [('value') : '//div[@id="__next"]/div/div[10]/div/footer/div[5]/a[7]']), Keys.chord(Keys.ENTER))
 
String satu =WebUI.getText(findTestObject('test',[('value'):'/html/body/div[2]/div[2]/div[6]/div/div[1]/a/div/div[1]']))

WebUI.verifyMatch(satu, 'Legal Content Developer (project based)', false)

WebUI.click(findTestObject('test', [('value') : '/html/body/div[2]/div[2]/div[6]/div/div[1]/a/div/div[1]']))

WebUI.switchToWindowUrl('https://glints.com/id/opportunities/jobs/legal-compliance-specialist-project-based/1c8bc34b-3bcc-4735-9a37-ce69483ba0c3')

WebUI.takeFullPageScreenshot()

String dua = WebUI.getText(findTestObject('test',[('value'):'/html/body/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/main/div[1]/div[2]/div/div[1]/h1']))

WebUI.verifyMatch(dua, 'Legal Compliance specialist (Project Based)', false)

WebUI.getUrl()

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()




