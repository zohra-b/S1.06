
<p align="center"><h1 align="center">S1.06. Generics </h1></p>

<br>

---

## 📍 Objectives

Learn to handle abstractions with Generics.
---

## 👾 Exercises
### 📌 Level 1

### 📌 Level 1 - ex 1
Create a class called NoGenericMethods that stores three arguments of the same type, along with methods to store and retrieve these objects and a constructor to initialize all three. Verify that the arguments can be placed in any position in the constructor call.
### 📌 Level 1 - ex 2
Create a class called Person with the attributes first name, last name and age. Then create a class called GenericMethods with a generic method that accepts three arguments of generic type. This method should only print the arguments it has received to the screen. In the main() of the main class, call the generic method with different types of parameters.
Example: an object of the Person class, a String and a primitive type.
In this way you have verified that any type of parameter can be passed to it and in any order.

### 📌 Level 2 

### 📌 Level 2 - ex 1
Modify the previous exercise so that one of the arguments to the generic method is not generic.
### 📌 Level 2 - ex 2
Modify the previous section so that the arguments to the generic method are an undefined variable argument list.


### 📌 Level 3 
To do this exercise you need an interface called Phone and three classes: Smartphone, Generic and the Main.
The Phone interface must have a method called call(). The Smartphone class must implement Phone, and in addition to the call() method, it must also have the takePhotos() method.
The Generic class must have two generic methods, the first must receive an argument type limited by the Phone interface and the second must receive an argument limited by the Smartphone class. From these two methods, call the relevant methods of Phone and Smartphone. In the main() of the Main class, pass an object of the Smartphone class to the two generic methods of the Generic class.
Can the method limited by the Phone interface, of the Generic class, call the takePhotos() method?

---
## 🚀 Getting Started

### ☑️ Prerequisites

Before getting started with S1.06, ensure your runtime environment meets the following requirements:

- **Programming Language:** Java 23SE
- IntelliJ or Eclipse IDE (with Maven)


### ⚙️ Installation

Clone the S1.06 repository:
```sh
❯ git clone https://github.com/zohra-b/S1.06
```
