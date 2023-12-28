fun main() {
    // 1. Работа с преобразованием строк
    val strLength = "Hello, World!".length
    println("Длина строки: $strLength")

    // 2. Базовая арифметика и вывод результата в консоль
    val a = 5
    val b = 3
    val sum = a + b
    println("Сумма чисел $a и $b равна $sum")

    // 3. Примеры интерполяции строк
    val name = "Андрей"
    val age = 25
    println("Привет, меня зовут $name и мне $age лет.")

    // 4. Преобразование типов
    val numStr = "42"
    val numInt = numStr.toInt()
    println("Строка $numStr преобразована в число: $numInt")

    // 5. Пример условных операторов (if else)
    val x = 10
    val y = 20
    if (x > y) {
        println("$x больше $y")
    } else {
        println("$x меньше или равно $y")
    }

    // 6. Пример циклов (for и while)
    // Цикл for
    for (i in 1..5) {
        println("Итерация $i")
    }

    // Цикл while
    var counter = 0
    while (counter < 3) {
        println("Counter: $counter")
        counter++
    }

    // 7. Пример создания отдельной функции
    greet("Андрей")

    // 8. Пример работы с массивом
    val numbers = arrayOf(1, 2, 3, 4, 5)
    for (num in numbers) {
        println("Число: $num")
    }
}



fun greet(name: String) {
    println("Привет, $name!")
}
