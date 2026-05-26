fun main() {
    val students = mutableMapOf<String, Int>()

    var sum = 0
    print("Enter number of students : ")
    val totalStudents = readln().toInt()
    println("--------------------------")


    for (i in 1..totalStudents) {
        print("Enter name of Student $i: ")
        val name = readln()
        print("Enter grade of Student $i: ")
        val grade = readln().toInt()
        println("--------------------------")
        students[name] = grade
        sum += grade
    }

    println("\n--- Student Grades with Letters ---")
    for ((name, grade) in students) {
        val letter = when {
            grade >= 90 -> "A"
            grade in 80..89 -> "B"
            grade in 70..79 -> "C"
            else -> "F"
        }
        println("$name: $grade → Grade Letter: $letter")
    }

    val average = sum / totalStudents
    val maxGrade = students.maxByOrNull { it.value }
    val minGrade = students.minByOrNull { it.value }

    println("\n--- Statistics ---")
    println("Number of Students: ${students.size}")
    println("Class Average: $average")
    println("Highest Grade: ${maxGrade?.key} with ${maxGrade?.value}")
    println("Lowest Grade: ${minGrade?.key} with ${minGrade?.value}")

    println("\n--- Students Sorted by Grade ---")
    val sorted = students.toList().sortedByDescending { it.second }
    for ((name, grade) in sorted) {
        println("$name: $grade")
    }
}
