package PERTEMUAN8.latihan;


public class Matakuliah {
  private String kode;
  private String nama;
  private String sks;

  public Matakuliah(String kode, String nama, String sks) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
  }

  public String getKode() {
    return kode;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getSks() {
    return sks;
  }

  public void setSks(String sks) {
    this.sks = sks;
  }
}
