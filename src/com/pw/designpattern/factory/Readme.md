# Factory

Imagine you’re building a program that simulates a simple console based calculator. You have different types of operations like addition, subtraction, multiplication, division etc. Each operation has its own unique behavior. Now, you want to create these operation objects in your program based on customer choice.

The challenge is you need a way to create these operation objects without making your code too complex or tightly coupled. This means you don’t want your code to rely too heavily on the specific classes of operations directly. You also want to make it easy to add new types of operations later without changing a lot of code.

The Factory Design Pattern helps you solve this problem by providing a way to create objects without specifying their exact class. Instead, you delegate the creation process to a factory class.

### 1- Define the product interface. (Operation).
### 2- Implement concrete products for each operation. (AddOperation, SubOperation, MulOperation, DivOperation)
### 3- Create a factory class (OperationFactory) with a method (getInstance) to create objects based on some parameter.