# 🎓 Student Management System (Java)

A simple, menu-driven **Student Management System** in Java that demonstrates:

- 📚 Object-Oriented Programming
- 👨‍👩‍👧‍👦 Class Inheritance (`Student` inherits from `Person`)
- 📥 User Input Handling
- 📊 Grade Calculation Logic
- 🧠 ArrayList usage to manage multiple student records

---

## 📌 Features

- Add student details (name, roll number, course, marks)
- Automatically calculate grade based on marks
- Display all added student records
- Uses Java best practices (constructors, class hierarchy, encapsulation)

---

## 🧱 Class Structure

- Person (Base Class)
  - Student (Inherits Person)
    - rollNo : int
    - course : String
    - marks  : double
    - grade  : char
    - inputDetails()
    - displayDetails()
    - calculateGrade()

Main logic is in the `StudentManagement` class (contains `main()`).

---

## 🚀 How to Run

### Prerequisites:
- Java JDK installed (v8 or above)
- Any Java IDE (IntelliJ, Eclipse) or command line

### 🛠 Compile & Run from Terminal

```bash
javac StudentManagement.java
java StudentManagement
