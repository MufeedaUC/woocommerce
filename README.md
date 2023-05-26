# woocommerce
Eclipse setup
1. Download & install Eclipse IDE for Java Developers (https://www.eclipse.org/downloads/)
  - Create a project 
  - Install TestNG From Eclipse Marketplace.(Eclipse-Help-Eclipse Marketplace)
2. Download Selenium Webdriver for Java (https://www.selenium.dev/downloads/)
3. Configure Library files
  - Right click on project ->Build path ->Configure build path->Libraries->Module path->Add External JARs->(JAR files that downloads)Apply-Apply&close.
4. Download Chromedriver for browser

**Test Scenario
Update with your driver path-->	System.setProperty("webdriver.chrome.driver", "Your chromedriver path");      
