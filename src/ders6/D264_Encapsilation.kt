package ders6

import siniflar.BankaHesabi

fun main() {
    val müsteriHesabi = BankaHesabi()
    müsteriHesabi.bakiyeSorgula()
    müsteriHesabi.paraYatır(1000.0)
    müsteriHesabi.bakiyeSorgula()



}