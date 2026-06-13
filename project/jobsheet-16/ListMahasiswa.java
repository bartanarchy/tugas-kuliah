import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas = new ArrayList<>();

    // Add students
    public void tambah(Mahasiswa... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    // Delete student by index
    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    // Update student
    public void update(int index, Mahasiswa mhs) {
        mahasiswas.set(index, mhs);
    }

    // Display all students
    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println(mhs.toString());
        });
    }

    // Search student by nim
    public int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    // Main method to test
    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();

        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        // Add students
        lm.tambah(m, m1, m2);

        // Show list
        lm.tampil();

        // Update student
        lm.update(lm.linearSearch("201235"),
                new Mahasiswa("201235", "Akhleema Lela", "021xx2"));

        System.out.println("");
        lm.tampil();
    }

    // Sort ascending by name
    public void sortByNameAsc() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nama));
    }

    // Sort descending by name
    public void sortByNameDesc() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nama, Comparator.reverseOrder()));
    }

}
