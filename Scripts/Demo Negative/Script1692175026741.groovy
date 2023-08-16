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

Mobile.tap(findTestObject('Demo Objects/android.widget.TextView - Skip'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Negative/android.widget.RelativeLayout'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Negative/android.widget.TextView - Buy New Health Insurance Policy'), 
    0)

Mobile.tap(findTestObject('Object Repository/Demo Negative/android.widget.TextView - Health Insurance'), 0)

Mobile.verifyElementText(findTestObject('Demo Negative/android.widget.TextView - Health Insurance (1)'), 'Health')

Mobile.tap(findTestObject('Object Repository/Demo Negative/android.widget.ImageButton'), 0)

Mobile.tap(findTestObject('Object Repository/Demo Negative/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Demo Negative/android.widget.ImageView'), 0)

Mobile.closeApplication()

