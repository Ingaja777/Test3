package paskaitos.septyni;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Įveskite skaičių");
        int number=sc.nextInt();
        sc.nextLine();
        int function;
        if (number >= 0){
            function = 2*number+8;
        } else {
            function = 21-7*number;
        }
        System.out.println(function);
    }
}
