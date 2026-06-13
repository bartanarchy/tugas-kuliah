import java.util.*;

public class SistemNilai {
    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static List<Grade> grades = new ArrayList<>();
    static Queue<Student> queue = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Data awal mahasiswa
        students.add(new Student("20001","Thalhah","021xxxx"));
        students.add(new Student("20002","Zubair","021xxxx"));
        students.add(new Student("20003","Abdur-Rahman","021xxxx"));
        students.add(new Student("20004","Sa’ad","021xxxx"));
        students.add(new Student("20005","Sa’id","021xxxx"));
        students.add(new Student("20006","Ubaidah","021xxxx"));
        queue.addAll(students);

        // Data awal mata kuliah
        courses.add(new Course("0001","Internet of Things",3));
        courses.add(new Course("0002","Praktikum Algoritma dan Pemrograman",3));

        int pilih;
        do {
            System.out.println("********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa (Queue)");
            System.out.println("6. Keluar");
            System.out.println("********************************************");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

            switch(pilih) {
                case 1:
                    System.out.print("Masukkan kode mata kuliah: ");
                    String kode = sc.next();
                    System.out.print("Masukkan nilai: ");
                    double nilai = sc.nextDouble();
                    System.out.println("Pilih mahasiswa by nim: ");
                    for(Student s : students) System.out.println(s);
                    String nim = sc.next();
                    Student st = students.stream().filter(x->x.nim.equals(nim)).findFirst().orElse(null);
                    Course co = courses.stream().filter(x->x.kode.equals(kode)).findFirst().orElse(null);
                    if(st!=null && co!=null) grades.add(new Grade(st,co,nilai));
                    break;
                case 2:
                    System.out.println("DAFTAR NILAI MAHASISWA");
                    System.out.println("********************************************");
                    System.out.println("Nim\tNama\tMata Kuliah\tSKS\tNilai");
                    for(Grade g : grades) System.out.println(g);
                    break;
                case 3:
                    System.out.print("Cari nim: ");
                    String cari = sc.next();
                    grades.stream().filter(g->g.student.nim.equals(cari)).forEach(System.out::println);
                    break;
                case 4:
                    grades.sort(Comparator.comparingDouble(g->g.nilai));
                    System.out.println("Data nilai diurutkan:");
                    for(Grade g : grades) System.out.println(g);
                    break;
                case 5:
                    Student removed = queue.poll();
                    if(removed!=null) {
                        students.remove(removed);
                        System.out.println("Mahasiswa dihapus: " + removed);
                    } else {
                        System.out.println("Queue kosong, tidak ada mahasiswa untuk dihapus.");
                    }
                    break;
            }
        } while(pilih!=6);
    }
}
