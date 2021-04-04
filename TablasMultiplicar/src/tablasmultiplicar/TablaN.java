/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablasmultiplicar;

public class TablaN {
    
    public static String tablaDel(int a, int b){
        return b%(a*10) == 0 && b != 0? a + " x " + b/a + " = " + b : a + " x " + b/a + " = " + (b==0?0:b) + "\n" + tablaDel(a,a+b); 
    }
}
