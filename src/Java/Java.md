# Java Interview Questions
1. What is JDK, JRE and JVM, and explain the differences?
	* *JVM* Java Virtual Machine
	* *JRE* Java Runtime Enviroment
	* *JDK*  Java Development Kit = JRE+development tools
---
2. Java is 100% OOP?
	* No, 8 primitive data types, i.e. boolean, byte, char, int, float, double, long, short are not objects.
---
3. What is wrapper class?
	* Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class.
---
4. What is singleton class and *::why it is useful::*?
	* Singleton class is a class whose only one instance can be created at any given time, in one JVM. 
---
5. What is different between ArrayList and Vector in Java?
	1. Vector increases the size by 100% while ArrayList increases the size by 50% (when excess the capacity)
	2. Vector is synchronized (thread safe),  ArrayList is not.
	3. Vector is slower.
---
6. What is the difference between equals and == ?
	* == compares the object’s location, not the content, but equals() compares the object contents.
	* [Explain]([Java equals vs == operator - YouTube](https://www.youtube.com/watch?v=qQe69w1YF54))
```
String s1 = new String("ABC");
String s2 = new String("ABC");

// operation s1==s2 return false; 
```
---
7. Heap and Stack Memory in Java
	* [Explain]([Java Stack and Heap - Java Memory Management - YouTube](https://www.youtube.com/watch?v=450maTzSIvA))
---
8. Access Modifiers in Java

[image:E9BDD677-A9D2-4586-A803-524E85C4BBD0-5278-0000B051B5FF550B/Screen Shot 2019-07-14 at 16.56.11.png]

---
9. What are the main concepts of OOPs in Java
	1. Inheritance
	2. Encapsulation
	3. Abstraction
	4. [Polymorphism]([Java Programming Tutorial - 55 - Intoduction to Polymorphism - YouTube](https://www.youtube.com/watch?v=0xw06loTm1k))
---
10. Final Keyword
	* *final variable*: a variable is used by final then its value *can’t be changed once assigned*
	* *final method*: the method cannot be overridden by the inheriting class.
	* *final class*: the class cannot be extended by any subclass, but itself can extend other class.
---





























