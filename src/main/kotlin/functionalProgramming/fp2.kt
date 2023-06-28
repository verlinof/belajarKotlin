package functionalProgramming

fun main() {
    //contoh ekstensi function
    10.printInt()
    println(10.plusThree())
    //contoh ekstensi properti
    println(10.5.slice)
}

/*
kode dibawah ini eror karna class ini bertipe data Int yang
final sehingga tidak dapat dicompile ketika hasilnya beda tipe
 */
//class NewInt : Int(){
//    fun printInt(){
//        println("value $this")
//    }
//}
/*
agar dapat menggunakan fungsi tersebut kita dapat membuatnya menjadi
sebuah extension.
 */

//extension functions

fun Int.printInt(){
    println("values $this") //this merujuk pada Int
}
fun Int.plusThree(): Int{ // harus dituliskan tipe data jika return
    return this + 3
}
//extension properti
val Double.slice: Double
    get() = this /2