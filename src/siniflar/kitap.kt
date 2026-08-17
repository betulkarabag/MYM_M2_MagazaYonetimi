package siniflar

class kitap {

    var kitapAdi: String = ""
    var SayfaSayisi: Int = 0
    var OkunanSayfa: Int = 0


    fun sayfaOku(okunacakSayfa: Int) {
        OkunanSayfa+= okunacakSayfa
        if(okunacakSayfa >= SayfaSayisi) {
            println("Tebrikler kitabı bitirdiniz.")
            OkunanSayfa=SayfaSayisi
        }
        else
        println("Toplam okunan sayfa sayısı: $OkunanSayfa")

    }
}