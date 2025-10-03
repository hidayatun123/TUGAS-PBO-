public class MakhlukHidup {

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