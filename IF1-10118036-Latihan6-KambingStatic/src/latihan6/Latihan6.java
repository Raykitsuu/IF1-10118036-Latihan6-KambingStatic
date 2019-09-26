/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6;

/**
 *
 * @author
 * NAMA			: Adrian C. Senna
 * KELAS		: IF-1
 * NIM			: 10118036
 * Deskripsi Program	: Program ini berisi program untuk menampilkan jumlah kambing dari kelas mamalia
 */
public class Latihan6 {

	/**
	 */
	public static final String NAMA_KAMBING = "MIDUN";
	public static void main(String[] args) {
		Mamalia.jumlahKambing = 485000;
		System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
		// TODO code application logic here
	}
	
}
