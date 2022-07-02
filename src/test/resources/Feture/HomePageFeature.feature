@smoke
Feature: story name should be mentioned

@sanity
Scenario: Verify the sorting of table in user inbox
	Given Open the chrome browser "chrome"
	And   Launch the NAPF url "http://napf.datamatics.com:8888/napf-ui/"
	When after loading the napf navigate to userinbox
	And click on the table header..
	Then Check on clicking, the date is sorted in ascending order.

@regression
Scenario: Verify the sorting of table in user inbox
	Given Open the chrome browser
	|browser|chrome|
	|browser1|firefox|
	|browser2|edge|
	And   Launch the NAPF url "http://napf.datamatics.com:8888/napf-ui/"
	When after loading the napf navigate to userinbox
	And click on the table header..
	Then Check on clicking, the date is sorted in ascending order.

@integration
Scenario Outline: to execute a scenario with different data
	
	Given Open the chrome browser "<browser>"
	And   Launch the NAPF url "<url>"
	When after loading the napf navigate to userinbox "<evn>"
	And click on the table header..
	Then Check on clicking, the date is sorted in ascending order.
	
	Examples:
	|browser|url|evn|
	|chrome|http://napf.datamatics.com:8888/napf-ui/|qa|
	|firefox|http://napf.datamatics.com:8888/napf-ui/|stg|
	


