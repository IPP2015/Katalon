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

WebUI.navigateToUrl('https://demoqa.com/')

WebUI.maximizeWindow()

WebUI.scrollToPosition(300, 400)

WebUI.click(findTestObject('test', [('value') : '/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[3]/h5']))

WebUI.scrollToPosition(100, 150)

WebUI.click(findTestObject('test', [('value') : '/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li']))

WebUI.setText(findTestObject('test', [('value') : '//*[@id="firstName"]']), findTestData('New Test Data').getValue(1, 1))

WebUI.setText(findTestObject('test', [('value') : '/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li']), 
    findTestData('New Test Data').getValue(2, 1))

WebUI.setText(findTestObject('test', [('value') : '/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li']), 
    '')

WebUI.setText(findTestObject('test', [('value') : '/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li']), 
    '')

