import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    // Meminta input nilai dari pengguna
    println("Masukkan nilai Tugas: ")
    val nilaiTugas = scanner.nextDouble()

    println("Masukkan nilai UTS: ")
    val nilaiUTS = scanner.nextDouble()

    println("Masukkan nilai UAS: ")
    val nilaiUAS = scanner.nextDouble()

    // Menghitung nilai akhir dengan bobot: Tugas 20%, UTS 30%, UAS 50%
    val nilaiAkhir = (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.5)

    // Menentukan grade berdasarkan nilai akhir
    val grade = when {
        nilaiAkhir >= 80 -> "A"
        nilaiAkhir >= 70 -> "B"
        nilaiAkhir >= 60 -> "C"
        nilaiAkhir >= 50 -> "D"
        else -> "E"
    }

    // Menampilkan nilai akhir dan grade
    println("Nilai Akhir: $nilaiAkhir")
    println("Grade: $grade")
}
