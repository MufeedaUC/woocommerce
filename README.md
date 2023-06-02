# woocommerce
Eclipse setup
1. Download & install Eclipse IDE for Java Developers (https://www.eclipse.org/downloads/)
   Please select Eclipse Version: 2021-03 (4.19.0)
  - Create a project -->Create package & Class .
  - Install TestNG From Eclipse Marketplace.(Eclipse-Help-Eclipse Marketplace)
2. Download Selenium Webdriver for java (version- 3.141.59) from official site (https://www.selenium.dev/downloads/)
3. Configure Library files
  - Right click on project ->Build path ->Configure build path->Libraries->Module path->Add External JARs->(downloaded selenium JARs i.e. Client Combined JAR and all the 
    JARs under the Libs folder ) then Apply-Apply&close.
4. Download Chromedriver for chrome browser
5. Create a folder for screenshot under project. Right click on your project-->New ->Folder -name as 'Screenshots'.
6. Copy woocommerce code and RUN. (import file :- just mouseover on red color markings & select import option type).


**Test Scenario
Update with your driver path-->	System.setProperty("webdriver.chrome.driver", "Your chromedriver path");      
