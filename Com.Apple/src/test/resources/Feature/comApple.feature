Feature: Browsing Apple Website 

@smoke 
Scenario Outline: user shall be able to navigate using links in the Global navigation bar 
  
	Given user is at the Homepage 
	When user clicks on "<Mac>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<iPad>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<iPhone>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<Watch>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<TV>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<Music>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<Support>" 
	Then user should navigate to page 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	When user clicks on "<Cart>" 
	Then "<BagContent>" should appear 
	When user clicks on "<Apple_logo>" 
	Then user should navigate to page 
	
	Examples: 
		| Apple_logo | Mac | iPad | iPhone | Watch | TV | Music | Support | Cart |BagContent| 
		| Apple_logo | Mac | iPad | iPhone | Watch | TV | Music | Support | Cart |BagContent|
		
		@smoke 
		Scenario Outline:User shall be Able to navigate the website using links in the body 
  
			Given user is at the Homepage 
			When user clicks on "<iPhoneX>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<iPhoneRed_Learn>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<iPhoneRed_Buy>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<iPad_body>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<WWDC2018>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<MacbookPro_body>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<Watch_body>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<HomePod_body>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			When user clicks on "<AirPod_body>" 
			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
#			When user clicks on "<Music_iTunes_body>" 
#			Then user should navigate to page 
			When user clicks on "<Apple_logo>" 
			Then user should navigate to page 
			
			Examples: 
				|Apple_logo| iPhoneX | iPhoneRed_Learn | iPhoneRed_Buy | iPad_body | WWDC2018 | MacbookPro_body | Watch_body | HomePod_body | AirPod_body | Music_iTunes_body | 
				|Apple_logo| iPhoneX | iPhoneRed_Learn | iPhoneRed_Buy | iPad_body | WWDC2018 | MacbookPro_body | Watch_body | HomePod_body | AirPod_body | Music_iTunes_body | 
				
				@smoke 
				Scenario Outline: user is able to navigate using footer links 
				
					Given user is at the Homepage 
					When user clicks on "<Mac_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<iPad_foot>" 
					Then user should navigate to page 
					
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<iPhone_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<watch_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<TV_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Music_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<iTunes_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<HomePod_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<iPod_Touch_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Accessories_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Gift_Card_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Find_Store_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Genius_Bar_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Today_at_Apple_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_Camp_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Field_Trip_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_Store_App_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Refurbished_and_clearance_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Financing_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_GiveBack_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Order_Status_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Shopping_Help_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_and_Education_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Shop_for_College_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_for_Business_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Shop_For_Business_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Manage_Your_Apple_ID_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_Store_Account_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<iCloud_com_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Accessabiity_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Education_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Environment_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Inclusion_and_Diveristy_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Privacy_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Supplier_Responsibility_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Newsroom_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_Leadership_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Job_Opportunities_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Investors_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Events_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Contact_Apple_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Apple_Store_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<find_a_Reseller_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<United_States_or_Flag_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Privacy_Policy_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Terms_of_Use_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Sales_and_Refund_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Legal_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					When user clicks on "<Site_Map_foot>" 
					Then user should navigate to page 
					When user clicks on "<Apple_logo>" 
					Then user should navigate to page 
					
					Examples: 
						|Apple_logo| Mac_foot | iPad_foot | iPhone_foot | watch_foot | TV_foot | Music_foot | iTunes_foot | HomePod_foot | iPod_Touch_foot | Accessories_foot | Gift_Card_foot | Find_Store_foot | Genius_Bar_foot | Today_at_Apple_foot | Apple_Camp_foot | Field_Trip_foot | Apple_Store_App_foot | Refurbished_and_clearance_foot | Financing_foot | Apple_GiveBack_foot | Order_Status_foot | Shopping_Help_foot | Apple_and_Education_foot | Shop_for_College_foot | Apple_for_Business_foot | Shop_For_Business_foot | Manage_Your_Apple_ID_foot | Apple_Store_Account_foot | iCloud_com_foot | Accessabiity_foot | Education_foot | Environment_foot | Inclusion_and_Diveristy_foot | Privacy_foot | Supplier_Responsibility_foot | Newsroom_foot | Apple_Leadership_foot | Job_Opportunities_foot | Investors_foot | Events_foot | Contact_Apple_foot | Apple_Store_foot | find_a_Reseller_foot | United_States_or_Flag_foot | Privacy_Policy_foot | Terms_of_Use_foot | Sales_and_Refund_foot | Legal_foot | Site_Map_foot | 
						|Apple_logo| Mac_foot | iPad_foot | iPhone_foot | watch_foot | TV_foot | Music_foot | iTunes_foot | HomePod_foot | iPod_Touch_foot | Accessories_foot | Gift_Card_foot | Find_Store_foot | Genius_Bar_foot | Today_at_Apple_foot | Apple_Camp_foot | Field_Trip_foot | Apple_Store_App_foot | Refurbished_and_clearance_foot | Financing_foot | Apple_GiveBack_foot | Order_Status_foot | Shopping_Help_foot | Apple_and_Education_foot | Shop_for_College_foot | Apple_for_Business_foot | Shop_For_Business_foot | Manage_Your_Apple_ID_foot | Apple_Store_Account_foot | iCloud_com_foot | Accessabiity_foot | Education_foot | Environment_foot | Inclusion_and_Diveristy_foot | Privacy_foot | Supplier_Responsibility_foot | Newsroom_foot | Apple_Leadership_foot | Job_Opportunities_foot | Investors_foot | Events_foot | Contact_Apple_foot | Apple_Store_foot | find_a_Reseller_foot | United_States_or_Flag_foot | Privacy_Policy_foot | Terms_of_Use_foot | Sales_and_Refund_foot | Legal_foot | Site_Map_foot | 
						
						
						@smoke 
						Scenario Outline:users shall be ableto search for products using search feature 
					
							Given user is at the Homepage 
							When user clicks on "<search_button>" 
							Then "<Search_Bar>" should appear 
							And user entered "<Search_Bar>" "<Search_Data>" 
							Then "<Search_Bar>" should appear 
							When user hits enter key
							When user clicks on "<submit>"
							Then user should navigate to page 
							
							Examples: 
							
								|search_button|Search_Bar|Search_Data	|submit|
								|search_button|Search_Bar|ipod			|submit|
#								|search_button|Search_Bar|office		|submit|
#								|search_button|Search_Bar|QuickTime		|submit|
#								|search_button|Search_Bar|Garage Band	|submit|
#								|search_button|Search_Bar|Logic Pro		|submit|
#								|search_button|Search_Bar|Games			|submit|
#								|search_button|Search_Bar|iPad			|submit|
#								|search_button|Search_Bar|iwatch		|submit|
#								|search_button|Search_Bar|iphone		|submit|
								
								@smoke 
								Scenario Outline: user shall be able to buy products on apple website 
								
									Given user is at the Homepage 
									When user clicks on "<Mac>" 
									Then user should navigate to page 
									When user clicks on "<Macbook_Air>" 
									Then user should navigate to page 
									When user clicks on "<Air_buy>" 
									Then user should navigate to page 
									When user clicks on "<Select_MBA_128G>" 
									Then user should navigate to page 
									When user clicks on "<Upgrade_MBA_22>" 
									Then "<Upgrade_MBA_22>" should appear 
									When user clicks on "<Upgrade_MBA_512>" 
									Then "<Upgrade_MBA_512>" should appear 
									When user clicks on "<MBA_AddToBag>" 
									Then user should navigate to page 
									When user clicks on "<AC_AddToBag>" 
									Then "<Message>" should appear 
									When user clicks on "<IncaseClear>" 
									Then "<IncaseClear>" should appear 
									When user clicks on "<Inc_AddToBag>" 
									Then "<Message>" should appear 
									When user clicks on "<iPhone>" 
									Then user should navigate to page 
									When user clicks on "<iPhone7>" 
									Then user should navigate to page 
									When user clicks on "<Select_iPhone7_47>" 
									Then user should navigate to page 
									When user clicks on "<No_carrier>" 
									Then user should navigate to page 
									When user clicks on "<JetBlack>" 
									Then user should navigate to page 
									When user clicks on "<Select_iPhone7_128>" 
									Then user should navigate to page 
									When user clicks on "<Select_iPhone7_AddToBag>" 
									Then user should navigate to page 
									When user clicks on "<iPhone7_LC_AddToCart>" 
									Then "<Message>" should appear 
									
									When user clicks on "<BagSummary>" 
									Then user should navigate to page 
									
									When user clicks on "<Cart>" 
									Then "<BagContent>" should appear 
									When user clicks on "<BagCheckout>" 
									Then user should navigate to page 
									When user clicks on "<GuestCheckout>" 
									Then user should navigate to page 
									When user clicks on "<storePickup>" 
									Then "<pickupStore>" should appear 
									When user clicks on "<ContinueToPickup>" 
									Then user should navigate to page 
									And user entered "<first_name>" "<fnamevalue>" 
									Then "<first_name>" should appear 
									And user entered "<last_name>" "<lnamevalue>" 
									Then "<last_name>" should appear 
									And user entered "<email>" "<emvalue>" 
									Then "<email>" should appear 
									And user entered "<phonenumber>" "<pnvalue>" 
									Then "<phonenumber>" should appear 
									When user clicks on "<ContPaymenet>" 
									Then "<PaymentDetail>" should appear 
									
									
									Examples: 
										|Mac|Macbook_Air|Air_buy|Select_MBA_128G|Upgrade_MBA_22|Upgrade_MBA_512|MBA_AddToBag|AC_AddToBag|Message|msg				|IncaseClear|Inc_AddToBag|iPhone|iPhone7|Select_iPhone7_47|No_carrier|JetBlack|Select_iPhone7_128|Select_iPhone7_AddToBag|iPhone7_LC_AddToCart|BagSummary|storePickup|pickupStore|ContinueToPickup|first_name|fnamevalue|last_name|lnamevalue	|email|emvalue			|phonenumber|pnvalue	|ContPaymenet|BagContent|PaymentDetail|
										|Mac|Macbook_Air|Air_buy|Select_MBA_128G|Upgrade_MBA_22|Upgrade_MBA_512|MBA_AddToBag|AC_AddToBag|Message|Item added to bag 	|IncaseClear|Inc_AddToBag|iPhone|iPhone7|Select_iPhone7_47|No_carrier|JetBlack|Select_iPhone7_128|Select_iPhone7_AddToBag|iPhone7_LC_AddToCart|BagSummary|storePickup|pickupStore|ContinueToPickup|first_name|John		|last_name|Smith		|email|John@gmail.com	|phonenumber|555454654	|ContPaymenet|BagContent|PaymentDetail|
							