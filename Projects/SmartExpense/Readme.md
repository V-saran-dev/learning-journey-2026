# 💰 SmartExpense – Personal Expense Tracker

SmartExpense is a **console-based personal expense tracking application developed in Java**. It allows users to record, view, categorize, and manage their income and expenses through a simple command-line interface.

The project demonstrates core Java programming concepts along with practical application development, object-oriented programming, and basic data management.

## 🚀 Features

* Add income and expense transactions
* Categorize transactions
* Store transaction descriptions
* Record transaction amounts
* View all transactions
* Calculate total income
* Calculate total expenses
* Calculate current balance
* Simple and user-friendly console interface
* Persistent data management using file handling

## 🛠️ Technologies Used

* **Java**
* **Object-Oriented Programming (OOP)**
* **Java Collections**
* **File Handling**
* **Exception Handling**
* **Git & GitHub**

## 📂 Project Structure

```text
SmartExpense/
│
├── src/
│   └── ...
│
├── .gitignore
├── README.md
└── ...
```

> Compiled Java `.class` files are excluded from the repository using `.gitignore`.

## 📋 Example

The application provides a menu similar to:

```text
===== SmartExpense =====

1. Add Transaction
2. View Transactions
3. View Balance
4. Exit

Enter your choice:
```

A transaction contains information such as:

```text
ID: 1
Type: INCOME
Category: Income
Amount: ₹50000.0
Description: Salary
```

Example expense:

```text
ID: 2
Type: EXPENSE
Category: Food
Amount: ₹500.0
Description: Lunch
```

The application can then use these transactions to determine the user's overall financial balance.

## 🧠 Concepts Demonstrated

### Object-Oriented Programming

The project uses Java OOP principles to organize transaction and application logic into separate classes.

Concepts demonstrated include:

* Classes and Objects
* Encapsulation
* Constructors
* Methods
* Enums
* Object relationships

### Collections

Java collections are used to manage multiple transactions efficiently.

### File Handling

Transaction information can be stored and retrieved using Java file-handling techniques, allowing data to persist between application runs.

### Exception Handling

The application handles invalid input and potential runtime/file-related errors to make the program more reliable.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone <YOUR_GITHUB_REPOSITORY_URL>
```

### 2. Navigate to the project

```bash
cd SmartExpense
```

### 3. Compile the Java files

Compile the source files using:

```bash
javac *.java
```

If your Java files are inside a `src` directory, compile them from the appropriate source directory.

### 4. Run the application

For example:

```bash
java Application
```

Replace `Application` with the class containing your `main()` method if your entry-point class has a different name.

## 🔐 Git Configuration

The project includes a `.gitignore` file to prevent unnecessary generated files from being uploaded to GitHub.

Ignored files include:

```gitignore
*.class
bin/
out/
target/
.vscode/
.idea/
*.iml
```

This keeps the repository clean by storing the **source code rather than compiled Java files**.

## 📈 Future Improvements

Possible improvements for future versions include:

* Monthly expense reports
* Budget management
* Spending analytics
* Search and filtering transactions
* CSV/Excel export
* Database integration using MySQL
* GUI using JavaFX or Swing
* User authentication
* Graphical spending charts

## 👩‍💻 Author

**Vanshika Saran**

B.Tech – Computer Science & Engineering (Artificial Intelligence)

Institute of Engineering and Technology, Lucknow

---

⭐ If you find this project useful, consider giving the repository a star!
