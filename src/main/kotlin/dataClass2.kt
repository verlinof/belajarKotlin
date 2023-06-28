fun main() {
    /*
    list hampir sama dengan array,
    bedanya adalah ukuran dari list dapat berubah, sedangkan
    ukuran array tidak dapat diubah, akan tetapi list yang dapat
    dimodifikasi adalah mutableListOf() saja.
     */
    //list dibawah tidak dapat kita ubah apapun hanya read-only
    println("section list")
    val listBiasa = listOf("halo", 15, true)
    println(listBiasa[1])
//    listBiasa.add('a') akan error karna bersifat immutable
    //sedangkan list dibawah dapat kita ubah-ubah
    var listMutable = mutableListOf("halo", 'a',5,"tes")
    listMutable[1] = "halo"
    listMutable.add(3, "halo di index 3")
    listMutable.add("tes")
    listMutable.removeAt(3)
    //section Set
    println("section set")
    /*
    Set adalah sebuah kumpulan data angka
    Secara otomatis sebuah set akan membuang angka yang bernilai sama
    sehingga tidak ada nilai yang bernilai sama dalam satu set
    set memiliki sifat yang hampir sama dengan list, set default
    bersifat immutable sehingga data didalamnya tidak dapat diubah
    kita perlu menggunakan mutableSetOf() untuk set yang mutable
     */
    val setA = setOf(1,2,2,3,4,5)
    for(data in setA){
        print(data)
    }
    println("")
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    /*
    gabungan dalam set
     */
    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
    /*
    Pada Mutable Set kita bisa menambah dan menghapus
    item namun tak bisa mengubah nilai seperti pada List.
     */
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
//mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

    //section Map
    println("Section Map")
    /*
    map adalah turunan dari collection yang berisi key-value
    sifatnya hampir sama dengan dictionary yang ada di Python
     */
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    //dikiri adalah key kemudian kanan adalah valuenya
    println(capital["Jakarta"])
    val mapValues = capital.values
    println(mapValues)
    val mapKeys = capital.keys
    println(mapKeys)
    /*
    Untuk menambahkan key-value ke dalam map, kita perlu
    memastikan bahwa map yang digunakan adalah mutable.
    Mari kita ubah map capital yang sudah kita buat
    sebelumnya menjadi mutable.
     */
    val mutableCapital = capital.toMutableMap()

    //input kedalam map harus menggunakan put
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    //filter digunakan untuk memfilter data yang lolos kualifikasi
    //map digunakan untuk mengubah nilai pada sebuah list sesuai dengan keinginan
    val list = (1..10).toList()
    list.map { it * 5 }.forEach{
        print(" $it ")
    }
    println(" ")
    list.filter { it % 2 ==0 }.forEach{
        print(" $it ")
    }
    println("")
    //kemudian selanjutnya adalah sequence
    /*
    sequence memiliki fungsi yang hampir sama dengan filter akan tetapi
    filter menggunakan horizontal evaluation sehingga dia akan mengecek
    data terlebih dahulu baru dimap, sedangkan untuk sequence dia hanya
    mengecek data yang benar saja sehingga lebih efisien.
     */
    val listSequence = (1..100).toList()
    listSequence.asSequence().filter { it %2 == 0 }.forEach {
        print(" $it ")
    }
    println()
    /*
    dengan menggunakan sequence operasi dilakukan secara vertikal
    sedangkan pada filter dilakukan secara horizontal
     */
}
