Feature: Login Functionality

@Regression
Scenario: A user with invalid credentials should see an error message
Given a user is on landing page
When he hovers the pointer over Hello Sign In menu
And he clicks on Sign-in button in the sub-menu
And he enters an invalid username 'batman5544@gmail.com' in the email text-box
And he clicks on the continue button
Then he must see an error message - 'We cannot find an account with that email address'
