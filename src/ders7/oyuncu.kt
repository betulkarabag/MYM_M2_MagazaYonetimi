package ders7

class oyuncu(var isim: String,var can: Int) {
    init {
        println("Yeni bir isim katıldı hoşgeldin $isim")
        if (can !in 0..100) {
            println("hata can 1 ve 100 arasında olmalı")
            can = 100
        }
    }
}