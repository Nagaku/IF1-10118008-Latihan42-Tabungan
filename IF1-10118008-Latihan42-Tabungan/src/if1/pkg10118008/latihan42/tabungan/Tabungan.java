/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan42.tabungan;

import java.io.InputStream;

/**
 *
 * @author ASUS
 */
public class Tabungan {
	private int saldo;
	
	public Tabungan(int saldo){
		this.saldo = saldo;
	}

	
	public int ambilUang(int jumlah){
		this.saldo -= jumlah;
		return this.saldo;
	}
	
	
}
