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

Mobile.startApplication('C:\\Users\\ThalluruSaiteja\\Downloads\\religare-production-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.TextView - Buy New Health Insurance Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.TextView - Care SupremeInsurance'), 0)

Mobile.setText(findTestObject('Object Repository/Demo Objects/android.widget.EditText - Mobile Number'), '8919396555', 0)

Mobile.setText(findTestObject('Object Repository/Demo Objects/android.widget.EditText - Your Name'), 'Katalon test', 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.Button - NEXT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Demo Objects/android.widget.Button - CALCULATE PREMIUM arrow'), 
    0)

Mobile.takeScreenshot('C:\\Users\\THALLU~1\\AppData\\Local\\Temp\\screenshot2560350017593562205.png')

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Demo Objects/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Demo Objects/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.RelativeLayout (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.TextView - Certified Provider Hospital Locator'), 
    0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.TextView - Locate Me'), 0)

Mobile.takeScreenshot('C:\\Users\\THALLU~1\\AppData\\Local\\Temp\\screenshot3038980289462773016.png')

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.TextView - 080-49004900'), 0)

Mobile.takeScreenshot('C:\\Users\\THALLU~1\\AppData\\Local\\Temp\\screenshot671541079264956420.png')

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Objects/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Demo Objects/android.widget.ImageButton'), 0)

Mobile.closeApplication()

