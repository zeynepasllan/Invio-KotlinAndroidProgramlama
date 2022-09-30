package com.example.kotlindersleri.nesne_tabanli

fun main(){
    val f = Odev2()
    val gelenDonusum=f.soru1(derece=50.0)
    println("Fahrenhiet Dönüşümü: $gelenDonusum F")

    f.soru2(kisaKenar = 10.0, uzunKenar = 20.0)

    val gelenFaktoriyel=f.soru3(sayi=5)
    println("Faktoriyel Değeri: $gelenFaktoriyel")

    f.soru4(kelime = "Zeynep", harf = 'e')

    val gelenToplam=f.soru5(kenarSayisi=6)
    println("İç açılar toplamı: $gelenToplam")

    val gelenMaas=f.soru6(gunSayisi=22)
    println("Maaş Hesabı: $gelenMaas TL")

    val gelenKota=f.soru7(kotaMiktar=60)
    println("Toplam Kota Ücreti: $gelenKota TL")



}