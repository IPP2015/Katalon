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

WebUI.navigateToUrl('https://www.linkedin.com/')

WebUI.click(findTestObject('Object Repository/link/Page_LinkedIn Log In or Sign Up/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/link/Page_LinkedIn Login, Sign in  LinkedIn/input_Sign in_session_key'), 
    findTestData('New Test Data').getValue(1, 1))

WebUI.setEncryptedText(findTestObject('Object Repository/link/Page_LinkedIn Login, Sign in  LinkedIn/input_Sign in_session_password'), 
    'pqeuzKH9y4loX6Hje5BMig==')

WebUI.click(findTestObject('Object Repository/link/Page_LinkedIn Login, Sign in  LinkedIn/button_Sign in'))

WebUI.clickImage(findTestObject('Page_Feed  LinkedIn/svg_Tulis Pesan_mercado-match'))

WebUI.click(findTestObject('link/Page_Feed  LinkedIn/span_Home'))

WebUI.click(findTestObject('link/Page_Feed  LinkedIn/span_Jaringan Saya'))

WebUI.click(findTestObject('link/Page_Feed  LinkedIn/span_Pekerjaan'))

WebUI.click(findTestObject('link/Page_Feed  LinkedIn/span_Pesan'))

WebUI.click(findTestObject('link/Page_Feed  LinkedIn/span_Notifikasi'))

WebUI.click(findTestObject('link/Page_Feed  LinkedIn/span_Saya'))

WebUI.click(findTestObject('link/Page_ilham pandu putra  LinkedIn/a_Logout'))

WebUI.closeBrowser()

