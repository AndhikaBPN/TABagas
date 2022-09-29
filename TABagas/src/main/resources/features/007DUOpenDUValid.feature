#Author: Bagas
#Created_date: 29/9/2022
#Modified_date: 
Feature: Admin login valid ke web
	Background:
	    Given Admin go to main page

	@tag1
  Scenario: Admin login valid click button signin
    When TSLP001001 admin enter username and password valid
    Then TSLP001001 The system check credentsial login valid
 
