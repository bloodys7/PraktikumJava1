import javax.swing.JOptionPane;
import java.util.Scanner;

public class DataTypes{
 public static void main (String[] args){

  Scanner scanner = new Scanner(System.in);

 String namaDepan = "Mirza";
 String namaTengah = "Yogy";
 String namaBelakang = "Kurniawan";
 int usia = 18;
 int targetTahunKuliah = 4;
 double ipk = 3.89764512;
 char nilaiAbjad = 'A';
 boolean tampan = true;

 System.out.print("Input Nama Depan : ");
 namaDepan = scanner.nextLine();
 System.out.println("Input Usia : ");
 usia = scanner.nextInt();
 System.out.println("Input IPK: ");
 ipk = scanner.nextDouble();
 System.out.println("");
 System.out.println("Input Nilai Abjad : ");
 nilaiAbjad = scanner.next().charAt(0);
 System.out.println("Tampan? : ");
 tampan = scanner.nextBoolean();

 System.out.println("================OUTPUT=================");
 System.out.println("Nama depan : " + namaDepan);
 System.out.println("Nama tengah : " + namaTengah);
 System.out.println("Nama belakang : " + namaBelakang);
 System.out.println("usia : " + usia);
 System.out.println("Target Kuliah : " + targetTahunKuliah + " tahun");
 System.out.println("IPK : " + ipk);
 System.out.println("Nilai PBO : " + nilaiAbjad);
 System.err.println("Tampan : " + tampan);

 JOptionPane.showMessageDialog(null, "Hai, " + namaDepan + namaTengah + namaBelakang);
 }
}