
package positivonegativo;

import java.util.Scanner;

public class PositivoNegativo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int x;
        System.out.println("Digite o número:"); 
	x = teclado.nextInt(); 
        if(x > 0){
            System.out.println(x+" é positivo.");
        }else{
            System.out.println(x+" é negativo.");
        }
        
    }
    
}
