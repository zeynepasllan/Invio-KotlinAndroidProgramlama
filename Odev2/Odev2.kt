package com.example.kotlindersleri.nesne_tabanli

class Odev2 {
    fun soru1(derece:Double):Double{
        val donusum = (derece * 1.8) + 32
        return donusum
    }

    fun soru2(kisaKenar:Double,uzunKenar:Double){
        println("Dikdörtgenin Çevresi: ${2 * (kisaKenar + uzunKenar)} cm")
    }

    fun soru3(sayi:Int):Long{
        var faktoriyelHesapla: Long = 1
        for (i in 1..sayi) {
            faktoriyelHesapla *= i.toLong()
        }
        return faktoriyelHesapla
    }

    fun soru4(kelime:String,harf:Char){
        var sayac = 0
        for(c in kelime){
            if(c==harf)
                sayac++
        }
        println("$kelime kelimesinde $sayac adet $harf vardır.")

    }

    fun soru5(kenarSayisi:Int):Int{
        val aciToplam = (kenarSayisi - 2) * 180
        return aciToplam
    }

    fun soru6(gunSayisi:Int):Int{
        val saatHesabi = gunSayisi * 8
        var calismaUcret = 0
        var mesaiUcret=0
        if(saatHesabi<=160) {
            calismaUcret = saatHesabi * 10
        }
        else if(saatHesabi>160){
            mesaiUcret = (saatHesabi - 160) * 20 + 1600  // 1600 = 160 saat çalışan bir işçinin normal çalışma saat ücreti.
        }
        val maasHesabi = calismaUcret + mesaiUcret
        return maasHesabi
    }

    fun soru7(kotaMiktar:Int):Int{
        var normalKota = 100
        var asilanKota = 0
        if(kotaMiktar>50){
            asilanKota = (kotaMiktar - 50) * 4
        }
        val kotaHesabi = normalKota + asilanKota
        return kotaHesabi
    }
}

