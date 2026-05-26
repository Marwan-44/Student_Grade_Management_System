# 🎓 Student Grades System (Kotlin Console App)

A simple Kotlin console application that manages student grades, calculates statistics, and displays performance analysis in a clean and structured way.

---

## 📌 Features

- Add student names and grades
- Assign letter grades (A, B, C, F)
- Calculate class average
- Find highest and lowest grades
- Display students sorted by grade (descending order)

---

## 🧠 How It Works

The program stores student data using a Kotlin `MutableMap`:
```
val students = mutableMapOf<String, Int>()
````
* Key → Student Name
* Value → Student Grade

It then processes the data to generate statistics and formatted outputs.

---

## 📊 Grade System

| Grade | Range    |
| ----- | -------- |
| A     | 90 - 100 |
| B     | 80 - 89  |
| C     | 70 - 79  |
| F     | Below 70 |

---

## 📂 Project Structure
```
src/
 └── StudentGrades.kt
    id="structure_student"
```

## 🧪 Example Output

```
Choose number of students: 3

Enter name of Student 1: Ali
Enter grade of Student 1: 95

Enter name of Student 2: Sara
Enter grade of Student 2: 82

Enter name of Student 3: Omar
Enter grade of Student 3: 74

--- Student Grades with Letters ---
Ali : 95 → Grade Letter : A
Sara : 82 → Grade Letter : B
Omar : 74 → Grade Letter : C
```
---

## 📈 Statistics

- Number of Students
- Class Average
- Highest Score
- Lowest Score
- Sorted Ranking

---

## 🛠️ Technologies Used

- Kotlin (JVM)
- Mutable Maps
- Loops & Conditions
- When expressions
- Sorting algorithms
- Console input/output

---

## 🚀 Future Improvements

- Add file/database storage
- Add GUI (Android app version 📱)
- Add subject-based grading
- Add charts and analytics
- Export results to file

---

## 👨‍💻 Author

Built by Marwan 🚀  
Aspiring Android Developer & Software Engineer
