package latihanStudiKasus

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)

    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    }
    else{
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if(age < 25 && isMonday){
        return 15
    }else if(age > 60 && isMonday){
        return 20
    }else{
        return 25
    }
}