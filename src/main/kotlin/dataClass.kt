import javax.xml.crypto.Data

fun main() {
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)// hanya akan menampilkan addres penyimpanan
    println(dataUser) // akan menampilkan atribut didalam objek tersebut
    /*
    untuk membuat agar class User dapat mengeluarkan output seperti
    data class maka perlu meng override method toString()
     */

    //equals pada objek
    println("Ini adalah equals pada data class")
    val dataUser1 = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))
    /*
    Jika menggunakan data class yang dibandingkan adalah data
    yang ada didalam objek tersebut
     */
    println("ini adalah equals pada class")
    val user1 = User("nrohmen", 17)
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user1.equals(user2))
    println(user1.equals(user3))
    /*
    Jika menggunakan class saja yang dibandingkan adalah addres
    memory dari objek tersebut
    */
    //menyalin dan memodifikasi class
    val dataUserSalin = DataUser("verlino", 17)
    val dataUserSalin2 = dataUserSalin.copy()
    val dataUserModif = DataUser("aji",17)
    val dataUserModif2 = dataUserModif.copy(age = 25)

    println(dataUserSalin)
    println(dataUserSalin2)
    println(dataUserModif)
    println(dataUserModif2)

    //cara mengambil atribut dari sebuah data class
    val nama = dataUser.component1()
    val umur = dataUser.component2()
    val (nama2, umur2) = dataUser
}

class User(val name : String, val age : Int){
    //agar ketika di print mengeluarkan atribut didalamnya
    override fun toString(): String {
        return "User(name = $name, age= $age"
    }
    //agar dapat membandingkan data didalamnya
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

}

data class DataUser(val name : String, val age : Int)

class dataClass {
   /*
    Kotlin mengenalkan konsep data class yang merupakan
     sebuah kelas sederhana yang bisa berperan sebagai
     data container. Data class adalah sebuah kelas yang
     tidak memiliki logika apapun dan juga tidak memiliki
     fungsionalitas lain selain menangani data.
    */
    /*
    -Konstruktor utama pada kelas tersebut harus memiliki setidaknya satu parameter;
    -Semua konstruktor utama perlu dideklarasikan sebagai val atau var;
    -Modifier dari sebuah data class tidak bisa abstract, open, sealed, atau inner.
     */
}