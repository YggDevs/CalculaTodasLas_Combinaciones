/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinacionescajafuerte;

/**
 *
 * @author usuario
 */
public class CombinacionesCajaFuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] elementos = "0,1,2,3,4,5,6,7,8,9".split(",");
        int n = 4;                  //Casillas en la caja fuerte
        int r = elementos.length;   //Elementos elegidos

        Perm1(elementos, "", n, r);

    }

    private static void Perm1(String[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                Perm1(elem, act + elem[i] + ", ", n - 1, r);
            }
        }

        
    }}
        
        
        
    
    

