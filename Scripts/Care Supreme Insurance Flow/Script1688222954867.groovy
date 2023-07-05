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

Mobile.startApplication('C:\\Users\\ThalluruSaiteja\\Downloads\\religare-production-debug.apk', true)

Mobile.tap(findTestObject('android.widget.TextView - SKIP'), 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.TextView - Buy New Health Insurance Policy'), 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.TextView - Care SupremeInsurance'), 0)

Mobile.setText(findTestObject('Object Repository/Insurance/android.widget.EditText - Mobile Number'), '8919396555', 0)

Mobile.setText(findTestObject('Object Repository/Insurance/android.widget.EditText - Your Name'), 'Test', 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.Button - NEXT'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Insurance/android.widget.Button - CALCULATE PREMIUM arrow'), 
    0)

Mobile.takeScreenshot('C:\\Users\\THALLU~1\\AppData\\Local\\Temp\\screenshot793950333426049985.png')

Mobile.verifyElementExist(findTestObject('Object Repository/Insurance/android.widget.TextView - Get a Free Quote'), 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.ImageButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Insurance/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Insurance/android.widget.ImageView'), 0)

Mobile.closeApplication()

