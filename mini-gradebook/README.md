Build a Student class and compute letter grades.

Requirements

Create:

class Student(val name: String) {
private val scores = mutableListOf<Int>()

    fun addScore(score: Int) { /* ... */ }

    fun average(): Double { /* ... */ }

    fun letterGrade(): Char { /* ... */ }
}


Rules:

addScore only accepts 0..100, otherwise ignore or throw (your choice).

average returns 0.0 if no scores.

letterGrade mapping:

90..100 -> 'A'

80..89 -> 'B'

70..79 -> 'C'

60..69 -> 'D'

else 'F'

Test ideas

Student with scores 90, 100, 80 → average 90.0, grade A

Student with no scores → average 0.0, grade F