##Cucumber BDD using Java - TestNG



Step1: Checkout cucumber-java-testng branch

Step2: From pom.xml file, execute mvn test (scenarios run in parallel) 

Step3: To generate report, execute mvn verify (navigate to Target folder, and click 'overview-features.html' file to view the report)

NOTE: TestNG will execute Scenarios to run in parallel.

#Issues&Resolution
Issue1: Chromedriver in Java not executable
Solution: From terminal locate jar path and execute this command - chmod +x chromedriver
Reference: https://stackoverflow.com/questions/35509076/chromedriver-in-java-not-executable