//!! digunakan untuk menjadikan sebuah variabel yang null sebagai nullPointerException
// Sehingga !! memiliki fungsi yang berkebalikan dengan elvis operator yang sebagai Null Safety Operator

/*
 lateInit digunakan ketika kita ingin membuat sebuah variabel akan tetapi
 kita ingin mengisinya untuk nanti, untuk mengecek variabel lateInit apakah
 sudah diinisialiasi kita dapat menggunakan variable.isInitialized
 mengembalikan True jika sudah, dan False jika belom
 */
//Contoh
class GFG {

    // Declaring a lateinit variable of Int type
    lateinit var myVariable: String
    fun initializeName() {

        // Check using isInitialized method
        println("Is myVariable initialized? " + this::myVariable.isInitialized)

        // initializing myVariable
        myVariable = "GFG"

        // Check using isInitialized method
        println("Is myVariable initialized? " + this::myVariable.isInitialized)
    }
}

fun main(args: Array<String>) {

    // Calling method
    GFG().initializeName()
}
