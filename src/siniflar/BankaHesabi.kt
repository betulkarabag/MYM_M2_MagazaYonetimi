package siniflar

class BankaHesabi {
    private var bakiye : Double = 0.0
    fun bakiyeSorgula(){
        println("Bakiye: ${bakiye}")
    }
    fun paraYatır(miktar:Double){
        if (miktar>bakiye){
            bakiye += miktar
            println("Hesabınıza $miktar para yatırılmıştır")
            println("Yeni miktar: $bakiye")
        }else
            println("HATA: yatırılan para sıfırdan büyük olmalıdır.")
    }

}