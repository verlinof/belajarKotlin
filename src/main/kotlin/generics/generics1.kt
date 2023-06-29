package generics

/*
Generics dapat kita gunakan untuk membuat sebuah class atau function
ketika kita tidak tahu tipe datanya apa, sehingga kita dapat memisalkannya
dengan menggunakan suatu huruf maupun kata
 */
enum class Rainbow(val color : String) {
    RED("Red"),
    ORANGE("Orange"),
    YELLOW("Yellow"),
    GREEN("Green"),
    BLUE("Blue"),
    INDIGO("Indigo"),
    VIOLET("Violet")
}


fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    val numbers3 = ListNumber<String>()


    println("Values: " + numbers)
    println("Values: " + numbers)
    println("Values: " + numbers)

}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int): T
}

//Contoh generics dengan pembatasan tipe data
class ListNumber<T : Number> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
//contoh generics pada function
//fun <T : Number> List<T>.sumNumber() : T {
//    var hasil = 0
//    for(i in List<T>){
//        var hasil = hasil + i
//    }
//    return hasil;
//}