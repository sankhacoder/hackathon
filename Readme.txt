# Hackathon Project Requirements

# Display Bookshelves

# Problem Statement : Display Bookshelves

Display the name, price of
1. Bookshelves below Rs. 15000 
2. Including out of stock
3. Storage type should be open.
3. Take first 3 study chair details with highest recommendation
If more than one item with same price displayed, include that details as well.
(Suggested site: urbanladder.com  however you are free to use any other legitimate site)

# Detailed Description: Hackathon Ideas

1. Display the name & price of first 3 Bookshelves below Rs. 15000, with Storage type as open & exclude out of stock
2. From Collections, retrieve all sub-menu items under Being-At-home and store in a List; Display the same
3. Gift cards - choose "Birthday/Anniversay"; fill customize the gift card; fill from to details with any one input invalid (example: email); Capture & display the error message
(Suggested site: urbanladder.com  however you are free to use any other legitimate site)

# Key Automation Scope

Handling alert, drag & drop, search option
Extract menu items & store in collections
Navigating back to home page
Filling form (in different objects in web page)


# Selenium Automation Testing Project: Display Bookshelves
 
## Project Overview
This Selenium automation testing project focuses on automating tasks on *urbanladder.com
The primary objectives include capturing user information, navigating through the portal, verifying the presence of specific elements. 
The project uses various dependencies and libraries to facilitate automation.



## Automation Test Flow
 
1. *Open urbanladder.com*
   - Navigate to the urbanladder.com.
 
2. *Verify the page title*
   - Verify the page title.
 
3. *Search BookShelves on the Saerch bar*
   - Search BookShelves on the Search bar.
   - Click on Search button.
 
4. *Capture the BookShelves*
   - Hover on price fitler and set the price range under 15000.
   - Click on exclude out of stock items.
   - Filter Storage type as "open".
   - Hover on Sort by and set "High to Low".
   
6. *Click on Urban Ladder Logo*
   - Click on Urban Ladder Logo to navigate back to homepage.
 
5. *Hover on Living text*
	   - Hover on Living page.
	   - Display all items of Being-At-Home in the Sub menu.
 
6. *Click on Click Gift Cards button*
   - Click on Gift Card Button and Navigate to Gift Cards Section .
   - Click on *Birthday/Anniversary Section.
 
7. *Set the Price of Gift Card*
   - Put a Amount of Money to add on Gift Card .
   - Select a Date for sending the Gift Card.
 
8. *Fill up the Form with Invalid Credentials*
   - Fill the form and put Invalid Credentials such as "Email".
   - Display and Capture the Invalid credential Popup or the Error Message.
 
## How to Run the Tests
 
1. *Open Eclipse IDE:*
   - Launch Eclipse IDE on your machine.
 
2. *Import Project:*
   - Select File -> Import from the menu.
   - Choose Existing Maven Projects and click Next.
   - Browse to the directory where you cloned the repository and select the project.
 
3. *Update Maven Project:*
   - Right-click on the project in the Project Explorer.
   - Choose Maven -> Update Project.
   - Click OK to update dependencies.
 
4. *Set Up Configuration:*
   - Open the src/test/resources/config.properties file.
   - Update any configuration parameters like browser type, URLs, etc., as needed.
 
5. *Run Test Suite:*
   - Locate the test suite file (e.g., src/test/java/TestSuite.java).
   - Right-click on the file and choose Run As -> TestNG Suite.
 
6. *View Reports:*
   - After execution, open the test-output folder.
   - Find the Extent Report HTML file (index.html) for detailed test reports.
 
## Author Information

- *Vaibhav Mishra*
- *Sankha Subhra Nandy*
- *Vishal Kumar*
- *Moupali Sen*
 
## Disclaimer
 
This project is intended for educational and testing purposes only. The authors are not responsible for any unauthorized use or modification of the code. Use at your own risk.