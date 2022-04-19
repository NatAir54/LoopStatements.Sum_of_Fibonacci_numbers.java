# Flow control. Loop statements.

The purpose of this exercise is to train you to work with loop statements.

Estimated workload of this exercise is _30 min_.

### Description
Please, proceed to [`LoopStatements`](src/main/java/com/epam/rd/autotasks/LoopStatements.java) class
and implement its static methods:
---
* `int task3(int n)`\
  Task 3:
  For a positive integer n, calculate the result value, which is equal to the sum of the first n Fibonacci numbers.
  Note. Fibonacci numbers are a series of numbers in which each next number is equal to the sum of the two
  preceding ones: 0, 1, 1, 2, 3, 5, 8, 13... (the value of the fist element in Fibonacci numbers is "0", the values of the second and the third elements are equal to "1", for other elements use the formula F(n)=F(n-1)+F(n-2))
 
###  Example:  
`n = 8 `   -> result =  33   
`n = 11`  ->  result =  143  

---

### Examples

---
Code Sample:
```java
...
System.out.println(LoopStatements.task3(8));
```

Output:
```
33
```

---
Code Sample:
```java
...
System.out.println(LoopStatements.task3(11));
```

Output:
```
143
```

