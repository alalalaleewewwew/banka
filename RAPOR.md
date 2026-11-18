# Rapor

**Ad Soyad:** Muhammed Doruk Karataş
**Numara:**

## 1. Algoritma Açıklaması
<!-- Programın nasıl çalıştığını adım adım, kendi cümlelerinizle yazın. -->
kullanıcı parayla ne yapacağını belirler
işlem yapılır
sonda bakiye yazar

## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-para

**İşlemler:**
-bakiye bulma

**Çıktılar:**
-

## 3. Sözde Kod (Pseudocode)

```
bakiye = 10000.0
islemSayisi = 0
toplamYatirilan = 0.0
toplamCekilen = 0.0

DÖNGÜ (DOĞRU)
    YAZDIR "--- ATM Menusu ---"
    YAZDIR "1. Bakiye Goruntuleme"
    YAZDIR "2. Para Yatirma"
    YAZDIR "3. Para Cekme"
    YAZDIR "4. Cikis"
    OKU secim

    EĞER secim == 1 İSE
        YAZDIR "Guncel Bakiye:", bakiye
        islemSayisi = islemSayisi + 1

    DEĞİLSE EĞER secim == 2 İSE
        OKU miktar
        EĞER miktar <= 0 İSE
            YAZDIR "Hata: Negatif veya sifir miktar yatiraysamaz."
        DEĞİLSE
            bakiye = bakiye + miktar
            toplamYatirilan = toplamYatirilan + miktar
            islemSayisi = islemSayisi + 1
            YAZDIR "Islem basarili. Yeni bakiye:", bakiye
        BİTİR_EĞER

    DEĞİLSE EĞER secim == 3 İSE
        OKU miktar
        EĞER miktar <= 0 İSE
            YAZDIR "Hata: Gecersiz tutar."
        DEĞİLSE EĞER miktar > bakiye İSE
            YAZDIR "Hata: Yetersiz bakiye."
        DEĞİLSE
            bakiye = bakiye - miktar
            toplamCekilen = toplamCekilen + miktar
            islemSayisi = islemSayisi + 1
            YAZDIR "Islem basarili. Kalan bakiye:", bakiye
        BİTİR_EĞER

    DEĞİLSE EĞER secim == 4 İSE
        YAZDIR "--- Oturum Sonlandirildi ---"
        YAZDIR "Toplam Yapilan Islem Sayisi:", islemSayisi
        YAZDIR "Toplam Yatirilan Tutar:", toplamYatirilan
        YAZDIR "Toplam Cekilen Tutar:", toplamCekilen
        YAZDIR "Son Bakiye:", bakiye
        DÖNGÜDEN_ÇIK

    DEĞİLSE
        YAZDIR "Hata: Gecersiz secim."
    BİTİR_EĞER

DÖNGÜ_BİTİR

BİTİR
```

## 4. Akış Şeması

![Akış Şeması](docs/akis-semasi.png)

## 5. Test Senaryoları (en az 8)

| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | | | | |
| 2 | | | | |
| 3 | | | | |
| 4 | | | | |
| 5 | | | | |
| 6 | | | | |
| 7 | | | | |
| 8 | | | | |
