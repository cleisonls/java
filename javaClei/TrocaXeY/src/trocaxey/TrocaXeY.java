
package trocaxey;

import java.util.Scanner;

public class TrocaXeY {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int x, y, x2, y2;
        System.out.println("Digite o valor de X:");
        x = teclado.nextInt();
        System.out.println("Digite o valor de Y:");
        y = teclado.nextInt();
        x2 = x;
        y2 = y;
        x = y2;
        y = x2;
        System.out.println("X anteriormente com valor de: "+x2+" passou a ter valor de: "+x+"\nY anteriormente com valor de: "+y2+" passou a ter valor de :"+y);
        
    }
    
}
