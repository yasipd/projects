# Welcome to the Learning Outcomes Evaluation

Dear students,

Welcome to this Learning Outcomes Evaluation session. Over the next two hours, we will be assessing your understanding and mastery of the learning outcomes for this semester. This evaluation is an important opportunity for you to showcase your knowledge and skills.

Please take this evaluation seriously and demonstrate your best work from the last two weeks by using your personal git account as proof. Remember to answer each question thoroughly and provide clear explanations where necessary.

Best regards,
Ghada Hassan and Kay Berkling

## Ethics Section regarding generative and other forms of AI

The student acknowledges and agrees that the use of AI is strictly prohibited during this evaluation. By submitting this report, the student affirms that they have completed the assessment independently and without the assistance of any AI technologies. This agreement serves to ensure the integrity and authenticity of the student's work, as well as their understanding of the learning outcomes.


## Checklist before handing in your work

- [ ] Review the assignment requirements to ensure you have completed all the necessary tasks.
- [ ] Pay careful attention to the requested links that must come from your project.
- [ ] Double-check your links and make sure that links lead to where you intended. Each answer should have links to work done by you in your own git repository
- [ ] Make sure you have at least 10 references to your project code (This is important evidence to prove that your project is substantial enough to support the learning outcome of object oriented design and coding within a larger piece of code.)
- [ ] Include comments to explain your referenced code and why it supports the learning outcome
- [ ] Proofread any accompanying documentation or comments for grammar and clarity.
- [ ] Commit and push this markup file to your personal git repository and hand in the link and a hard-copy via email at the end of the exam.

Remember, this checklist is not exhaustive, but it should help you ensure that your work is complete, well-structured, and meets the required standards.

Good luck with your evaluation!


## Learning Outcomes

| Exam Question | Total Achievable Points | Points Reached During Grading |
|---------------|------------------------|-------------------------------|
| Algorithms    |           4            |                               |
| Data types    |           4            |                               |
| Complex Data Structures |  4            |                               |
| Concepts of OOP |          6            |                               |
| OO Design     |           6            |                               |
| Class concepts |            8           |                               |
| Testing       |           6            |                               |
| Operator/Method Overloading | 6 |                               |
| Templates/Generics |       6            |                               |
| Class libraries |          6            |                               |
| Multi-threading |          6            |                               |
| Lambda expressions |       6            |                               |
| Serialization |            6           |                               |
| Database connectivity |   6            |                               |
| Total        |           80          |                               |



## Evaluation Questions

Please answer the following questions to the best of your ability to show your understanding of the learning outcomes. Please provide examples from your project code to support your answers. Only links to your own git will count. When you explain what you did make sure to explain why you did it this way with clear reasoning relating to your own work and not generic statements that anyone could make. 

## Evaluation Material


### Algorithms

Algorithms are manyfold and Java can be used to program these. Examples are sorting or search strategies but also mathematical calculations. Please refer to **two** areas in either your regular coding practice or within your project, where you have coded an algorithm. Do not make reference to code written for other classes, like theoretical informatics.


so % exercises I have done for algorithm.

* https://github.com/yasipd/projects/tree/main/Algorithm

in this folder you can find 4 programs about Sorting and Searching

also in this one i did bubblesort : https://github.com/yasipd/projects/tree/main/learnJava5 *


| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |


### Data types

Please explain the concept of data types and provide examples of different data types in Java.
Typical data types in java are int, double, float, char, boolean, long, short, byte, String, and arrays. Please provide one example for each of the **three** following data types in your code. One of these links must be to your project.
* Array : https://github.com/yasipd/projects/blob/main/learnJava7/ArrayListExample.java
* Strings : https://github.com/yasipd/projects/blob/main/Project/User.java
* boolean : https://github.com/yasipd/projects/blob/main/learnJava7/isPrime.java

Regarding the link to your project, explain the context in which you have used this data type being specific to your project. 

* https://github.com/yasipd/projects/blob/main/Project/User.java: in the User class of my project strings are used to storing the username and password of the user and the username and password are string type and the 2 other links above rather than my project referrig that i completed this context of data types.*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           1            |                               |
|           1           |                               |
|           2 (project link)          |                               |



### Complex Data Structures

Examples of complex data structures in Java are ArrayList, HashMap, HashSet, LinkedList, and TreeMap. Please provide an example of how you have used **two** of these complex data structures in your code and explain why you have chosen these data structures. Examples do not have to come from the project.

* in my coding practice i used complex data structure tbh almost everywhere. but i will provide 2 examples ArrayList and HashMap
ArrayList :https://github.com/yasipd/projects/blob/main/learnJava7/ArrayListExample.java
ArrayList is resizeable array that implement list interface and it stores dynamically sized I mean it is resizeable 
HashMap: https://github.com/yasipd/projects/blob/main/Project/BankingSystem.java
this is from my project that hashmap is a javacollection framework and i use it to store key-value pairs and mapping usernames to user object. *

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|           2            |                               |
|           2            |                               |



### Concepts of OOP
Concepts of OOP are the basic building blocks of object-oriented programming, such as classes, objects, methods, and attributes. 
Explain HOW and WHY your **project** demonstrates the use of OOP by using all of the following concepts:
* Classes/Objects :https://github.com/yasipd/projects/blob/main/Project/User.java
* Methods :https://github.com/yasipd/projects/blob/main/Project/User.java
* Attributes : https://github.com/yasipd/projects/blob/main/Project/User.java
Link to the code in your project that demonstrates what you have explained above.

* I mentioned a one class of my project for all 3: in my project the User class is blueprint for creating user objects. my user class has attributes(it's like properties for my class):username,password,and bank account .https://github.com/yasipd/projects/blob/main/Project/User.java
and with this method i mean OOP you can encapsulate the data and methods.
methods are like defining a behaviour and actions that our object can do (functionality)
the user class is also  having checkpassword and getaccount methods to check the users data object and control it 
*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|          2              |                               |
|          2              |                               |
|          2              |                               |



### OO Design
Please showcase **two** areas **where** you have used object orientation in your project. (How and why you use it will be the next question below.)
Examples in Java of good oo design are composition, encapsulation, inheritance, polymorphism, and abstraction. 

* In my project i used object oriented design below i mentioned 2 areas that it'S been applied:
https://github.com/yasipd/projects/blob/main/Project/VIPUser.java
here i used inheritance to create new class VIPUser that is based on User class that I have so it inherits fields and methods from the existing class and polymorphism is demonstraded within method overriding where the VIPUser can have additional behavior that extends the behavior of User class

and also this is the parent for VIPUser that inherits from : https://github.com/yasipd/projects/blob/main/Project/User.java

https://github.com/yasipd/projects/blob/main/Project/AbstractBank.java
https://github.com/yasipd/projects/blob/main/Project/Bank.java
and also this 2 shows the encapsulation and abstraction... Encapsulation is achieved here by keeping the data private and providing the public method to access and modify it. and abtraction here used to define a common interface (Account) and abstract class (AbstractBank) that provides the basic structure for different types of bank account.
in the project AbstractBank purpose defines the general structure of a bank account it implements Account interface it encapsulate balance meaning it can only be accessed within the class and subclasses. and deposit and withdraw methods define abstract methods which they must be implemented accordingly.
balance: a protected attribute that holds balance of the bank account.
displayBalance: prints current balance
deposit:abstract method that forces subclasses to implement of deposit functionality.
withdraw:abstract method
*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|              3         |                               |
|              3         |                               |



### Advanced Class Concepts
Advanced class concepts include constructors, abstract classes, interfaces, access modifiers, static methods, and variables. Please provide an example of how you have used **two** of these class concepts in your **project** code and explain why you have chosen these class concepts and how they work within your code.

* I think I explained it all above :D sorryy..
Abstract classes are classes that cannot be instantiated on their own and are meant to be subclassed. They can include abstract methods (without implementations)
In my project: the AbstractBank class is an abstract class that provides a common structure for different types of bank accounts. it includes both abstract methods and concrete methods.
https://github.com/yasipd/projects/blob/main/Project/AbstractBank.java

This design ensures that all bank accounts will have these core methods.

https://github.com/yasipd/projects/blob/main/Project/Account.java

In my project: the Account interface is used to define a standard set of operations that any bank account class must implement.
it is like defining a contract for bank account that it needs to be implemented.


*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|            4           |                               |
|            4           |                               |

### Testing
Java code is tested by using JUnit. Please explain how you have used JUnit in your project and provide a link to the code where you have used JUnit. Links do not have to refer to your project and can refer to your practice code. If you tested without JUnit, please explain how you tested your code.
Be detailed about what you are testing and how you argue for your test cases. 
Test cases usually cover the following areas:
* boundary cases
* normal cases
* error cases / catching exceptions 


* I didn't use Junit but I tested Manually my Project from the book head first I learned how I can benefits from TDD (and now this is my way to writing code because it really helped me to think how I should structure my program):test driven development so I tried to first write the test(Main) for specific functionality and then I wrote the classes 
and again refactor the code to improves its structure
for Exception Handling:
https://github.com/yasipd/projects/blob/main/Project/InsufficientFundsException.java
it extends Exception class:It includes a constructor that accepts a String message, which is passed to the superclass constructor (Exception). This message provides detailed information about the error.
I implement this but actually wrote my code on eclipse and therefore i forgoted to update my bank class I used this exception handling in Bank class:

try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew: " + amount);
            } else {
                throw new InsufficientFundsException("Insufficient balance or invalid amount.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
but unfortunately I forgot to update my Bank on vsCode... but the class for InsufficientFundsException is already there...
 *

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Operator/Method Overloading
An example of operator overloading is the "+" operator that can be used to add two numbers or concatenate two strings. An example of method overloading is having two methods with the same name but different parameters. Please provide an example of how you have used operator or method overloading in your code and explain why you have chosen this method of coding.
The link does not have to be to your project and can be to your practice code.

* https://github.com/yasipd/projects/blob/main/learnJava2/MathUtils.java
in this class i use overloading you can also check the comments on it .
Method overloading allows using the same method name for different operations.
For example having multiple add methods makes it clear that they all perform addition regardless of the number of parameters.
I chose this method because it is necessary to have a clean code
method with one parameter:
public int add(int a) {
    return a;
}
and method with 2 parameter:
public int add(int a, int b) {
    return a + b;
}
public void show(String num){
        System.out.println("String "+ num);
    }

and you can see how i benefits from + as well for concatanating to have a structured and clean code.

*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



### Generics
Generics in java are used to create classes, interfaces, and methods that operate on objects of specified types. Please provide an example of how you have used generics in your code and explain why you have chosen to use generics. The link does not have to be to your project and can be to your practice code.

*https://github.com/yasipd/projects/tree/main/learnJava6
in my practice code I have used generics to create a Box class that can hold objects of any specified type and because of the explicit type casting i learned generics so it makes code cleaner and easy to read.
public class Box<T> :T is a type parameter that can be replaced with any type when the class is instantiated
then I have generics method that allows box class to store and retrieve object of any types
and then I have GenericClassExample.java in this folder that I mentioned that shows how to use the Box with different types:
creating a box to hold strings and then creating a box to hold an integer
this learnJava6 are all about generics I also have an example that is without generics use and then withgenerics that it shows very good the difference
https://github.com/yasipd/projects/blob/main/learnJava6/WithOutGeneric.java
https://github.com/yasipd/projects/blob/main/learnJava6/WithGenerics.java *

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Class Libraries
Examples of class libraries in java are the Java Standard Library, JavaFX, Apache Commons, JUnit, Log4j, Jackson, Guava, Joda-Time, Hibernate, Spring, Maven, and many more. Please provide an example of how you have used a class library in your **project** code and explain why you have chosen to use this class library. 

* in my In my project, I have used several classes from the Java Standard Library, including collections like ArrayList and HashMap, as well as classes for input/output operations.
https://github.com/yasipd/projects/blob/main/Project/BankingSystem.java

The Java Standard Library provides a wide range of pre-built classes and methods that's why I used them.
HashMap for User Management:

The users variable is a HashMap that stores User objects with their usernames as keys. This allows for efficient retrieval and management of user data.
addUser, getUser, and displayUsers methods utilize HashMap to add, retrieve, and display users.
*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6           |                               |

### Multi-threading
multi-threading is the ability of a CPU to execute multiple processes or threads concurrently. Please explain the concept of multi-threading and provide an example of how you have used multi-threading in your code. The link does not have to be to your project and can be to your practice code.


*https://github.com/yasipd/projects/tree/main/Multithreading
Multi-threading is the capability of a CPU to manage multiple threads of execution concurrently.In Java, multi-threading is achieved using the Thread class and the Runnable interface.e Thread class represents a thread of execution while the Runnable interface should be implemented by any class whose instances are intended to be executed by a thread.(in my practice is all clear)
in my practice code I have used multi-threading to demonstrate how two threads can run concurrently and perform different tasks.
The MultiThreading class extends the Thread class and overrides the run method to print numbers from 10 to 1.pausing for one second between each print.
The run method contains the code that will be executed by the thread.
The MyRunnable class implements the Runnable interface and overrides the run method to print numbers from 0 to 9, pausing for one second between each print.
The run method is passed to a Thread object, which executes the code defined in MyRunnable.
Main Class:The Main class creates instances of MultiThreading and MyRunnable and starts them using the start method.
Starting the threads initiates their execution concurrently.
*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6           |                               |

### Lambda Expressions
An example of a lambda expression is the following code: 
```java
List<String> list = new ArrayList<>();
list.forEach((String s) -> System.out.println(s));
```
Please explain the concept of lambda expressions and provide an example of how you have used lambda expressions in your code. The link does not have to be to your project and can be to your practice code.

* https://github.com/yasipd/projects/tree/main/LambdaExpressions 
a functional interface is an interface with exactly one abstract method. It can have multiple default or static methods. Lambda expressions are used to implement the single abstract method of a functional interface.
In the Main class, a lambda expression is used to implement the myMethod of the MyInterface.
The lambda expression takes two parameters (x and y), which represent the name and symbol respectively, and prints a greeting message.
public class Main {
    public static void main(String[] args) {
        String name="paria";
        char symbol='!';
        MyInteface myInteface=(x,y)->{
            System.out.println("hello "+x+y);
            
    };
        myInteface.myMethod(name,symbol);
    }

    }
*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|           6            |                               |


### Serialization

Serialization is the process of converting an object into a stream of bytes to store the object or transmit it to memory, a database, or a file. Please explain why you would use serialization and provide an example of how you have used serialization in your code. The link does not have to be to your project and can be to your practice code.


*I didnt cover this part*

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|             6          |                               |


### Database Connectivity
Web applications use databases to store data. Please explain how you have connected to a database in your project and provide an example of how you have used database connectivity in your code. The link does not have to be to your project and can be to your practice code. Do not use code from other classes, like database programming, Web Engineering, or theoretical informatics.
This topic appeared in your learning agreement as the last point in the table under advanced topics.

* for the connectivity we typically use JDBC. it is an api that allows java application to interact with database but i didn't use that in my project I know how :
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
 and then implementing a class like databaseconnection and implementing attributes like : private static final String PASSWORD = "password1";
 I know the concept but I didn't cover it in my project. *

| Total Achievable Points | Points Reached During Grading |
|------------------------|-------------------------------|
|                        |                               |
|            6            |                               |



