Evaluation C4 SB101-B18
Note
There are a total of 5 questions.
All the questions are compulsory.
Duration of the test is 3 hours
Mode of Submission: Github Link
Don’t seek help from any person/resource during the test.
Marks Distribution is as follows:
Question No: Marks
1 2 marks
2 1 marks
3 2 marks
4 3 marks
5 2 marks
Question 1
Table: Employee
+--------------+---------+
| Column Name | Type |
| id | int |
| name | varchar |
| salary | int |
| departmentId | int |
+--------------+---------+
id is the primary key column for this table.
departmentId is a foreign key of the ID from the Department table.
Each row of this table indicates the ID, name, and salary of an employee. It also contains the ID of their department.
Table: Department
+-------------+---------+
| Column Name | Type |
+-------------+---------+
| id | int |
| name | varchar |
+-------------+---------+
id is the primary key column for this table.
Each row of this table indicates the ID of a department and its name.
A company's executives are interested in seeing who earns the most money in each of the company's departments. A high earner in
a department is an employee who has a salary in the top three unique salaries for that department.
Write an SQL query to find the employees who are high earners in each of the departments.
Return the result table in any order.
The query result format is in the following example.
Example 1:
Input:
Employee table:
+----+-------+--------+--------------+
| id | name | salary | departmentId |
+----+-------+--------+--------------+
| 1 | Joe | 85000 | 1 |
| 2 | Henry | 80000 | 2 |
| 3 | Sam | 60000 | 2 |
| 4 | Max | 90000 | 1 |
| 5 | Janet | 69000 | 1 |
| 6 | Randy | 85000 | 1 |
| 7 | Will | 70000 | 1 |
+----+-------+--------+--------------+
Department table:
+----+-------+
| id | name |
+----+-------+
| 1 | IT |
| 2 | Sales |
+----+-------+
Output:
+------------+----------+--------+
| Department | Employee | Salary |
+------------+----------+--------+
| IT | Max | 90000 |
| IT | Joe | 85000 |
| IT | Randy | 85000 |
| IT | Will | 70000 |
| Sales | Henry | 80000 |
| Sales | Sam | 60000 |
+------------+----------+--------+
Explanation:
In the IT department:
- Max earns the highest unique salary
- Both Randy and Joe earn the second-highest unique salary
- Will earns the third-highest unique salary
In the Sales department:
- Henry earns the highest salary
- Sam earns the second-highest salary
- There is no third-highest salary as there are only two employees
Note: Just write MySql query to get the desired output
Question 2
What is the ACID acronym for? Describe each property individually with your own words.
Question 3
Samantha is running a shop and started an extra facility online food ordering, but there is a problem for her that some online
customers order food but refuse to take it at the time of delivery.
So she wants to get data of those customers and needs your help. We are dealing with database for a shop which also offer online
orders
We are given with three tables
1.onlinecustomers→ having the data of the customers who order online.
2.orders→ having the data of all the orders placed by customers.
3. Sales→ having the data of the orders which are successfully completed.
Below are queries to create tables in a database.
1. CREATE TABLE onlinecustomers (customerid INT PRIMARY KEY auto_increment ,CustomerName
VARCHAR(100) ,CustomerCity VARCHAR(100) ,Customermail VARCHAR(100));
2. CREATE TABLE orders (orderId INT PRIMARY KEY auto_increment , customerid INT ,ordertotal
float ,discountrate float ,orderdate DATETIME);
3. CREATE TABLE sales (salesId INT PRIMARY KEY auto_increment,orderId INT ,salestotal FLOAT);
We are required to show the data of the online customers who have ordered online which are not successfully completed.
(i.e.we need all rows of the orders table, which are matched to online customers tables. On the other hand, these rows do not exist
in the sales table. The following Venn diagram will help us to figure out the matched rows which we need. The grey-colored area
indicates rows which will be the output of the query:)
The final output query should give the following fields from the data. (customerName, customercity, customermail, ordertotal)
Note: Just write MySql query to get the desired output
Question 4.
ABC International School wants to computerise students' details. The school maintains a database of students in mySql. The
student table contains information related to students and is shown in the following student table structure.
Table Name ABCdatabase:
Rollno Number (4) Primary Key
StudentName Varchar (20) Not Null
Standard Varchar (2) Not Null
Date_Of_Birth Date
Fees int
When a new student joins the school, the student record is inserted in the student table. The valid student details are as follows: •
Rollno: Valid value is a 4-digit number • StudentName: Valid value can contain maximum 20 letters in uppercase • Standard : Valid
values are Roman Letters representing I to X(I, II, III, IV….IX, X)
Write a Java program to
● Insert student records to the table
● Find student by ID
● Find student by name and ID
● Update student name by ID
● Delete student by ID
Note: Use DAO pattern and prepared statement to solve this problem and all these methods should throw appropriate checked
exception.
Question 5
AccountDao provides an API that allows access and manipulation of accounts. Your job is to implement the
AccountDaoImpl class using JDBC prepared statement. Create the use case classes to call and test the given methods.
Database name: bankDB
Table name : account
id: int Primary key
email: varchar
address: varchar
Balance:double
AccountDao Interface:
public interface AccountDao {
void save(Account account);
Account findById(int id) throws InvalidAccount;
void update(Account account) throws InvalidAccount;
void remove(Account account) throws InvalidAccount;
int withdraw(double amount, Account account) throws InsufficientBalance;
String deposit(double amount, Account account) throws InvalidAccount;
}
Note: Use proper DAO pattern to solve this problem and create required exceptions and handle i
