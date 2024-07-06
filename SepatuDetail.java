package pilihsepatu;

//Inheritance
public class SepatuDetail extends Sepatu {
    public SepatuDetail(String jenis, String jumlah) {
        super(jenis, jumlah);
    }

    public String getDeskripsi() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "running":
                return "Dirancang khusus untuk aktivitas lari, sepatu ini ringan dan memiliki bantalan yang baik untuk menyerap benturan.";
            case "canvas":
                return "Sepatu yang nyaman dan ringan, biasanya terbuat dari kanvas, cocok untuk dipakai sehari-hari atau suasana santai.";
            case "football":
                return "Dirancang khusus untuk sepak bola, sepatu ini memiliki tapak khusus untuk memberikan cengkeraman optimal di lapangan rumput.";
            case "hiking":
                return "Sepatu yang kokoh dan tahan air, dirancang untuk mendaki gunung atau berjalan di alam bebas.";
            default:
                return "Deskripsi tidak tersedia untuk jenis sepatu ini.";
        }
    }

    public int getStok() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "running":
                return 15;
            case "canvas":
                return 3;
            case "football":
                return 6;
            case "hiking":
                return 2;
            default:
                return 0;
        }
    }

    public double getHarga() {
        String jenis = getJenis().toLowerCase();
        switch (jenis) {
            case "running":
                return 500000;
            case "canvas":
                return 300000;
            case "football":
                return 700000;
            case "hiking":
                return 800000;
            default:
                return 0;
        }
    }

    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "Deskripsi: " + getDeskripsi() + "\n" +
                "Stok: " + getStok() + "\n" +
                "Harga: Rp. " + String.format("%.2f", getHarga());
    }

    public String displayInfo(int stok) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.displayInfo()); // Memanggil displayInfo() dari kelas induk
        sb.append("Jumlah stok: ").append(stok).append("\n");
        return sb.toString();
    }
}
