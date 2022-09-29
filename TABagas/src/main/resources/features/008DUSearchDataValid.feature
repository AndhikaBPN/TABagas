Feature: Admin search data users
	Background:
	    Given Admin click search field

  @tag1
  Scenario: TSDU002001 Admin search by name with search button
    When TSDU002001 Admin input search field with name
    And TSDU002001 Admin click search button
    Then TSDU002001 The system check data users