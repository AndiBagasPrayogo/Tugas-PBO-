/* Nim : 13020220077
Nama : Andi Bagas Prayogo
*/

import java.util.Scanner;

public class waktu{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;

	System.out.print("Masukkan total detik : ");
	totalDetik=input.nextInt();

	detikSekarang=totalDetik % 60;
	totalMenit=totalDetik / 60;
	menitSekarang=totalMenit % 60;
	totalJam=totalMenit / 60;
	jamSekarang=totalJam % 24;

	System.out.print("Waktu Sekarang : "+jamSekarang+":"+menitSekarang+":"+detikSekarang); 
  }
}