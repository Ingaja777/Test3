package paskaitos.du;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UzduotisPlotai {
    public static void main(String[] faina) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Įveskite a:");
        double a = sc.nextDouble();
        System.out.println("Įveskite b:");
        double b = sc.nextDouble();
        System.out.println("Pasirinkite kokios figūros plotą paskaičiuoti:\n" +
                "[1] Trikampio\n" +
                "[2] Stačiakampio\n" +
                "[3] Kvadrato\n" +
                "[4] Apskritimo\n");
        Plotai plotai = new Plotai();
        int ivestis = sc.nextInt();
        sc.nextLine();
        while (ivestis != 5) {
            switch (ivestis) {
                case 1:
                    System.out.println("Trikampio plotas: " + plotai.trikampioPlotas(a, b));
                    break;
                case 2:
                    System.out.println("Stačiakampio plotas: " + plotai.staciakampioPlotas(a, b));
                    break;
                case 3:
                    System.out.println("Kvadrato plotas: " + plotai.kvadratoPlotas(a));
                    break;
                case 4:
                    System.out.println("Apskritimo plotas: " + plotai.apskritimoPlotas(a));
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Pasirinkite ką norite atlikti.");
                    break;
            }
        }
    }
}
    class Plotai{

    double trikampioPlotas(double a,double b){
        return((a*b)/2);
    }
    double staciakampioPlotas(double a, double b){
        return (a*b);
    }
    double kvadratoPlotas(double a){
        return a*a;
    }
    double apskritimoPlotas(double a){
        double pi=3.1415;
        return pi*a*a;
    }
}
