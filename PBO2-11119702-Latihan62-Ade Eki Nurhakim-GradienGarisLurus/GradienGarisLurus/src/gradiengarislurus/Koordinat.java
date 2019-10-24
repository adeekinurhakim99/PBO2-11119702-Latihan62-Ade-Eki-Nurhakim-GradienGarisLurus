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
public class Koordinat extends GradienGarisLurus {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private int a1;
    private int a2;
    private int b1;
    private int b2;
    
    public int getX1() {
        return x1;
    }
    public void setX1(int x1) {
        this.x1 = x1;
    }
    
     public int getX2() {
        return x2;
    }
    public void setX2(int x2) {
        this.x2 = x2;
    }
    
    public int getY1() {
        return y1;
    }
    public void setY1(int y1) {
        this.y1 = y1;
    }
    
     public int getY2() {
        return y2;
    }
    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    public int hitungGradien(){
        return (y1-y2)/(x1-x2);
    }
    
    public int getA1() {
        return a1;
    }
    public void setA1(int a1) {
        this.a1 = a1;
    }
    public int getA2() {
        return a2;
    }
    public void setA2(int a2) {
        this.a2 = a2;
    }
    
     public int getB1() {
        return b1;
    }
    public void setB1(int b1) {
        this.b1 = b1;
    }
    public int getB2() {
        return b2;
    }
    public void setB2(int b2) {
        this.b2 = b2;
    }
    public int hitungGradien1(){
        return (b1-b2)/(a1-a2);
    }
}