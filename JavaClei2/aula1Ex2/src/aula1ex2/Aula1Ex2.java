
package aula1ex2;

import java.util.Scanner;

public class Aula1Ex2 {

    public static void main(String args []) {
        System.out.println(Character.isDigit('c'));
        System.out.println(Character.isDigit('5'));
        
        System.out.println(Character.isLetter('c'));
        System.out.println(Character.isLetter('5'));
        
        System.out.println(Character.isLetterOrDigit('c'));
        System.out.println(Character.isLetterOrDigit('5'));
        
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isUpperCase('c'));
        
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase('c'));
        
        System.out.println(Character.isWhitespace(' '));
        
        String a = "testejava;html";
        a = a.replaceAll("html", "jsp");
        System.out.print(a);
    }
    
}
