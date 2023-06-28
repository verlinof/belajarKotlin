package oopKotlin

/*
class dibawah ini mengharuskan kita untuk menuliskan semua propertinya
ketika class ini dibuat menjadi objek
 */
class animal(var type: String,var name: String, var isMamal: Boolean){
    //function biasa
    fun print(): Unit{
        println("Tipe = ${type}, nama = ${name}, isMamal = ${isMamal}")
    }

    //function ekstensi
    val animal.animalInfo: String
        get() = "tipe = ${type}, nama = ${name}"

}

/*
Kita dapat mengantisipasinya dengan memberikan nilai default ketika
properti ada yang tidak diisi
 */
class animalWithDefault(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)



fun main() {
    var harimau = animal("harimau","fajri",true)
    harimau.print()
}