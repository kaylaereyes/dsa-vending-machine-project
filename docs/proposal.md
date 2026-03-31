# Project Proposal: Vending Machine Simulation (Java)

This project is a Java-based vending machine simulation designed to demonstrate core programming concepts in data structures and algorithms. The application will allow users to select items, input payment, and receive appropriate output based on transaction logic.

The purpose of this project is to apply fundamental programming techniques in a real-world scenario while reinforcing concepts such as arrays, control flow, and object-oriented design.

## Objectives

The goal of this project is to simulate a vending machine system while analyzing how different data structures and algorithms impact performance, scalability, and efficiency in handling transactions and inventory.

In real-world systems, vending machines must quickly process user input, search for items, and manage inventory efficiently. The choice of underlying data structures can significantly affect response time, memory usage, and code maintainability.

This project aims to explore these trade-offs by implementing and comparing multiple approaches to solving the same problem.

- Develop a functional vending machine simulation using Java  
- Apply array-based data storage for items and pricing  
- Implement conditional logic to process user transactions  
- Practice input validation and error handling  
- Write clean, modular, and maintainable code

## Three Problem based Solutions

### Solution 1: Array-Based Implementation
Store items in arrays (names, prices, quantities)
Use linear search for item selection  

Pros:
Simple to implement
Low overhead  

Cons:
Slower search time (O(n))
Less scalable  

### Solution 2: ArrayList-Based Implementation
Use Java ArrayList for dynamic storage
Improved flexibility over static arrays  

Pros:
Dynamic resizing
Easier data management  

Cons:
Still linear search (O(n))
Slightly higher memory overhead  

### Solution 3: HashMap-Based Implementation
Store items using key-value pairs (e.g., item code → item object)

Pros:
Fast lookup (O(1))
Scalable for large inventories  

Cons:
More complex implementation
Requires understanding of hashing  

## Core Features (MVP - Phase 1)
- Display a list of available items with corresponding prices  
- Allow the user to select an item  
- Accept user input for payment  
- Verify if sufficient funds are provided  
- Dispense the selected item  
- Calculate and return change  
- Handle invalid input and edge cases  

## Expanded Features (NTH - Future Scope)
- Inventory tracking (item quantities)  
- Out-of-stock handling  
- Multiple transactions within a single session  
- Admin mode for restocking items  
- Sales tracking and reporting  
- Improved user interaction and experience

## Data Structures & Algorithms
This project will incorporate the following concepts:
- Arrays for storing item names, prices, and quantities  
- Iteration (loops) for traversing and displaying items  
- Conditional statements for transaction validation  
- Basic searching techniques for item selection  
- Input validation and control flow logic

## Technologies Used
- Java  
- IntelliJ IDEA (Student License)  
- GitHub (version control and collaboration)

## Project Structure
src/ Main.java VendingMachine.Java Item.Java

docs/ proposal.md resources.md (may be consolidated to readme.md in future iterations)

## Development Plan
- **Phase 1:** Implement core vending machine functionality  
- **Phase 2:** Refactor code into separate classes (Item, VendingMachine)  
- **Phase 3:** Add enhanced features such as inventory tracking and error handling if time permits
- **Phase 4:** Final testing, documentation, and submission  

## Status
Project is being:
- [x] Planned
- [ ] Proposed
- [ ] Programmed
- [ ] Tested
- [ ] Submitted
