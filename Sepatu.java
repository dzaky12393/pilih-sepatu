package pilihsepatu;

//class
public class Sepatu {
    //atribut
    private String jenis;
    private String jumlah;

    //constructor
    public Sepatu(String jenis, String jumlah) {
        this.jenis = jenis;
        this.jumlah = jumlah;
    }

    //setter (mutator)
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    //getter (accessor)
    public String getJenis() {
        return jenis;
    }

    public String getJumlah() {
        return jumlah;
    }

    public String displayInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jenis: ").append(jenis).append("\n");
        sb.append("Jumlah: ").append(jumlah).append("\n");
        return sb.toString();
    }
}
