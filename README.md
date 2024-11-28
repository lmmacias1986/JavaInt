# Explanation task Design patterns solution

I used the login page from Sauce Labs. and I created a test case where I could use all the 
design patterns required in the task


Singleton (Class: DriverManager):
Ensures one WebDriver instance across the framework.

DTO (Class:UserDTO):
Encapsulates user credentials for better test readability and maintainability.

Builder Pattern (Class: UserBuilder):
Simplifies creating test data (e.g., UserDTO).

Page Object & Page Factory: (package pages)
Encapsulates web elements and their actions, promoting reuse and modularity.

Chain of Responsibility (TestSteps):
Chains test actions, making tests readable and structured.

PageFactoryManager (Class: PageFactoryManager)
Manages page object instances for easy initialization.