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

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('test', [('value') : '//*[@id="desktop"]/div[1]/div/div/input']), 'Peraturan Pemerintah Nomor 40 Tahun 2006')

WebUI.sendKeys(findTestObject('test', [('value') : '//*[@id="desktop"]/div[1]/div/div/input']), Keys.chord(Keys.ENTER))

String satu = WebUI.getText(findTestObject('test', [('value') : '//*[@title="Peraturan Pemerintah <em>Nomor</em> <em>40</em> <em>Tahun</em> <em>2006</em>"]']))

WebUI.takeFullPageScreenshot()

WebUI.verifyMatch(satu, 'Peraturan Pemerintah Nomor 40 Tahun 2006', false)

WebUI.verifyTextPresent('Peraturan Pemerintah Nomor 40 Tahun 2006', false)

String dua = WebUI.getText(findTestObject('test', [('value') : '//*[@class="css-1iiildh"]']))
 
 WebUI.verifyMatch(dua, 'TATA CARA PENYUSUNAN RENCANA PEMBANGUNAN NASIONAL', false)
 
 WebUI.verifyTextPresent('TATA CARA PENYUSUNAN RENCANA PEMBANGUNAN NASIONAL', false)
 
 String tiga = WebUI.getText(findTestObject('test', [('value') : '//*[@class="css-1w49yes"]']))
  
  WebUI.verifyMatch(tiga, 'melaksanakan ketentuan Pasal 27 ayat (1) Undang-Undang Nomor 25 Tahun 2004 tentang Sistem Perencanaan Pembangunan Nasional perlu menetapkan Peraturan Pemerintah tentang Tata Cara Penyusunan Rencana Pembangunan', false)
  
  WebUI.verifyTextPresent('melaksanakan ketentuan Pasal 27 ayat (1) Undang-Undang Nomor 25 Tahun 2004 tentang Sistem Perencanaan Pembangunan Nasional perlu menetapkan Peraturan Pemerintah tentang Tata Cara Penyusunan Rencana Pembangunan', false)
   
  String empat = WebUI.getText(findTestObject('test', [('value') : '/html/body/div/main/div[5]/div/div/div[2]/div[1]/div[2]/article[1]/div[2]/p[1]']))
   
   WebUI.verifyMatch(empat, 'Ditetapkan: 29 November 2006', false)
   
   WebUI.verifyTextPresent('Ditetapkan: 29 November 2006', false)
   
   String lima = WebUI.getText(findTestObject('test', [('value') : '/html/body/div/main/div[5]/div/div/div[2]/div[1]/div[2]/article[1]/div[2]/p[2]']))
	
	WebUI.verifyMatch(lima, 'Berlaku: 29 November 2006', false)
	
	WebUI.verifyTextPresent('Berlaku: 29 November 2006', false)
	String enam = WebUI.getText(findTestObject('test', [('value') : '/html/body/div/main/div[5]/div/div/div[2]/div[1]/div[2]/article[1]/p']))
	
	WebUI.verifyMatch(enam, 'Status: Login Atau Berlangganan Untuk Akses Fitur Ini', false)
	
	WebUI.verifyTextPresent('Status: Login Atau Berlangganan Untuk Akses Fitur Ini', false)
	
	WebUI.closeBrowser()
	
   
   
	
