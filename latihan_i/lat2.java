package latihan_i;

import java.util.Scanner;
public class lat2 {
    
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    
 System.out.println("Masukkan sebuah bilangan");

int bilangan = input.nextInt();

if (  bilangan == 0) {
    System.out.println("BIlangan tersebut adalah NOL");
}
 else if (bilangan % 2 == 0) {
    System.out.println("BIlangan tersebut adalah Genap");
 }
else {
    System.out.println("BIlangan tersebut adalah Ganjil ");

}
}
}
