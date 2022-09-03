Evaluation C1:SB101

Note
There are a total of 3 questions.
All the questions are compulsory.
Duration of the test is 1.5 hours.
Mode of Submission: Github Link
Don’t seek help from any person/resource during the test.
Marks Distribution is as follows:

Question No: Marks
1 3 marks
2 5 marks
3 2 marks

Question 1
Create a Employee bean class with following fields:
● empId
● name
● address
create a Map as
● key: Employee
● Value: Integer (Salary of Employee)
Sort Map in Alphabetical order of Employee Name by using TreeMap and implementing Comparable interface,
where key is customObject/Employee type in java.

Question 2

● Create a class Mobile with the following field:
HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
● Implement the following methods inside the Mobile class:
public String addMobile(String company, String model)
● This method will take a string as a company name and its model as an argument.
● Ex: "apple", "Iphone13"
● add the company as key and its model as an element of ArrayList in the above //mobiles HashMap.
● if the company name already exists then their model should be added to the existing list.
● This method should return a message "Mobile added successfully" after adding a mobile.
public List<String> getModels(String company)throws InvalidMobileException
This method return the list of all the models of the supplied company
If we supply any invalid company name then it should throw a checked exception
● Inside the main method of the Mobile class perform the following task:
➔ Call the addMobile method by adding some mobiles with their details
➔ Call the getModels method and print the list of the models of the supplied company.
★ Note: Application should be terminated normally.

Question 3

Explain upper bounded wildcards and lower bounded wildcards with an example.
