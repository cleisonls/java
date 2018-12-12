
package masculinofeminino;

import java.util.Scanner;

public class MasculinoFeminino {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in); 
        String x;
        System.out.println("Digite M ou F:"); 
	x = teclado.next(); 
        if (x.equals("M")){
            System.out.println("Masculino");
        }else if (x.equals("F")){
            System.out.println("Feminino");
        }else{
            System.out.println("Digite apenas M ou F.\nCertifique-se que está em caixa alta.");
        }
    }
}
 
