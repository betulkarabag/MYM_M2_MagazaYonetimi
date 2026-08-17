package siniflar

class kisi {
    var yas:Int = 0
        var dogumYili: Int = 2005
    set(value) {
        if(value>=0){
            field = value
        }else{
            println("HATA: Yaş değeri negatif olamaz")
        }
    }
}