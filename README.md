<!-- Title Section -->
<h1 align="center">
  Library Management System
</h1>

<!-- Badges Section -->
<p align="center">
  <img src="https://img.shields.io/badge/License-MIT-blue.svg" alt="License">
</p>

<!-- Introduction Section -->
## Introduction

Welcome to the Library Management System project! This Java-based system showcases the implementation of various design patterns to create a flexible and modular solution for managing books and library resources. The project emphasizes the application of essential design principles to achieve a well-organized and extensible codebase.

<!-- Project Aim Section -->
## Project Aim

The primary aim of the Library Management System project is to demonstrate the practical application of popular design patterns in real-world scenarios. By creating a system that allows for dynamic book management, feature addition, book observation, and integration with legacy systems, this project serves as an educational resource for software developers seeking to understand and implement design patterns effectively in the context of library management.

<!-- Design Patterns Section -->
## Design Patterns Used

### 1. Singleton Pattern

- **Description:** Ensures that there is only one instance of the Book class throughout the application.
- **Usage in Project:** The Book class is designed as a singleton, guaranteeing a single representation of a book in the library.

### 2. Strategy Pattern

- **Description:** Defines a family of algorithms, encapsulates each algorithm, and makes them interchangeable.
- **Usage in Project:** The BookGenreStrategy interface and its implementations (MysteryGenreStrategy, FantasyGenreStrategy, DramaGenreStrategy) allow dynamic classification of books based on different genres.

### 3. Decorator Pattern

- **Description:** Attaches additional responsibilities to an object dynamically.
- **Usage in Project:** The BookDecorator interface and its implementation (LanguageDecorator) enable the dynamic addition of features, such as language, to a book.

### 4. Observer Pattern

- **Description:** Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
- **Usage in Project:** The BookObserver interface and its implementation (BookStatusObserver) provide a mechanism to observe and react to changes in the status of a book.

### 5. Adapter Pattern

- **Description:** Allows the interface of an existing class to be used as another interface.
- **Usage in Project:** The LegacyLibrarySystem interface and its implementations (LegacyLibrarySystemImpl, BookAdapter) demonstrate the adaptation of the system to work with a legacy library interface.

### 6. Factory Pattern

- **Description:** Defines an interface for creating an object but leaves the choice of its type to the subclasses.
- **Usage in Project:** The BookFactory class serves as a factory for creating instances of the Book class with different genre strategies.

<!-- Getting Started Section -->
## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Any Java IDE (e.g., IntelliJ, Eclipse) or a text editor
- Git (optional)

### Running the Program

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/library-management.git
    ```

2. Open the project in your preferred Java IDE.

3. Run the Main class to see the example usage of the library management system.
![dia](https://raw.githubusercontent.com/kozhanov7/Final/master/uml.png)
<!-- Example Usage Section -->
## Example Usage

To demonstrate the usage of each design pattern, consider the following example:

```java
// Create a book instance with a mystery genre strategy
Book book = BookFactory.createBook("The Secret Cipher", new MysteryGenreStrategy());

// Add book observers
BookObserver observer1 = new BookStatusObserver("Observer1");
BookObserver observer2 = new BookStatusObserver("Observer2");

book.addObserver(observer1);
book.addObserver(observer2);

// Display book information
System.out.println(book.getTitle());  // Output: The Secret Cipher
System.out.println(book.getGenre());  // Output: Mystery

// Change genre strategy and notify observers
book.setGenreStrategy(new DramaGenreStrategy());

// Add a language decorator
BookDecorator languageDecorator = new LanguageDecorator("French");
book.addDecorator(languageDecorator);

// Display updated book information
System.out.println(book.getGenre());  // Output: Drama, Language: French
