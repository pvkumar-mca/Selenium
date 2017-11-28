package sdhc;

import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;


public class sdhc 

{
	
	public static void main(String[] args) 
	
	{ 
		
		Functions s = new Functions();
		
		try {
			
			System.setProperty("webdriver.chrome.driver", "C:/D Drive/Java/Project/Browser Servers/chromedriver.exe");
			
			int startRow = Integer.parseInt(JOptionPane.showInputDialog("Enter Starting Row Number to get Data from Excel"));; //Initilize starting excel Row
			
			int EndRow = Integer.parseInt(JOptionPane.showInputDialog("Enter Ending Row Number Number to get Data from Excel"));// Initilize ending excel Row
			
			for(int i=startRow;i<=EndRow;i++)
								
			{
			
			WebDriver driver = new ChromeDriver();
				
			driver.get("https://waitlist-sdhcportal.cs32.force.com/RADWL/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//************************PERSONAL INFORMATION SECTION******************************************************************************************
			
			//NEW REGISTRATION LINK
												
			s.click(driver, "regAccount");
						
			//USERNAME
			
			String UserName = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i, 0); 
					
			s.enterdata(driver, "HRusrnameId", UserName);
									
			//FIRST NAME
			
			String FirstName = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1",i,1);
			
			s.enterdata(driver, "HRFnmId", FirstName);
			
			//LAST NAME
			
			String LastName = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1" ,i,2);	
			
			s.enterdata(driver, "HRLnmId", LastName);
			
			//E-MAIL
			
			String Email = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1",i, 0);	
			
			s.enterdata(driver, "HRemailId", Email);
			
			//SSN
			
			s.click(driver, "donotKnow");
			
			//GENDER
			
			String Gender = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1",i,5);
			
			s.dropdownselect(driver, "HRgenderId", Gender);
									
			//MONTH
			
			String Month = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1",i,6);	
			
			s.dropdownselect(driver, "HRmonthId", Month);
						
			//DAY
			
			String Day = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1",i,7);	
			
			s.dropdownselect(driver, "dateday", Day);
							
			//YEAR
			
			String Year = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1",i,8);	
			
			s.dropdownselect(driver, "dateYear", Year);
			
			//PHONE
			
			String Phone = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,9);	
			
			s.enterdata(driver, "HRphoneId", Phone);
			
				
//************************SECURITY QUESTIONS SECTION******************************************************************************************
				
			//QUESTION 1
			
			String Ques1 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,11);	

			s.dropdownselect(driver, "HRscques1Id", Ques1);
					
			//ANS 1
			
			String Ans1 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,12);	
			
			s.enterdata(driver, "HRscans1Id", Ans1);
								
			//QUESTION 2
			
			String Ques2 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,13);	
			
			s.dropdownselect(driver, "HRscques2Id", Ques2);
			
			//ANS 2
			
			String Ans2 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,14);	
			
			s.enterdata(driver, "HRscans2Id", Ans2);
						
			//QUESTION 3
			
			String Ques3 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,15);	
			
			s.dropdownselect(driver, "HRscques3Id", Ques3);
					
			//ANS 3
			
			String Ans3 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,16);	
			
			s.enterdata(driver, "HRscans3Id", Ans3);
			
//************************RESIDENTIAL ADDRESS******************************************************************************************
			
	/*		//RESISTREET 
		 	
		 	String ResiStreet = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","Profile", i,17);	
			
			s.enterdata(driver, "HRAltStreetId", ResiStreet);
			
			//RESICITY
			
			String ResiCity = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","Profile", i,18);	
			
			s.enterdata(driver, "HRAltCityId", ResiCity);
			
			//RESISTATE 
			
			String ResiState = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","Profile", i,19);	
			
			s.dropdownselect(driver, "HRAltStateId", ResiState);
			
			//RESIZIP 
			
			String ResiZip = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","Profile", i,20);	
			
			s.enterdata(driver, "HRAltZipcodeId", ResiZip);*/
			 
//************************HOMELESS****************************************************************************************************************************
			
			//HOMELESS
			
			s.click(driver, "Homeless");
					
			//HOMELESS STREET 
			
			String MailStreet = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,22);	
			
			s.enterdata(driver, "HRStreetId", MailStreet);
			 					
			// HOMELESS STATE 
			
			String MailState = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,23);	
			
			s.dropdownselect(driver, "HRStateId", MailState);
			
			//HOMELESS CITY
			
			String MailCity = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,24);	
			
			s.enterdata(driver, "HRCityId", MailCity);
			
			//HOMELESS ZIP 
			
			String MailZip = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,25);	
			
			s.enterdata(driver, "HRZipcodeId", MailZip);
											
			//PASSWORD
			
			String Password = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,26);	
			
			s.enterdata(driver, "HRpassId", Password);
			
			// CONFPASSWORD 
			
			String ConfPassword = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage1", i,27);	
			
			s.enterdata(driver, "HRpassRId", ConfPassword);
			
			//Paperless E-Mail Check Box
	
			s.click(driver, "showPaperless");
			
			
			//SUBMIT BUTTON
			
			s.click(driver, "pgid:RADTemppgid:frmIdd:CreateAccButton");
									
			//APPLY BUTTON
			
			s.click(driver, "applynowbutton");
			
//*********************SPOUSE DETAILS******************************************************************************************************************************			
						
			//SPOUSE CHECK BOX
			
			s.click(driver, "spouse_check_Id");
			
			//SPOUSE FN
			
			String SpouseFN = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 23);	
			
			s.enterdata(driver, "fName-txt", SpouseFN);
			
			//SPOUSE MN
			
			String SpouseMN = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 1);	

			s.enterdata(driver, "mName-txt", SpouseMN );
			
			//SPOUSE LN
			
			String SpouseLN = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 2);	
			
			s.enterdata(driver, "lName-txt", SpouseLN );
			
			//SPOUSE SSN
			
			String SpouseSSN = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 3);	
			
			s.enterdata(driver, "ssn-num", SpouseSSN );
				
			//MONTH
			
			String SpouseMonth = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 4);
			
			s.dropdownselect(driver, "sp_month", SpouseMonth);
					
			//DAY
			
			String SpouseDate = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 5);	
			
			s.dropdownselect(driver, "sp_date", SpouseDate );
			
			//YEAR
			
			String SpouseYear = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 6);	
			
			s.dropdownselect(driver, "sp_year", SpouseYear);
					
//*********************RACE DETAILS******************************************************************************************************************************			
			
			//WHITE
			
			String White = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 24);
			
			if (White.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "white-chk");
			} 
						
			//BLACK
			
			String Black = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 25);
			
			if (Black.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "black-chk");
			} 
			
			//ASIAN
			
			String Asian = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 26);
			
			if (Asian.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "asian-chk");
			} 
			
			//AMERICAN
			
			String American = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 27);
			
			if (American.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "aIndian-chk");
			} 
				
			//PACIFIC
			
			String Pacific = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 28);
			
			if (Pacific.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "pIslander-chk");
			} 
			
			
			
//*********************Ethnicity & Citizenship******************************************************************************************************************************			
											
			//ETHINICITY
			
			String Ethnicity = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 7);	
			
			s.dropdownselect(driver, "ethnicity-sel", Ethnicity);
					
			//CITIZENSHIP
			
			String Citizenship = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 8);	
			
			s.dropdownselect(driver, "citizenship-sel", Citizenship);
					
//*********************FAMILY ELEMENTS******************************************************************************************************************************
			
			//TOTAL PEOPLE
			
			String NumberofHH = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 9);
			
			s.enterdata(driver, "pplInHH-num", NumberofHH);
						
			//CHILDREN
			
			String NumberofChildren = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 10);	
			
			s.enterdata(driver, "childrenUnder18-num", NumberofChildren);
							
			//EMPZIPCODE
						
			String EmpZipCode = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 11);	

			s.enterdata(driver, "empZipaddr", EmpZipCode);
			
			//CO HEAD DISABLED
			
			String SpouseDisabled = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 12);	

			s.dropdownselect(driver, "coSpouseDisabled-sel", SpouseDisabled);
			
			//EDUCATION
			
			String Education = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 13);
			
			s.dropdownselect(driver, "education-sel", Education);
							
			//INCOME
			
			String AnnualIncome = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 14);	

			s.enterdata(driver, "income-num", AnnualIncome);
			
			//VETERAN SELECT
			
			String Veteran = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 15);

			s.dropdownselect(driver, "veteran-sel", Veteran);
						
			//MILITARY SELECT
			
			String Military = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 16);	
			
			s.dropdownselect(driver, "activemil-sel", Military);
				
			//OCCUPATION
			
			String Occupation = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 17);	

			s.dropdownselect(driver, "occupation-sel", Occupation);
				
//*********************SPECIAL NEEDS******************************************************************************************************************************

			//Near Elderly
			
			String NearElderly = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 29);
			
			if (NearElderly.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "nrElderly-chk");
			} 
									
			//Elderly
			
			String Elderly = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 30);
			
			if (Elderly.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "elderly-chk");
			} 
												
			//Homeless
			
			String Homeless = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 31);
			
			if (Homeless.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "homeless-chk");
			} 
			
			//Disabled
			
			String Disabled = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 32);
			
			if (Disabled.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "disable-chk");
			} 
									
			//Displaced
			
			String Displaced = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 33);
			
			if (Displaced.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "displaced-chk");
			} 
			
				
//*********************Accessibility******************************************************************************************************************************
			
			//Hearing Access
			
			String Hearing = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 34);
			
			if (Hearing.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "hearing-chk");
			} 
			
			//Sight Access
			
			String Sight = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 35);
			
			if (Sight.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "sight-chk");
			} 
									
			//Mobility Access
			
			String Mobility = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 36);
			
			if (Mobility.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "mobility-chk");
			} 
							
//*********************WAITLIST DETAILS******************************************************************************************************************************			
			
			// SECTION 8 CHECK BOX
			
			String Sec8 = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 37);
			
			if (Sec8.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "section8-chk");
			} 

			//PBV CHECK BOX
			
			String PBV = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 38);
			
			if (PBV.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "PBV-chk");
			} 
										
			//PBS CHECK BOX
			
			String PBS = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 39);
			
			if (PBS.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "PBVS-chk");
			} 
												
			//PH CHECK BOX
			
			String PH = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 40);
			
			if (PH.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "publichousing-chk");
			} 
												
			//NED CHECK BOX
			
			String NED = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 41);
			
			if (NED.equalsIgnoreCase("Yes"))
			{
				s.click(driver, "NED-chk");
			} 			
									
//*********************AGENCY DETAILS******************************************************************************************************************************
			
			//AGENCY CONTACT
			
			String AgencyOption = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 18);	
			
			s.dropdownselect(driver, "agency_helptypeId", AgencyOption);
					
			//AGENCY NAME
			
			String AgencyList = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 19);	

			s.dropdownselect(driver, "agency_list", AgencyList);
			
			//AGENCY NAME
			
			String AgencyContactPhone = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 20);	

			s.enterdata(driver, "ContNametxt", AgencyContactPhone);
			
			//AGENCY PHONE
			
			String AgencyContactEmail = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 21);
			
			s.enterdata(driver, "ContPhone-txt", AgencyContactEmail);
					
			//AGENCY EMAIL
			
			String AgencyContactName = s.GetData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 22);	

			s.enterdata(driver, "ContEmail-txt", AgencyContactName);
		
			
//*********************SAVE & SUBMIT******************************************************************************************************************************
			
			//NEXT BUTTON
			
			s.click(driver, "nextBtn");
														
			//SAVE
			
			s.click(driver, "saveBtn");
	
//*********************SAVE CONFIRMATION MESSAGE******************************************************************************************************************************
			
			//System.out.println("Application Saved");
			
			Thread.sleep(5000);
						
			s.validation(driver, "//*[@id='confHeader']", "Your application has been successfully saved.");
			
			Thread.sleep(5000);
			
			driver.navigate().refresh();
			
			driver.findElement(By.id("updatenowbutton")).click();
			
			driver.findElement(By.id("nextBtn")).click();
			
			//CLICKING SUBMIT BUTTON
						
			
//*********************SUBMIT CONFIRMATION MESSAGE******************************************************************************************************************************			
			
			driver.findElement(By.id("submitBtn")).click();
			
			Thread.sleep(5000);
			
			s.validation(driver, "//*[@id='confHeader']", "Your application has been successfully submitted.");
				
//*********************PRINTING APPLLICATION NUMBER******************************************************************************************************************************			
								
			String AppNumberText = driver.findElement(By.xpath("//div[@id='applicationformId']//div[@id='confContent']//span[contains(text(),'AP-')]")).getText();
			
			System.out.println("Application Number: " + AppNumberText);
			
			s.WriteData("C:\\D Drive\\Java\\SdhcOldCode\\Test Data\\sdhc.xlsx","ProfilePage2", i, 54, AppNumberText);
			
			driver.close();
			
			}
						
//*********************MAIN******************************************************************************************************************************
		} 
			

	 catch (InterruptedException e)

	{
		e.printStackTrace();
	}
	}
}