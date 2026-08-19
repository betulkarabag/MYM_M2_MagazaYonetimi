package ders7
import ders7.Araba

fun main() {
    val araba1 = Araba("tofaş", "Kırmızı",2026)
    val araba2 = Araba("Togg", uretimYili = 2025)
    val araba3= Araba("Renault", uretimYili = 2026)
    println(araba1.renk)
    println(araba2.renk)
    println(araba1.uretimYili)
    araba3.hiz = 100
    araba3.motorCalisiyor = true
    println(araba3)
}