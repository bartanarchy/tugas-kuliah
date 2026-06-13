public class Course {
    String kode, nama;
    int sks;

    public Course(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    @Override
    public String toString() {
        return kode + "\t" + nama + "\t" + sks;
    }
}
