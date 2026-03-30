# 10211CS225: Problem Solving and Testing using Java
**L T P C:** 1 0 4 3

## A. Preamble
This course focuses on applying functional programming, algorithmic problem-solving patterns, object-oriented design, and efficient data handling techniques. It equips students with practical skills for competitive programming and software development through structured coding practices and systematic testing methods.

## B. Prerequisite Course
Nil

## C. Course Objectives
Learners are able to:
- Practice functional programming features for writing clean and efficient code.
- Apply algorithmic patterns to solve time and space-constrained problems.
- Design reusable object-oriented solutions for programming challenges.
- Select suitable collections for efficient data handling and performance.
- Assess program correctness using testing, debugging, and logging tools.

## D. Course Outcomes
Upon the successful completion of the course, students will be able to:

| COs | Course Outcomes | K Level |
|-----|-----------------|---------|
| CO1 | Use functional programming constructs to process data effectively. | K3 |
| CO2 | Apply algorithmic thinking to develop optimized solutions. | K3 |
| CO3 | Design object-oriented structures for problem solving. | K3 |
| CO4 | Utilize Java collections to manage data with performance awareness. | K3 |
| CO5 | Implement testing and debugging techniques to ensure program reliability | K3 |

## E. Correlation of COs with Program Outcomes and Programme Specific Outcomes

| COs | PO1 | PO2 | PO3 | PO4 | PO5 | PO6 | PO7 | PO8 | PO9 | PO10 | PO11 | PSO1 | PSO2 | PSO3 |
|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|------|------|------|------|------|
| CO1 | 2   | 1   | 2   | 1   | 3   | -   | -   | -   | -   | -    | -    | 2    | 3    | 2    |
| CO2 | 3   | 3   | 2   | 2   | 2   | -   | -   | -   | -   | -    | -    | 3    | 3    | 2    |
| CO3 | 2   | 2   | 3   | 1   | 2   | -   | -   | -   | -   | -    | -    | 2    | 3    | 2    |
| CO4 | 2   | 2   | 2   | 1   | 3   | -   | -   | -   | -   | -    | -    | 2    | 3    | 2    |
| CO5 | 1   | 2   | 2   | 2   | 3   | -   | -   | -   | -   | -    | -    | 1    | 3    | 3    |

*3- High; 2-Medium; 1-Low*

## F. Course Contents

### UNIT I – Functional Programming (3 Hours)
Introduction to functional programming concepts – Lambda expressions – Functional interfaces – Method references – Streams API – Date and Time API (java.time package) – Collectors API - Custom comparators and sorting logic.

### UNIT II – Algorithmic Thinking & Competitive Problem Patterns (3 Hours)
Constraint-driven solution design – Competitive problem patterns - Writing Efficient Code: Strassen’s matrix multiplication - Kadane’s algorithm for finding maximum subarray sum - String Handling – Knuth Morris Pratt pattern matching – Boyer Moore Algorithm for substring search – Manacher Algorithm for finding longest palindromic substring.

### UNIT III – Object-Oriented Problem Solving (3 Hours)
Object modelling for algorithmic problems - Class to class interaction, Class to method interaction - Inheritance - Designing reusable classes - Polymorphic behavior in algorithm design - Design Pattern - Interface-based design for extensibility - Immutable objects for safe computation - Exception-driven flow control in competitive environments.

### UNIT IV – Advanced Data Handling using Collections (3 Hours)
Advanced problem solving using Vector, LinkedList, Arrays, Collections, ArrayList, HashSet, HashMap – Frequency counting using HashMap - Nested Collections.

### UNIT V – Advanced Software Testing (3 Hours)
Black box vs White Box – Stress testing - JUNIT – Test Life cycle methods - `assertEquals` - TimeOut error - Advanced features – Parameterized Testing - Logging: Log4j framework utilization. Debugging: How to Debug in Integrated Development Environment, Launch/Attach Breakpoints/Conditional Breakpoints - Step In/Out/Over Variables. Edge case identification and Stress testing.

**TOTAL: 15 Hours**

## G. Laboratory Experiments

This section covers the practical tasks implemented in the repository based on the syllabus.

### PART – A

* **Task 1**: Find the second highest number in a list of integers using Stream API.
* **Task 2**: Write Lambda expressions for `isOdd()`, `isPrime()`, and `isPalindrome()`.
* **Task 3**: Sort persons alphabetically, filter by age, and convert names to uppercase using method references.
* **Task 4**: Process a list of events using Java's `java.time` Date and Time API for chronological sorting, boundary detection, and month filtering.
* **Task 5**: Sort students by marks (descending) and name using Java Streams and Collectors API, returning the top K students.
* **Task 6**: Process sales records to calculate total category sales and identify the top-selling item per category.
* **Task 7**: Calculate the prefix sum of a given array.
* **Task 8**: Return the maximums in a sliding window of size `k` over an array.
* **Task 9**: Remove duplicates from a sorted integer array in-place.
* **Task 10**: Return the count of substrings in a text that are anagrams of a given pattern.
* **Task 11**: Find the count of numbers in a given list that are divisible by a target integer `K`.
* **Task 12**: Encrypt a lowercase string by replacing contiguous characters with their count in hexadecimal format and reversing it.
* **Task 13**: Design an `EntityRecord` system storing dynamic details and print them in their addition order.
* **Task 14**: Implement a vehicle rental system with inheritance (`Car`, `Bike` extending `Vehicle`) to compute differential rents.
* **Task 15**: Model an e-commerce payment system using polymorphic inheritance (`CreditCardPayment`, `PayPalPayment`, `UPIPayment`).
* **Task 16**: Create an extensible web notification system structured via abstract interfaces (`EmailNotification`, `SMSNotification`, `PushNotification`).
* **Task 17**: Develop an explicitly exception-driven order processor throwing and handling `InsufficientStockException`.
* **Task 18**: Structure a safe banking module with multi-account operations simulating `DEPOSIT`, `WITHDRAW`, and `TRANSFER` logic.
* **Task 19**: Retrieve the top `k` most frequent elements from an array using Priority Queues.

### PART – B

* **Task 20**: Implement an `LRUCache` logic utilizing a `HashMap` combined with a Doubly-Linked List to enforce O(1) constraints.
* **Task 21**: Solve if a given number is a COLORFUL Number utilizing a `HashSet`.
* **Task 22**: Find the minimum overlapping meeting room count utilizing a `TreeMap` sweep-line tracking algorithm.
* **Task 23**: Conditionally filter items greater than a threshold and perform a descending + lexicographical fallback sort using an `ArrayList` and Java Streams.
* **Task 24**: Develop rigorous `JUnit` tests to assert edge behaviors of a movie `RecommendationEngine`.
* **Task 25**: Run `JUnit 5` bounds checking upon algorithmic modules testing Arrays for scenarios like Max SubArray Sum, Prefix Sums, and Frequency counts.
* **Task 26**: Identify and fix bugs within a stream sequence dealing with inactive/empty users inside a `UserAnalytics` aggregation module.
* **Task 27**: Write a thread-safe Banking concurrency simulation to be stress-tested alongside comprehensive Log4j `LoggingService` reporting.
* **Task 28**: Establish a scale test load of a million elements into `RecommendationEngine` running via `TreeMap` metrics mapping.

**TOTAL: 60 Hours**

## H. Learning Resources

### i. Text Books
1. Raoul-Gabriel Urma, Mario Fusco, & Alan Mycroft. (2019). Modern Java in Action, Second Edition, Manning Publications.
2. Joshua Bloch. (2018). Effective Java, Third Edition, Addison-Wesley Professional. 
3. Kent Beck & Erich Gamma. (2019). JUnit in Action, Third Edition, Manning Publications. 
4. M. A. Weiss, Data Structures and Algorithm Analysis in Java, 3rd ed., Pearson Education, New Delhi, India, ISBN 978-8131760635.
5. M. T. Goodrich, R. Tamassia, M. H. Goldwasser, and S. Banerjee, Data Structures and Algorithms in Java, 6th ed., Indian Adaptation, Wiley India Pvt. Ltd., 2022, ISBN 978-9354247934.

### ii. Reference Books
1. Kathy Sierra & Bert Bates. (2017). Head First Java (2nd ed.). O’Reilly Media.
2. Steven S. Skiena. (2020). The Algorithm Design Manual, Third Edition, Springer. 

### iii. Online Resources
1. Competitive Programming - A Complete Guide, [Online] https://www.geeksforgeeks.org/dsa/competitive-programming-a-complete-guide/
2. Junit5 - [Online] https://www.geeksforgeeks.org/software-testing/introduction-to-junit-5/
3. Take U Forward - Strivers SDE Sheet - [Online] www.takeuforward.org
4. Leetcode.com - [Online] https://www.leetcode.com
5. Codechef.com - [Online] https://www.codechef.com
