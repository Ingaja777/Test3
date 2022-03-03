package paskaitos.septyni;

import java.util.Scanner;

public class TextMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextMonths textMonth = new TextMonths();

        System.out.println("Įveskite mėnesio numerį");

        int month = sc.nextInt();
        if (month < 0 || month > 12) {
            System.out.println("Įvedėte netinkamą skaičių");
        } else {
            textMonth.printMonth(month);
        }

    }

    private void printMonth(int month) {
        if (month % 2 == 0) {
            switch (month) {
                case 2 -> System.out.println("VASARIS");
                case 4 -> System.out.println("BALANDIS");
                case 6 -> System.out.println("BIRŽELIS");
                case 8 -> System.out.println("RUGPJŪTIS");
                case 10 -> System.out.println("SPALIS");
                case 12 -> System.out.println("GRUODIS");
                default -> System.out.println("TOKIO MĖNESIO NĖRA");
            }
        } else { switch (month) {
            case 1 -> System.out.println("sausis");
            case 3 -> System.out.println("kovas");
            case 5 -> System.out.println("gegužė");
            case 7 -> System.out.println("liepa");
            case 9 -> System.out.println("rugėjis");
            case 11 -> System.out.println("lapkritis");
            default -> System.out.println("tokio mėnesio nėra");
        }
        }
    }
}

