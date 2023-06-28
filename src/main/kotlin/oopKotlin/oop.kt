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
properti ada yang tidak diisi, disini saya mengisi nilai default untuk age
dan juga isMamal, sehingga jika tidak diisi pun tidak apa-apa
 */
class animalWithDefault(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true){
    /*
    kemudian kita juga dapat membuat sebuah constructor buatan kita sendiri
    dengan menggunakan sintax 'init', init berfungsi jika kita ingin
    membuat sebuah constructor yang perlu beberapa validasi dll.
     */
    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}
/*
Kemudian kita juga dapat membuat sebuah secondary constructor
untuk class yang ingin kita inisiasi kan menjadi sebuah objek
 */
class Animal(name: String, weight: Double, age: Int) {
    var name: String //akan tetapi jika var, dia dapat diisi lagi dengan secondary constructor
    val weight: Double //jika dia val maka tidak dapat diisi lagi dengan secondary constructor
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.name = name
        this.isMammal = isMammal
    }
}

/*
Pada kotlin juga terdapat visibility modifier, ketika kita menset
propertinya menjadi private kita tetap perlu untuk membuat getter
dan setter nya sendiri.
 */
class AnimalPrivate(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}

fun main() {
    var harimau = animal("harimau","fajri",true)
    harimau.print()
}