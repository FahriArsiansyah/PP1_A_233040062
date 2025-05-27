package Tubes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DaftarProduk daftar = new DaftarProduk();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Toko Kelontong ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Hapus Produk");
            System.out.println("3. Cari Produk");
            System.out.println("4. Tampilkan Semua Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // buffer

            switch (pilihan) {
                case 1:
                    System.out.print("ID: ");
                    String id = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Stok: ");
                    int stok = input.nextInt();
                    System.out.print("Harga: ");
                    double harga = input.nextDouble();
                    daftar.insert(new Produk(id, nama, stok, harga));
                    break;
                case 2:
                    System.out.print("ID produk yang akan dihapus: ");
                    String idHapus = input.nextLine();
                    daftar.delete(idHapus);
                    break;
                case 3:
                    System.out.print("ID produk yang dicari: ");
                    String idCari = input.nextLine();
                    Produk hasil = daftar.search(idCari);
                    if (hasil != null) {
                        System.out.println("Produk ditemukan:");
                        hasil.tampilkanInfo();
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;
                case 4:
                    System.out.println("Daftar Produk:");
                    daftar.traversal();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }
}