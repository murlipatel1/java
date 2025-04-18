# Full Java Project

This repository contains a collection of Java examples that demonstrate various programming concepts such as design patterns, multithreading/concurrency, exception handling, Java collections, and core Java concepts.

## Table of Contents
- [Design Patterns](#design-patterns)
  - [Singleton](05_design_pattern/SingletonExample.java)
  - [Factory Pattern](05_design_pattern/FactoryPatternExample.java)
  - [Builder Pattern](05_design_pattern/BuilderPatternExample.java)
  - [Adapter Pattern](05_design_pattern/AdapterPatternExample.java)
  - [Prototype Pattern](05_design_pattern/PrototypePatternExample.java)
  - [SOLID Principles](05_design_pattern/SOLID/)
    - [Single Responsibility Principle](05_design_pattern/SOLID/SingleResponsibilityPrinciple.java)
    - [Open/Closed Principle](05_design_pattern/SOLID/OCPExample.java)
    - [Liskov Substitution Principle](05_design_pattern/SOLID/LSPExample.java)
    - [Interface Segregation Principle](05_design_pattern/SOLID/ISPExample.java)
    - [Dependency Inversion Principle](05_design_pattern/SOLID/DIPExample.java)
- [Multithreading & Concurrency](#multithreading--concurrency)
  - [Basic Threads and Runnable](04_multithreading_concurrency/ThreadExample1.java)
  - [Using ExecutorService](04_multithreading_concurrency/ExecutorServiceDemo.java)
  - [ThreadPoolExecutor](04_multithreading_concurrency/ThreadPoolExecutorDemo.java)
  - [Synchronization and Locks](04_multithreading_concurrency/WithoutSync.java, LockExample.java)
  - [Wait/Notify](04_multithreading_concurrency/WaitNotifyExample.java)
  - [Deadlock Demo](04_multithreading_concurrency/DeadlockDemo.java)
  - [Volatile and Atomic Examples](04_multithreading_concurrency/VolatileExample.java)
  - [Callable and CompletableFuture](04_multithreading_concurrency/Callable_Completed_FutureExample.java)
- [Exception Handling](#exception-handling)
  - [Unchecked Exceptions](03_exception_handling/UncheckedExceptionDemo.java)
  - [Checked Exceptions](03_exception_handling/CheckedExceptionDemo.java)
  - [Custom Exceptions](03_exception_handling/CustomExceptionDemo.java)
  - [Throw / Throws Example](03_exception_handling/ThrowThrowsExample.java)
- [Java Collections](#java-collections)
  - [ArrayList, LinkedList Demo](02_java_collections/ListDemo.java)
  - [PriorityQueue Demo](02_java_collections/PriorityQueueDemo.java)
  - [Set, TreeSet & HashSet Demo](02_java_collections/SetDemo.java)
  - [CopyOnWriteArrayList Demo](02_java_collections/CopyOnWriteArrayListDemo.java)
  - [ConcurrentHashMap Demo](02_java_collections/ConcurrentHashMapDemo.java)
  - [ArrayDeque Demo](02_java_collections/ArrayDequeDemo.java)
  - [Comparator and Comparable Demos](02_java_collections/ComparatorDemo.java, ComparableDemo.java)
- [Core Java Concepts](#core-java-concepts)
  - [OOP Concepts](01_java_core/OOPConceptsDemo.java)
  - [Data Types and Operators](01_java_core/DataTypesDemo.java, OperatorsDemo.java)
  - [Method, Constructor, Static and Final](01_java_core/MethodConstructorStaticFinalDemo.java)
  - [Control Statements](01_java_core/ControlStatementsDemo.java)
  - [Arrays and Strings](01_java_core/ArraysStringsDemo.java)

## Project Overview

This project is organized into multiple packages (folders) to clearly separate examples by topic:

- **05_design_pattern**  
  Demonstrates various design patterns. Each example is self-contained and can be compiled and executed individually.
  
- **04_multithreading_concurrency**  
  Shows different multithreading and concurrency techniques including thread creation, synchronization mechanisms, thread pools, and executors.
  
- **03_exception_handling**  
  Contains examples of handling both checked and unchecked exceptions, custom exceptions, and exception propagation.
  
- **02_java_collections**  
  Covers the Java Collections Framework with demonstrations using lists, sets, maps, queues, and sorting with comparators.
  
- **01_java_core**  
  Provides examples covering the fundamentals of Java programming including OOP concepts, data types, operators, control statements, arrays, and strings.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or later
- A Java IDE or text editor (e.g., Visual Studio Code)
- Command line terminal (for compiling and running Java applications)

### Compiling and Running Examples

To compile any example, navigate to the folder containing the Java file and run:
```
javac FileName.java
```
Then run the compiled class:
```
java ClassName
```
For example, to run the `OOPConceptsDemo.java`:
```
javac java\01_java_core\OOPConceptsDemo.java
java -cp java OOPConceptsDemo
```

Alternatively, you can open the project in Visual Studio Code and use its integrated terminal and run/debug features.

## Contributing

Feel free to fork the repository and submit pull requests if you have any suggestions or improvements.

## License

This project is provided as-is for educational purposes.
