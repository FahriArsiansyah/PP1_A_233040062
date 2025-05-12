package PERTEMUAN8.latihan;

public class ListMKTest {
  public static void main(String[] args) {
    StrukturList list = new StrukturList();

    list.addTail(new Matakuliah("IF003", "Struktur Diskrit", "3"));
    list.addTail(new Matakuliah("IF002", "Pemrograman Web", "3"));
    list.addMid(new Matakuliah("IF001", "Dasar Pemrograman", "4"), 4);
    list.addHead(new Matakuliah("IF004", "Kontruksi PL Berorientasi Objek", "3"));

    list.displayElement();
  }

}