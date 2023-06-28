package functionalProgramming


/*
kotlin hadir dengan beberapa extension function dari sebuah
objek yang menggunakan lambda sebagai argumen
 */

//Scope Function
/*
Menuliskan logika kode di dalam konteks dari sebuah objek
dinamai dengan Scope function, contohnya let, run, with, apply, dan
also
 */
fun main() {
    //lambda receiver (this)
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }
    var contohBuild = buildString
    println(contohBuild)

    //lambda argument (it)
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    } //it digunakan untuk merujuk variabel sebelum .let

    //fungsi run
    println("section run")
    val textRun = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")

    //let dengan data Null
    println("section let")
    val message: String? = "verlino"
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    //fungsi also digunakan untuk menjalankan 2 perintah sekaligus
    println("section also")
    val textAlso = "Hello Kotlin"
    val resultAlso = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")

    //member references
    fun count(valueA: Int, valueB
    : Int): Int {
        return valueA + valueB
    }
    val sum: (Int, Int) -> Int = ::count

    fun isEvenNumber(number: Int) = number % 2 == 0
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber) // yang memenuhi isEvenNumber maka akan masuk

    println(evenNumbers)

    //property references
    println("section property references")
    // kita dapat menggunakan sebuah setter dan getter terhadap
//    var message1 = "Kotlin" // nilai ini harus nya diluar main()
//    println(::message1.name)
//    println(::message1.get())
//
//    ::message1.set("Kotlin Academy")
//
//    println(::message1.get())

    /*
    Function didalam function, kita dapat membuat sebuah function
    didalam sebuah function, dan juga function didalam dapat mengambil
    parameter dari function terluar
     */
    fun setWord(message: String) {
        fun printMessage(text: String) {
            println(message + text)
        }

        printMessage(text)
    }
}
