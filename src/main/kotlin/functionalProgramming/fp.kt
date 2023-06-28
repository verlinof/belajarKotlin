package functionalProgramming

fun main() {
    val fullName = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
    println(fullName)
    //jika beberapa nilai tidak diisi maka nilai nya akan sesuai defaultnya
    val fullNameDefault = getFullNameDefault(first = "fajri")
    println(fullNameDefault)
    val vararg = sumNumbers(10, 15, 30, 50)
    println(vararg)
}

//ini adalah function yang tidak memiliki nilai default
fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}
//ini adalah function yang memiliki nilai default
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

//Vararg(variable argument)
/*
vararg digunakan ketika kita tidak mengetahui jumlah pasti
dari sebuah input, sehingga vararg dapat digunakan untuk menerima
inputan sebanyak apapun
 */
fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}
/*
Sebenarnya vararg adalah Array<out T> sehingga dapat menerima
banyak input
 */
//aturan pada vararg
/*
dalam satu function tidak boleh memiliki lebih dari 1 tipe data
vararg karna akan menimbulkan error
 */
//fun sumNumbers(vararg number: Int, vararg number2: Int)
/*
jika ingin memiliki dua argumen maka yang bertipe data vararg
harus ditaruh diposisi terakhir
 */
fun sets(name: String, vararg number: Int): Int {
    return 0
}

//sets("fajri",10,10,10)
/*
jika ingin vararg didepan maka ketika fungsi dipanggil harus
menuliskan nama argumennya sendiri
 */
fun sets2(vararg number: Int, name: String): Int {
    return 0
}
//set(10,10, name ="kotlin")
