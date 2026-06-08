import java.util.Scanner;

public class mahasiswa {
    // ===== Atribut (properties) =====
    int nim;        // NIM mahasiswa
    String nama;    // Nama mahasiswa
    String kelas;   // Kelas mahasiswa
    double ipk;     // IPK mahasiswa

    // ===== Method tampilkanInformasi =====
    // Menampilkan semua data mahasiswa ke layar
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
        Scanner scanner = new Scanner(System.in);

        // Membuat objek mhs dari class Mahasiswa
        mahasiswa mhs = new mahasiswa();

        // Input data mahasiswa lewat Scanner
        System.out.print("Masukkan NIM: ");
        mhs.nim = scanner.nextInt();
        scanner.nextLine(); // membersihkan buffer

        System.out.print("Masukkan Nama: ");
        mhs.nama = scanner.nextLine();

        System.out.print("Masukkan Kelas: ");
        mhs.kelas = scanner.nextLine();

        System.out.print("Masukkan IPK: ");
        mhs.ipk = scanner.nextDouble();

        // Output hasil
        System.out.println("\n=== Data Mahasiswa ===");
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja());

        scanner.close();
    }
}