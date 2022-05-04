Feature: To validated Home functionality in OhBaby webiste
Background:
Given User should launch the chrome and load the url and maximize

@smoke
Scenario: TC_OBS1 Verify user should launch OhBaby webiste
Then User should navigate to OhBaby website and website should launch properly

@smoke
Scenario: TC_OBS2 Verify NEW ARRIVALS is available in Home page 
Then User should validate the NEW ARRIVALS option is avaliable in home page

@smoke
Scenario: TC_OBS3 Verify user should able to click NEW ARRIVALS option and should navigate to New Arrivals page
When User should click the New Arrivals option
Then User should verify New Arrivals page navigated


Scenario: TC_OBS4 Verify the Oh baby! Logo available in Home page
Then User should verify the Oh baby logo is available in home page

Scenario: TC_OBS5 Verify the Search button is available in Home page
Then User should validated the serach option


