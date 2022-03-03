package paskaitos.sesi;

public class Calculator {

    int CalculateSum(int number1, int number2) {
        return number1 + number2;
    }

    int CalculateMinus(int number1, int number2) {
        return number1 - number2;
    }

    int CalculateMulti(int number1, int number2) {
        return number1 * number2;
    }
    double CalculateDiv(double number1, double number2) {
        if number2==0 {
            System.out.println("Dalyba iš nulio negalima");
            return;
        }
        return number1 / number2;
    }
    double CalculatePower(double number1, double number2) {
        return Math.pow(number1,number2);
    }
    static void print(int number1, int number2, double result, char arithmeticSign) {
        System.out.printf("%s %s %s = %s\n", number1, arithmeticSign, number2, result);
    }
}

