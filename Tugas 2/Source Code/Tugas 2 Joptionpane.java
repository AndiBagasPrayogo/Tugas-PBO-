/* Nim : 13020220077
Nama : Andi Bagas Prayogo
*/

import javax.swing.JOptionPane;

public class Joptionpane1{
	public static void main(String[] args){
	String Nama, Nim, Jurusan, Fakultas;

	Nama=JOptionPane.showInputDialog("Masukkan Nama : ");
	Nim=JOptionPane.showInputDialog("Masukkan Nim : ");
	Jurusan=JOptionPane.showInputDialog("Masukkan Jurusan : ");
	Fakultas=JOptionPane.showInputDialog("Masukkan Fakultas : ");

	System.out.println("=================");
	System.out.println("Nama    : "+ Nama);
	System.out.println("Nim     : "+ Nim);
	System.out.println("Fakultas: "+ Fakultas);
	System.out.println("Jurusan : "+ Jurusan);

  }
}