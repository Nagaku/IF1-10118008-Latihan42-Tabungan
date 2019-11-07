/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan42Tabungan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====Program Penarikan Uang====");
		System.out.print("Masukkan Saldo Awal : ");
		Tabungan tabungan = new Tabungan(sc.nextInt());
		System.out.print("Jumlah Uang yang diambil : ");
		
		System.out.println("Saldo Anda Sekarang : " + tabungan.ambilUang(sc.nextInt()));
		
		
	}
	
}
