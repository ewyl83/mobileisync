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

Mobile.startExistingApplication('com.cubevalue.bisync&hl=en&gl=US', FailureHandling.STOP_ON_FAILURE)

//Mobile.startApplication('C:\\Users\\ylwon\\Downloads\\Bisync Operator_1.0.25_apkcombo.com.apk', true)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Email'), 'ms@cubevalue.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Password'), '12345678', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button'), 0)

Mobile.tap(findTestObject('android.widget.ButtonSkip'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.view.View (2)'), 0)

Mobile.tap(findTestObject('android.view.ViewQty'), 0)

Mobile.setText(findTestObject('android.widget.EditTextQty'), '5', 10)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('android.widget.ButtonPlaceOrder'), 0)

//Mobile.tap(findTestObject('android.widget.ButtonViewOrderPlaced'), 0)

//Sometimes missing pop-up message about purchase order number with cancel and ok buttons
Mobile.tap(findTestObject('android.widget.ButtonOK'), 0)

Mobile.tap(findTestObject('android.widget.ButtonViewOrder'), 0)

Mobile.closeApplication()

