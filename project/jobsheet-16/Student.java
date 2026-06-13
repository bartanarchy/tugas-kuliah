public class Student {
    String nim, nama, telp;

    public Student(String nim, String nama, String telp) {
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    @Override
    public String toString() {
        return nim + "\t" + nama + "\t" + telp;
    }
}
