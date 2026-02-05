package me.aubsled.workbook

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val newStudent = Student("jimbone")

    newStudent.addScore(1000)
    newStudent.addScore(90)
    newStudent.addScore(80)

    println(newStudent.average())
    println(newStudent.letterGrade())
}