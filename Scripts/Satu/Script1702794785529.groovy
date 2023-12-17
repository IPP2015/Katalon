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

WebUI.navigateToUrl('https://www.btnproperti.co.id/tools/hitung-harga-properti')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('test', [('value') : '//*[@placeholder=\'Penghasilan Total\']']), Penghasilan_Total)

WebUI.setText(findTestObject('test', [('value') : '//*[@placeholder=\'Pengeluaran\']']), Pengeluaran)

WebUI.click(findTestObject('test', [('value') : '//*[@id=\'waktu\']']))

Tahun = tahun

WebUI.click(findTestObject('test', [('value') : ('//*[@value=\'' + Tahun) + '\']']))

WebUI.scrollToPosition(200, 250)

WebUI.click(findTestObject('test', [('value') : '//*[@class=\'btn btn-main px-5 d-block w-100\']']))

result0 = WebUI.getText(findTestObject('test', [('value') : '//*[@id="harga_hasil"]/h3']))
result1= result0.substring(3,result0.length())

WebUI.takeFullPageScreenshot(('C:\\Users\\Ilham Pandu Putra\\Downloads\\sss\\' + Tahun) + '.jpg')

rumus1 = (Penghasilan_Total.toInteger() - Pengeluaran.toInteger()) * (Tahun.toInteger() * 12 ) / 3

String inputString = result1
String regexPattern = "\\D"

String extractedValue = inputString.replaceAll(regexPattern, "")
println("hasil banding: " + extractedValue)
WebUI.verifyMatch(extractedValue.toString(), rumus1.toString(), false)

WebUI.closeBrowser()


