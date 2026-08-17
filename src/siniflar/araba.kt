package siniflar

class araba {
    var renk: String = "beyaz"
    var hiz: Int = 0
    val marka: String = "Kotlin Motors"


    fun gazaBAs() {
        hiz+=10
        println("Gaza basıldı yeni hız:$hiz")

    }
    fun freneBas() {
        if (hiz>14) {
            hiz -= 15
            println("Frene basıldı yeni hız:$hiz")
        }else
            hiz == 0
        println("Araba zaten duruyor.")
    }
}