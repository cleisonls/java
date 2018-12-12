
package dolarreal;

import java.util.Scanner;

public class DolarReal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double dolar, real;
        System.out.println("Digite um valor em dólar:");
            dolar = teclado.nextInt();
            real = dolar*1.82;
        System.out.println(dolar+" dolar(es) equilave a "+real+"reais com a cotação do dólar a US$ 1,82.");
            
    }
    
}
