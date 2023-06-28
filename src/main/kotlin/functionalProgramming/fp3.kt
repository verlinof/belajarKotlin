package functionalProgramming

fun main() {
    println("nullable receiver")
    val value: Int? = null
    println(value.slice)
    println(value.slice2)
    println("section function type")
    println(sumResult)
    println(multiplyResult)
    println("section lambda")
    printMessage("fajri")
    println("Higher order Function")
    println(sumHOF(10))
    println("dengan memanggil fungsi lain")
    printResult(20, sumHOF)
    println("dengan fungsi inline")
    printResult(15){
        value -> value + value
    }
    println("inline efisien")
    printResultInline(23){
        value -> value * 2
    }
    println("Lambda with receiver")
    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
    }
    println(message)

}

//section nullable receiver
/*
kita dapat mendeklarasikan sebuah ekstensi dengan nullable receiver
sehinnga ekstensi kita dapat digunakan di semua data bahkan yang bernilai
null
 */
//contoh nullable receiver
val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)
//contoh 2
val Int?.slice2: Int
    get() = this?.div(2)?:0

//section function type
/*
apa itu function type. Seperti namanya, Anda dapat membuat sebuah fungsi menjadi tipe data. Menarik kan?
Kotlin sendiri menggunakan function type untuk tipe
yang berhubungan dengan sebuah fungsi. Dalam penggunaannya,
terdapat beberapa tanda yang berhubungan dengan sebuah fungsi
seperti jumlah dan tipe parameter serta tipe kembalian.
 */
// kita membuat sebuah function dengan dua argumen bertipe Int dan
//outputny juga berupa Int
typealias Arithmetic = (Int,Int) -> Int
val sum: Arithmetic = {valA, valB -> valA + valB}
val multiply: Arithmetic = {valA, valB -> valA * valB}

val sumInvokeResult = sum.invoke(10,10) //bisa menggunakan invoke atau tidak
val sumResult = sum(10,10)
val multiplyResult = multiply(10,20)

/*kita dapat menggunakan function type tanpa perlu membuatnya
berada di dalam variabel dengan menggunakan invoke() setelah
variabel dengan tipe function
*/

//section lambda
/*
lambda expression atau biasa disebut dengan anonymous function
adalah fitur yang cukup populer dalam penulisan fungsi karna dapat
mengurangi tulisan boilerplate, karna penulisannya cukup mudah.
 */
//contoh lambda
val printMessage = { message: String -> println("halo $message") }
val messaggeLength = { message: String -> println("Panjang String ini berjumlah $message") }

//higher order function
/*
adalah lambda akan tetapi kita lebih eksplisit dalam menuliskan
tipe data hasilnya
 */
//contoh higher order function
var sumHOF: (Int) -> Int = { value -> value + value }
//contoh higher order function dengan inline
fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sumHOF(value)
    println(result)
}
fun tambahKurangDibagi(val1: Int, val2: Int, val3: Int): Int {
    return val1 + val2 - val3 / 10
}

//kelemahan inline adalah waktu kompilasinya yang lama dan memakan storage
//cara agar inline lebih efisien
inline fun printResultInline(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

//lambda with receiver
/*
lambda with receiver atau domain specific language(DSL) adalah
sebuah konsep dasar dari kotlin
 */
//contoh
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

