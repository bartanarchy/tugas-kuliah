import java.util.Scanner;

public class MahasiswaC {
    // ===== Atribut (properties) =====
    int nim;
    String nama;
    String kelas;
    double ipk;

    // ===== Constructor default =====
    // Dipanggil saat membuat objek tanpa parameter: new MahasiswaC()
    public MahasiswaC() {
    }

    // ===== Constructor berparameter =====
    // Dipanggil saat membuat objek dengan data langsung: new MahasiswaC(nim, nama, kelas, ipk)
    public MahasiswaC(int nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // ===== Method tampilkanInformasi =====
    // Menampilkan semua data mahasiswa
    void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    // ===== Method updateIpk =====
    // Mengubah IPK dengan validasi range 0.0 - 4.0
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0.");
        }
    }

    // ===== Method nilaiKinerja =====
    // Mengembalikan string evaluasi kinerja berdasarkan IPK
    String nilaiKinerja() {
        if (ipk >= 3.5)
            return "Kinerja sangat baik";
        else if (ipk >= 3.0)
            return "Kinerja baik";
        else if (ipk >= 2.5)
            return "Kinerja cukup";
        else
            return "Kinerja kurang";
    }

    // ===== Main Program =====
    // Tempat eksekusi utama, input Scanner dan instansiasi objek
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Objek mhs1 dengan constructor default
            MahasiswaC mhs1 = new MahasiswaC();
            System.out.println("======= Masukkan Data Mahasiswa =======");
            System.out.println("Masukkan Nama:");
            mhs1.nama = sc.nextLine();
            System.out.println("Masukkan NIM:");
            mhs1.nim = sc.nextInt();
            sc.nextLine(); // membersihkan buffer
            System.out.println("Masukkan Kelas:");
            mhs1.kelas = sc.nextLine();
            System.out.println("Masukkan IPK:");
            mhs1.ipk = sc.nextDouble();
            sc.nextLine(); // membersihkan buffer

            // Objek mhs2 dengan constructor berparameter
            System.out.println("\n=== Input Mahasiswa 2 ===");
            System.out.print("Nama: ");
            String nama2 = sc.nextLine();
            System.out.print("NIM: ");
            int nim2 = sc.nextInt();
            sc.nextLine();
            System.out.print("Kelas: ");
            String kelas2 = sc.nextLine();
            System.out.print("IPK: ");
            double ipk2 = sc.nextDouble();

            MahasiswaC mhs2 = new MahasiswaC(nim2, nama2, kelas2, ipk2);

            // Output hasil
            System.out.println("\n=== Data Mahasiswa 1 ===");
            mhs1.tampilkanInformasi();
            System.out.println("Nilai Kinerja: " + mhs1.nilaiKinerja());

            System.out.println("\n=== Data Mahasiswa 2 ===");
            mhs2.tampilkanInformasi();
            System.out.println("Nilai Kinerja: " + mhs2.nilaiKinerja());
        }
    }
}