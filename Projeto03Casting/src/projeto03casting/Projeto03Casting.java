/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto03casting;

/**
 *
 * @author aluno
 */
public class Projeto03Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double pi = 3.14;
        int i = (int) pi;//casting = SE MOLDE A ...
        System.out.println("Valor de i: " + i);
        System.out.println("Valor de pi: " + pi);
        
        float j = 3.14f;// decimal usa o f
        float k = 3;// inteiro não usa o f
        
        float m = (float) pi;//casting
        
    }
    
}
