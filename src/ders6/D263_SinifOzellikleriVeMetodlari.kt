package ders6

import siniflar.araba

fun main() {
    val benimArabam = araba()
    val seninAraban = araba()
    println(
            """"
                Benim arabamın özellikleri:
                renk:${benimArabam.renk}
                marka:${benimArabam.marka}
                hız:${benimArabam.hiz}
                
                """.trimIndent())
    println("-------------------------")
    println(
        """"
            Senin arabanın özellikleri:
            renk:${seninAraban.renk}
            marka:${seninAraban.marka}
            hiz:${seninAraban.hiz}
            
            """.trimIndent())
    benimArabam.gazaBAs()
    benimArabam.gazaBAs()
    benimArabam.gazaBAs()
    benimArabam.gazaBAs()
    benimArabam.freneBas()
    benimArabam.freneBas()
    benimArabam.freneBas()
    println("-------------------------")
    benimArabam.hiz=100
    benimArabam.renk="Kırmızı"
    println(
        """"
                Benim arabamın özellikleri:
                renk:${benimArabam.renk}
                marka:${benimArabam.marka}
                hız:${benimArabam.hiz}
                
                """.trimIndent())
    println(
        """"
            Senin arabanın özellikleri:
            renk:${seninAraban.renk}
            marka:${seninAraban.marka}
            hiz:${seninAraban.hiz}
            
            """.trimIndent())
}