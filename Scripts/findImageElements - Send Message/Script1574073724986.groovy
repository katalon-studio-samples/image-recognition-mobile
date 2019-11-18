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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement

Mobile.startApplication('ApiDemos-WhiteScreen.apk', true)

Mobile.tap(findTestObject('btn_OS_Menu'), 0)

Mobile.tap(findTestObject('btn_SMS_Menu'), 0)

Mobile.tap(findTestObject('chk_Enable_Broadcast_Receiver'), 0)

Mobile.setText(findTestObject('txt_SMS_Recipient'), '0915333030', 0)

Mobile.setText(findTestObject('txt_SMS_Content'), 'test', 0)

'Finds all mobile elements that are recognized by the given image.'
List<WebElement> elements = Mobile.findImageElements('Screenshots/send.png')

println('Number of elements found: ' + elements.size())

Mobile.tap(findTestObject('btn_Send'), 0)

Mobile.verifyElementText(findTestObject('lbl_Message_Sent'), 'Message sent!')

Mobile.closeApplication()

