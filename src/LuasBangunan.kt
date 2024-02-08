import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Masukkan panjang bangunan: ")
    val panjang = scanner.nextDouble()

    println("Masukkan lebar bangunan: ")
    val lebar = scanner.nextDouble()

    val luas = hitungLuas(panjang, lebar)

    println("Luas bangunan adalah: $luas meter persegi")
}

fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}
