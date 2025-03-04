/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposdetriangulos1045beecrowd;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class TiposDeTriangulos1045Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        float tri[] = new float[4];
        
        for (int c = 1; c <= tri.length-1; c++) {
            tri[c] = teclado.nextFloat();
        }
        
        Arrays.sort(tri);             
            
        if (tri[3] >= tri[1] + tri[2]) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((tri[3]*tri[3]) == (tri[2]*tri[2]) + (tri[1]*tri[1])) {
                System.out.println("TRIANGULO RETANGULO");
            } 

            if ((tri[3]*tri[3]) > (tri[2]*tri[2]) + (tri[1]*tri[1])) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } 

            if ((tri[3]*tri[3]) < (tri[2]*tri[2]) + (tri[1]*tri[1])) {
                System.out.println("TRIANGULO ACUTANGULO");
            } 

            if (tri[3] == tri[1] && tri[1] == tri[2] && tri[2] == tri[3]) {
                System.out.println("TRIANGULO EQUILATERO");
            } 

            if (tri[1] == tri[2] && tri[3] != tri[1] || tri[3] == tri[2] && tri[1] != tri[3]){
                System.out.println("TRIANGULO ISOSCELES");
            } 
        }
            
    }
    
}
