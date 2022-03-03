package paskaitos.keturi;

public class StringMethod {

    public void toUpperCase(String text) {
        System.out.println(text.toUpperCase());
    }

    void textLength(String text) {
        System.out.printf("Teksto ilgis %s\n", text.length());
    }

    public static void charAt(String text) {
        System.out.println(text.charAt(2));
    }

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void printNumber(int number) {
        System.out.printf("Įvedėte skaičių: %s\n", number);
    }

    public static void numbersSum(int number1, int number2) {
        System.out.printf("Skaičiaus %s  ir skaičiaus %s suma lygi %s\n", number1, number2, number1 + number2);

    }

    public static void numbersAverage(int number1, int number2) {
        System.out.printf("Skaičiaus %s  ir skaičiaus %s aritmetinis vidurkis lygus %s\n", number1, number2, (number1 + number2) / 2);
    }

    public static void splitToDigits(int number){
        int thousands = number/1000;
        int hundreds = (number-thousands*1000)/100;
        int decimals = (number - thousands*1000-hundreds*100)/10;
        int units = number%10;
        System.out.printf("Skaičiuje %s yra %s tūkstančių\n %s šimtų\n %s dešimčių\n %s vienetų\n  ",number,thousands,hundreds,decimals,units);
    }
}