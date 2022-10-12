  #Senaryo ;
    #1- Siteyi açıız
    #2- username ve password u gönderin ve Login butonuna tıklatın.
    #3- Login olduğunuzu doğrulayın.
    #- Sora Yukarı Senaryoyu Gherkin dilinde yazdık.


Feature: Login Functionality
@Smoketest @Regression
  Scenario: Login with valid username and password

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

