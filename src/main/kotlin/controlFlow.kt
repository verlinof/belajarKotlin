fun main() {
    /*
    control flow adalah cara kita mengontrol alur dari sebuah program
    berdasarkan kondisi saat program tersebut berjalan
    seperti looping
     */
    //enumeration
    /*
    Enumeration merupakan salah satu fitur yang bisa kita
    gunakan untuk menyimpan kumpulan objek yang telah
    didefinisikan menjadi tipe data konstanta. Enumeration
    dapat ditetapkan sebagai nilai ke dalam sebuah variabel
    dengan cara yang lebih efisien. Selain itu, Enumeration
    juga dapat digunakan untuk meminimalisir kesalahan dalam
    pengetikan nilai sebuah variabel, misalnya:
     */
    println("ini adalah enum yang memiliki value")
    println(Color.RED)
    println(Color.GREEN)
    println(Color.BLUE)

    println("ini adalah enum yang tidak memiliki value")
    println(color2.RED)
    println(color2.GREEN)
    println(color2.BLUE)

    println("ini adalah enum yang memiliki function override")
    println(Color3.RED.printValue())
    println(Color3.GREEN.printValue())
    println(Color3.BLUE.printValue())


    println("ini adalah foreach untuk membaca sebuah array")
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }

    println("digunakan untuk menampilkan value dari sebuah warna dari class color")
    val color: Color = enumValueOf("RED")
    println("color is $color")
    println("Color is ${color.value.toString()}")
    /*
    Selain itu, kita juga dapat menambahkan perintah yang
    lebih spesifik dengan menambahkan abstract function dan
    mendeklarasikan anonymous class untuk setiap objek Enum,
    misalnya:
     */

    //section range
    println("ini adalah section untuk tipe data range")
    val rangeInt = 1..10
    println(rangeInt.step)
    rangeInt.forEach(){
        print(" $it ")
    }
    println("")
    println("ini adalah range dengan menggunakan step")
    val rangeIntStep = 1..10 step(2)
    println(rangeInt.step)
    rangeIntStep.forEach {
        print(" $it ")
    }
    println("")
    println("ini adalah range dengan downTo")
    val rangeIntDownTo = 10.downTo(1)
    println(rangeInt.step)
    rangeIntDownTo.forEach {
        print(" $it ")
    }
}

//class enum
enum class Color(val value:Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class color2{
    RED, GREEN, BLUE
}

enum class Color3(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

enum class Color4(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

