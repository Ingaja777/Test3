package paskaitos.sesi;

import java.util.Scanner;

public class EnterProgram {
    public static void main(String[] args) {
        EnterProgram enterprogram = new EnterProgram();
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Įveskite dviejų sveikų skaičių operaciją + - * / ^ :");

            String eilute = sc.nextLine();
            if (eilute.equals("0")) {
                return;
            }

            int arithmeticSignIndex = eilute.indexOf(' ') + 1;
            char arithmeticSign = eilute.charAt(arithmeticSignIndex);
            String eiluteNumber1 = eilute.substring(0, arithmeticSignIndex).trim();
            String eiluteNumber2 = eilute.substring(arithmeticSignIndex + 1).trim();

            int number1 = Integer.parseInt(eiluteNumber1);
            int number2 = Integer.parseInt(eiluteNumber2);
            switch (arithmeticSign) {
                case '+':
                    Calculator.print(number1, number2, calculator.CalculateSum(number1, number2), arithmeticSign);
                    break;
                case '-':
                    Calculator.print(number1, number2, calculator.CalculateMinus(number1, number2), arithmeticSign);
                    break;
                case '*':
                    Calculator.print(number1, number2, calculator.CalculateMulti(number1, number2), arithmeticSign);
                    break;
                case '/':
                    Calculator.print(number1, number2, calculator.CalculateDiv(number1, number2), arithmeticSign);
                    break;
                case '^':
                    Calculator.print(number1, number2, calculator.CalculatePower(number1, number2), arithmeticSign);
                    break;
                default:
                    System.out.println("Operacija nerasta.....:(");
                    break;

            }
        }

    }
}