@QE-13694
Feature: I Create Spacer component in AEM and Verify it against Publish Response

	@TEST_QE-13693
	Scenario: I Create Spacer component in AEM and Verify it against Publish Response
		Given I login into the AEM login page
		    Then I navigate to the macys in Domestic mode for HomePage to the authoring page
		    Then I add "Divider / Spacer / Placeholder" Component as root_container to the page