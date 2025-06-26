# Java Quiz Application

This is a simple Java-based **Quiz Application** with a graphical user interface (GUI) built using **Swing**. The application allows a user to enter their name, view quiz rules, answer a series of multiple-choice questions, and view their score at the end.

> ⚠️ Note: This is a standalone GUI application. It does **not** include user authentication, password validation, or database integration.

---

## ✨ Features

- 🧑‍💻 **Basic Login Form** – Collects user name (no authentication or password).
- 📜 **Rules Window** – Displays quiz instructions before starting.
- ❓ **Quiz Module** – 10 multiple-choice questions with a timer.
- 📊 **Score Summary** – Displays total score at the end.
- 📚 **Hardcoded Questions** – Questions, options, and correct answers are hardcoded into the Java source (`Quiz.java`).

---

## 🛠 Technologies Used

- **Java** (JDK 8+)
- **Java Swing** (for GUI)
- No external libraries or databases required

---

## 📂 Project Structure

├── Login.java # GUI for name input and starting quiz
├── Rules.java # Instructions display screen
├── Quiz.java # Quiz logic with hardcoded questions and timer
├── Score.java # Final score display screen



## 🧠 About the Questions

All questions, options, and correct answers are **manually hardcoded** in the `Quiz.java` file using arrays. This makes the application lightweight and easy to run but is not scalable for larger quizzes or dynamic content.

### ✅ Future Improvements

- Integrate with a database to load and store questions.
- Add login authentication and user management.
- Enable result saving and score history.
- Use JSON/CSV/XML for importing/exporting quiz data.

---

This project was developed during self-study to strengthen skills in core Java, GUI development.

Feel free to contribute!
