package latihan_i;


    import java.util.Scanner;
public class lat3 {
    
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    
 System.out.println("Masukkan sebuah bilangan 1,2 dan 3 untuk MEemilih barang");

int bilangan = input.nextInt();

if (  bilangan == 1) {
    System.out.println("Angka tersebut untuk Mwnampilkan ALAT TULIS PENSIL" );
}
 else if (bilangan % 2 == 0) {
    System.out.println("Angka tersebut untuk Mwnampilkan ALAT TULIS PULPEN" );
 }
else {

    System.out.println("Angka tersebut untuk Mwnampilkan ALAT TULIS PENGHAPUS ");

}
}
}