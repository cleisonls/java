
package salario7porcentro;

import java.util.Scanner;

public class Salario7PorCentro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double x, salario, resultado;
        System.out.print("Digite o Salário:");
            salario = teclado.nextInt();
            x = salario*0.07;
            resultado = salario + x;
            System.out.println("Salário com reajuste de 7%: "+resultado); 
    }
    
}
