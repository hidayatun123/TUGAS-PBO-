# 📘 Tugas 1 Pemrograman Berorientasi Object
### Meliputi materi :
1. **Class dan Object (Pertemuan 2)**
2. **Encapsulation (Pertemuan 3)**
3. **Constructor (Pertemuan 4)**


---

## 💻 Analisa Kode Berikut

### Kode `MakhlukHidup.java` dan `TestAccess.java` versi `ERROR`
><div style="color: blue">
><strong>Tugas:<br/>
>1. Temukan, jelaskan, dan perbaiki setiap error berkaitan dengan materi pada MakhlukHidup.java dan TestAccess.java. Ada 10+ kesalahan. Setiap kesalahan memiliki skor (lihat pada tabel skor). Skor minimal LULUS = 60.
><br/>
>2. Tuliskan output dari TestAccess jika kode sudah diperbaiki
></strong>
</div>

```java

public class MakhlukHidup {

    private string nama;       
    private String jenis;
    public double berat = -1.0;  
    private int umur;


    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    public void MakhlukHidup(String nama) { 
        this.nama = nama;
        this.jenis = "Salah";
        this.umur = 12;
        this.berat = 170.0;
    }

    public makhlukHidup(String nama, String jenis, int umur, double berat) { 
        this.nama = jenis;  
        this.jenis = nama; 
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = nama; 
        this.jenis = other.jenis; 
        this.umur = this.umur; 
        this.berat = other.berat;
    }


    public void setUmur(String umur) { 
        this.umur = umur;
    }

    public void setNama(String nama) {
        nama = this.nama; 
    }

    public int getInfo() { 
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}

```

```java
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.nama = "Kucing";  
        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.MakhlukHidup("Kuda"); 
                
        System.out.println(m2.getInfo());
        
        m3.setUmur(-10); 
        
        System.out.println(m3.getInfo());

        
    }
}
```


## Table Score
| No | Error | Materi terkait            | Skor |
|----|-------|---------------------------|------|
| 1  | ERR1  | Class & Object (syntax)   | 10   |
| 2  | ERR2  | Class & Object (type)     | 10   |
| 3  | ERR3  | Constructor/init          | 10   |
| 4  | ERR4  | Encapsulation / Setter    | 10   |
| 5  | ERR5  | Constructor (copy)        | 10   |
| 6  | ERR6  | Constructor (copy)        | 10   |
| 7  | ERR7  | Encapsulation / Setter    | 10   |
| 8  | ERR8  | Class & Object (type)     | 10   |
| 9  | ERR9  | Class & Object (type)     | 10   |
| 10 | ERR10 | Encapsulation / Validation| 10   |
**Total skor : 100**

## Petunjuk Pengerjaan

Temukan semua ERR#, jelaskan kenapa salah dalam bentuk table dengan kolom berikut, selanjutnya tulis kode perbaikannya.

| No | Class        | Kesalahan | Perbaikan |
|----|--------------|-----------|-----------|
| 1 | MakhlukHidup | [contoh] variable `jumlah` salah penulisan akses `publik` | seharusnya `public jumlah = 10`|

2. Kompilasi dan jalankan setelah diperbaiki.
3. Upload kode pada **Github** repository anda dan **upload link nya ke dalam sinau** di topik **Tugas 1 PBO** disertai **file penjelasannya** dalam format word atau markdown
> Peringatan : Penggunaan AI tidak menjamin jawaban anda semuanya benar


## 💻 Syntax benar
public class MakhlukHidup  {

    private String nama; // Salah syntax harusnya String   
    private String jenis;
    public double berat = -1.0;  // Berat badan tidak logis jika negatif. Tindakan sia-sia (Tidak perlu inisialisasi -1.0)
    private int umur;

// Constructor
    public MakhlukHidup() {
        this.nama = "Unknown";
        this.jenis = "Unknown";
        this.umur = 15;
        this.berat = 10.0;
    }

    // Method Overloading
    public void Makhluk(String nama) { // Bukan constructor karna ada void (dihindari nama method sama dengan nama)
        this.nama = nama; 
        this.jenis = "Salah"; 
        this.umur = 12;
        this.berat = 170.0;
    }

    public MakhlukHidup(String nama, String jenis, int umur, double berat) { // Bukan Constructor karena ada void (dihindari nama method sama dengan nama class) ganti nama method// Bukan Constructor karena ada void (dihindari nama method sama dengan nama class) ganti anma method
        this.nama = jenis;  // Terbalik dengan jenis 
        this.jenis = nama; //Terbalik dengan nama
        this.umur = umur;
        this.berat = berat;
    }

    public MakhlukHidup(MakhlukHidup other) {
        this.nama = other.nama; // Salah penulisan harusnya other.nama
        this.jenis = other.jenis; 
        this.umur = other.umur;  // Salah penulisan harusnya other.umur
        this.berat = other.berat;
    }


    public void setUmur(int umur) { 
        
        if (umur >= 0) {
            this.umur = umur;
        }else {
            System.out.println("Umur tidak boleh negatif");
        }

        // if (umur < 0){
        //      System.out.prinln("Umur tidak boleh negatif");
        //      return;
        // }
        // this.umur = umur; // Salah tipe data harusnya int pada parameter umur 
    }

    public void setNama(String nama) {
        // nama = this // Salah penulisan harusnya this.nama = nama;
        this.nama = nama; //
    }

    public String getInfo() { //  Salah tipe data harusnya String
        return "Nama=" + nama + ", Jenis=" + jenis 
        + ", Umur=" + umur + ", Berat=" + berat;
    }
}
class TestAccess {
    public static void main(String[] args) {
        MakhlukHidup m = new MakhlukHidup();
        
        m.setNama("Kucing"); //nama bersifat private, tidak bisa diakses langsung jadi diganti menggunakan setter

        
        MakhlukHidup m2 = new MakhlukHidup("Harimau", "Hewan", 3, 120.0);
        
        MakhlukHidup m3 = new MakhlukHidup(m2);
 
        System.out.println(m.getInfo());
        
        System.out.println(m2.getInfo());
        
        m2.Makhluk("Kuda"); // bukan method, tapi constructor jadi ubah nama menggunakan method setter:
                
        System.out.println(m2.getInfo()); 
        
        m3.setUmur(10); //umur tidak boleh negatif sehingga perlu di validasi:
        
        System.out.println(m3.getInfo());

}
}


## 💻 Tabel pengerjaan
| No | Lokasi         | Kesalahan                                                               | Penjelasan / Perbaikan                                                                                           |
| -- | -------------- | ----------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| 1  | `MakhlukHidup` | `private string nama;` salah, karena di Java harus `String` huruf besar | Ubah jadi `private String nama;`                                                                                 |
| 2  | `MakhlukHidup` | `public double berat = -1.0;` karna berat tidak mungkin negatif             | Kasih nilai awal di constructor, misalnya `10.0`, jangan `-1.0`                                                  |
| 3  | `MakhlukHidup` | `public void MakhlukHidup(String nama)` ditulis pakai `void`            | Kalau mau constructor, hapus `void`. Kalau memang method, ganti nama biar jelas, misalnya `Makhluk(String nama)` |
| 4  | `MakhlukHidup` | Nama method `MakhlukHidup` mirip nama class jadi  mebingung             | Disarankan pakai nama method lain, contoh `Makhluk(String nama)`                                                 |
| 5  | `MakhlukHidup` | `public makhlukHidup(...)` huruf kecil di depan                         | Harusnya tulisannya`public MakhlukHidup(...)`                                                                              |
| 6  | `MakhlukHidup` | Isi constructor kebalik: `this.nama = jenis; this.jenis = nama;`        | tulisan yanag bener `this.nama = nama; this.jenis = jenis;`                                                                 |
| 7  | `MakhlukHidup` | Copy constructor: `this.nama = nama;`                                   | Harusnya diambil dari objek lain `this.nama = other.nama;`                                                       |
| 8  | `MakhlukHidup` | Copy constructor: `this.umur = this.umur;`                              | Salah, karena tidak berubah. Harusnya `this.umur = other.umur;`                                                  |
| 9  | `MakhlukHidup` | `public void setUmur(String umur)`  tipe data salah                    | Harusnya `int umur`, bukan `String`                                                                              |
| 10 | `MakhlukHidup` | Setter umur tidak ada validasi                                          | Tambahkan cek: kalau umur < 0, tampilkan pesan error                                                             |
| 11 | `MakhlukHidup` | `setNama`: isi salah `nama = this.nama;`                                | Harusnya dibalik: `this.nama = nama;`                                                                            |
| 12 | `MakhlukHidup` | `public int getInfo()` salah tipe data return                           | Harusnya `public String getInfo()` karena isinya teks                                                            |
| 13 | `TestAccess`   | `m.nama = "Kucing";` langsung akses atribut `nama`                      | Tidak bisa, karena `nama` private. Harus lewat setter: `m.setNama("Kucing");`                                    |
| 14 | `TestAccess`   | `m2.MakhlukHidup("Kuda");` salah, bukan konstruktor                     | Harus panggil method yang ada: `m2.Makhluk("Kuda");`                                                             |

*Output:*
Nama=Kucing, Jenis=Unknown, Umur=15, Berat=10.0
Nama=Hewan, Jenis=Harimau, Umur=3, Berat=120.0
Nama=Kuda, Jenis=Salah, Umur=12, Berat=170.0
Nama=Hewan, Jenis=Harimau, Umur=10, Berat=120.0