package com.docTalk.NewUser;

public class NewUserObjectRepo {
	
	//Launch Page objects
	
	public static final String LAUNCHPAGE_VIEWTEXT_XPATH = "//android.view.ViewGroup";
	public static final String LAUNCHPAGE_WELCOMETEXT_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_on_boarding_heading";
	public static final String LAUNCHPAGE_TEXT_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_on_boarding_description";
	public static final String LAUNCHPAGE_NEWUSER_LINK_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_create_account";
	public static final String LAUNCHPAGE_LOGINUSER_LINK_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_login";
   
	//Create NewUser Account
	
	public static final String EMAIL_ADDRESS_FIELD_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_email";
	public static final String PASSWORD_FIELD_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_password";
	public static final String USER_NAME_FIELD_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_name";
	public static final String COUNTRY_CODE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_country_code_item";
	public static final String MOBILE_NUMBER_FIELD_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_mobile_number";
	public static final String TERMANDCONDITIONS_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_conditions_policy";
	public static final String PERMISSION_POPUP_TEXT_ID = "com.android.packageinstaller:id/permission_message";
	public static final String ALLOW_PERMISSION_POPUP_ID = "com.android.packageinstaller:id/permission_allow_button";
	public static final String DENY_PERMISSION_POPUP_ID = "com.android.packageinstaller:id/permission_deny_button";
	public static final String PAGINATION_TEXT_ID = "com.android.packageinstaller:id/current_page_text";
	
	//Phone number verification page
	
	public static final String MOBILEPAGE_TITLE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_title";
	public static final String COUNTRY_CODE_DROPDOWN_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_country_code";
	
	//OTP SCREEN OBJECTS
	
	public static final String OTP_SCREEN_TITLE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_title";
	public static final String CONFIRMATION_CODE1_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_1";
	public static final String CONFIRMATION_CODE2_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_2";
	public static final String CONFIRMATION_CODE3_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_3";
	public static final String CONFIRMATION_CODE4_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_4";
	public static final String CONFIRMATION_CODE5_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_5";
	public static final String CONFIRMATION_CODE6_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_6";
	public static final String OTPSCREEN_CONTINUE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_next_button";
	public static final String OTPSCREEN_I_DIDNT_GET_CODE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_retry_button";
	public static final String AGREEMENT_AND_CONDITIONS_ID = "com.getdoctalk.doctalk.app.patient.debug:id/com_accountkit_confirmation_code_agreement";
	
	//Subscription code screen
	
	public static final String SUBSCRIPTION_CODE_XPATH = "//android.widget.TextView[contains(@text,'Subscription Code')]";
	public static final String SUBSCRIPTION_DESCRIPTION_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_subscription_description";
	public static final String DOCTOR_CODE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_subscribe_doctor_code";
	public static final String SUBSCRIPTION_CONNECT_BUTTON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_connect_doctor";
	public static final String SUBSCRIPTION_SKIP_BUTTON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/subscribe_doctor_skip";
	public static final String CANNOT_FIND_DOC_MESSAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_can_not_find_doctor";
	
	//How did you hear about us
	
	public static final String ACQUISITION_TITLE_HOMEPAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_acquisition_heading";
	public static final String ACQUISITION_DESCRIPTION_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_acquisition_description";
	public static final String DOCTOR_BUTTON_XPATH = "//android.widget.Button[contains(@text,'Doctor')]";
	
	//Home screen
	
	public static final String SUPPORT_LINK_ON_HOMEPAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_support";
	public static final String EMPTY_SUBSCRITPTION_TITLE_ON_HOMEPAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_empty_subscriptions_title";
	public static final String EMPTY_SUBSCRITPTION_DESCRIPTION_ON_HOMEPAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_empty_subscriptions_description";
	public static final String CONNECT_WITH_YOUR_DOCTOR_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_connect_doctor";
	public static final String FILES_TAB_ON_HOMEPAGE_XPATH = "//android.widget.FrameLayout[contains(@resource-id,'com.getdoctalk.doctalk.app.patient.debug:id/menu_item_files']";
	public static final String MORE_TAB_ON_HOMEPAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/menu_item_more";
	//File maintainance screen
	
	public static final String ADD_FILE_BUTTON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/image_button_add_files";
	public static final String SEARCH_BUTTON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/search_button";
	public static final String EMPTY_CHAT_IMAGE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/image_empty_chats";
	public static final String EMPTY_CHAT_TITLE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_empty_chat_title";
	public static final String EMPTY_CHAT_DESCRIPTION_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_empty_chat_description";
	public static final String PICKER_HEADING_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_bottom_sheet_picker_heading";
	public static final String ADDING_PRESCRIPTION_TO_FILE_XPATH = "//android.widget.Button[contains(@text,'Prescription']";
	public static final String ADDING_REPORT_TO_FILE_XPATH = "//android.widget.Button[contains(@text,'Report']";
	
	//Prescription and Report screen
	
	public static final String PRESCRIPTION_ADD_DETAILS_XPATH = "//android.widget.TextView[@contains(@text,'Prescription - Add Details')]";
	public static final String WHAT_IS_THIS_PRESCRIPTION_FOR_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_add_info";
	public static final String ADD_NOTES_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_description";
    public static final String PRESCRIPED_ON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_date";
    public static final String ADD_PRESCRIPTION_BUTTON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_add_file";
    public static final String UPLOAD_PRESCRIPTION_ID = "com.getdoctalk.doctalk.app.patient.debug:id/image_file_thumbnail";
    
    //MORE Tab objects
    
    public static final String USER_NAME_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_name";
    public static final String USER_MAILID_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_email";
    public static final String SUBSCRIPTION_DETAILS_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_subscription";
    public static final String MEDICAL_DETAILS_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_medical_details";
    public static final String TUTORIALS_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_tutorials";
    public static final String FAQS_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_faqs";
    public static final String SUPPORT_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_support";
    public static final String RIGHT_CHEVRON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/image_right_chevron";
    public static final String EDIT_PROFILE_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_edit_profile";
    public static final String KEEPING_YOUR_PROFILE_XPATH = "//android.widget.TextView[contains(@text,'Keeping your profile picture up to date will help your doctors identify you easily']";
    public static final String MOBILE_NUMBER_TEXT_ID = "com.getdoctalk.doctalk.app.patient.debug:id/text_mobile_value";
    public static final String SIGNOUT_OPTION_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_sign_out";
    public static final String SIGNOUT_BUTTON_XPATH = "//android.widget.Button[contains(@text,'Sign out')]";
    
    //Edit profile objects
    public static final String SAVE_BUTTON_ID = "com.getdoctalk.doctalk.app.patient.debug:id/button_save_profile";
    public static final String EDIT_FIRST_NAME_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_first_name";
    public static final String EDIT_LAST_NAME_ID = "com.getdoctalk.doctalk.app.patient.debug:id/edit_text_last_name";
    public static final String EDIT_CITY_ID = "com.getdoctalk.doctalk.app.patient.debug:id/auto_complete_text_city";
}
