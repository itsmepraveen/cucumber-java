##Cucumber BDD using Java - JUnit



Step1: Checkout cucumber-java-junit branch

Step2: From pom.xml file, execute mvn test (Feature files run in parallel) 

Step3: To generate report, execute mvn verify (navigate to Target folder, and click 'overview-features.html' file to view the report)

NOTE: JUnit will only execute Feature files to run in parallel not Scenarios.

#Issues&Resolution
Issue1: Chromedriver in Java not executable
Solution: From terminal locate jar path and execute this command - chmod +x chromedriver
Reference: https://stackoverflow.com/questions/35509076/chromedriver-in-java-not-executable