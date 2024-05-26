import java.util.stream.Collectors

data class Person(val name: String, val age: Int)

fun main() {
    val people = listOf(
        Person("Петя", 25),
        Person("Вася", 30),
        Person("Даша", 25),
        Person("Женя", 30),
        Person("Алексей", 20),
        Person("Иван", 35)
    )

    println(people.groupingBy { it.age }.eachCount())

    val words = listOf(
        "блузка", "Аверс", "кефир", "папоротник", "эскадрон", "атлас", "автоподъемник", "булат", "пророк",
        "лоток", "Арфа"
    )

    println(words.stream().filter { it.startsWith("А") }.collect(Collectors.groupingBy(String::length)))
}