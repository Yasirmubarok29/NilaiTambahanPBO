package lingkaran;

// Nama  : Yasir Mubarok
// Kelas    : TI21E
// Nim      : 20210040069

public class LuasSetengah {
    private Lingkaran lingkaran;
    
    public LuasSetengah(Lingkaran lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void hitung(){
        this.lingkaran.hitungLuas();
    }
    
    public void tampilkan(){
        this.lingkaran.tampilkanLuas();
    }
    
}