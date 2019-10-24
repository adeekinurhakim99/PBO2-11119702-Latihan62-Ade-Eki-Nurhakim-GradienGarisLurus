/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradiengarislurus;

/**
 *
 * @author Ekiw
 */
public class GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat k = new Koordinat();
        k.setX1(2);
        k.setX2(5);
        k.setY1(10);
        k.setY2(7);
        k.setA1(5);
        k.setA2(3);
        k.setB1(1);
        k.setB2(12);
        System.out.println("Garis Yang Melalui Titik (2,10) dan (5,7) Memiliki Gradien Sebesar "+k.hitungGradien());
        System.out.println("Garis Yang Melalui Titik (5,1) dan (3,12) Memiliki Gradien Sebesar "+k.hitungGradien1());
    }
    
}
