package Tubes;

class Produk {
    String id;
    String nama;
    int stok;
    double harga;

    public Produk(String id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("ID: " + id + ", Nama: " + nama + ", Stok: " + stok + ", Harga: " + harga);
    }
}
