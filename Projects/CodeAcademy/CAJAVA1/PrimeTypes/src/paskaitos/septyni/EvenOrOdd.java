package paskaitos.septyni;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Įveskite skaičių");
        int number=sc.nextInt();
        sc.nextLine();
        if (number%2==0){
            System.out.printf("%s skaičius yra lyginis\n",number);
        }else {
            System.out.printf("%s skaičius yra nelyginis\n",number);
        }
    }
}
