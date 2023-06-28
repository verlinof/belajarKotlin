fun main(args: Array<String>) {
    /*
    val digunakan untuk variabel yang valuenya tidak dapat
    diubah
    sedangkan var digunakan untuk variabel yang valuenya dapat
    diubah-ubah
    * */
    //safe call operator (?) digunakan untuk data yang dapat bernilai null
    println("Section null dan elvis operator")
    val text: String? = null
    println(text)
    //Elvis operator (?:) digunakan untuk memberi nilai default jika data tersebut bernilai null
    val contoh: String? = null
    val contohLength = contoh?.length?:7
    println(contohLength)
    
    //Kita dapat memasukkan variabel kedalam string dengan mengawalinya $
    println("section print variabel kedalam string")
    val name = "fajri"
        //cara 1
    println("hallo " + name);
        //cara 2
    println("hallo $name")

    //kita dapat menggunakan increment untuk tipe data char dalam bahasa kotlin
    println("section increment decrement tipe data char")
    var vocal = 'a'

    println(vocal++) // jika nilai awal adalah a maka nilainya jika ++ maka akan tetap a
    println(vocal--)

    //String dan beberapa fungsi didalamnya
    println("section String dan fungsi")
    val contohString = "kotlin"
    for(char in contohString){
        print("$char")
    }
    val contohUnicode = "hasil dari unicode = \u00A9"
    println(contohUnicode)

    println("contoh trimIndent digunakan untuk menghilangan indentasi")
    val line = """
        line 1
        line 2
        line 3
        Maka indentasi akan dihilangkan
    """.trimIndent()

    println(line)

    /*
    contoh fungsi
    fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
    }
    * */
    println("didalam bahasa kotlin kita juga dapat mengatur mengenai tipe data hasil dari function")
    println("jika tidak ingin memberikan nilai kembalian maka gunakan tipe data UNIT sama seperti VOID")

    //perbedaan unit adalah tidak dapat menggunakan return
    fun printUser(name: String): String{
        return "your name is $name"
    }
    fun printUserUnit(name: String): Unit{
        println("your name is $name")
    }//jika menggunakan Unit makan hasilnya tidak akan dikeluarkan kecuali kita menuliskan print() didepannya

    printUser(name)
    printUserUnit(name) //tidak mneghasilkan apapun karna bertipe Unit

    //kita dapat mengisi sebuah variabel dengan sebuah if else maupun ternary operation
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }

    print("Office is open : $isOpen")

    //array pada kotlin
    /*
    arrayOf() : Array semua tipe data

    intArrayOf() : IntArray

    booleanArrayOf() : BooleanArray

    charArrayOf() : CharArray

    longArrayOf() : LongArray

    shortArrayOf() : ShortArray

    byteArrayOf() : ByteArray

     */

}