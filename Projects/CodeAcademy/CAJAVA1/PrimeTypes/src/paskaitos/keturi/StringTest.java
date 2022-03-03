package paskaitos.keturi;

import java.sql.SQLOutput;

public class StringTest {
    public static void main(String[] args) {
     /*   String as="Ma
     no vardas Inga";
        System.out.println(as.length());
        System.out.println(as.charAt(3));
        System.out.println(as.substring(12));
        System.out.println(as.substring(0,4));*/
        StringMethod stringMethod = new StringMethod();
        stringMethod.toUpperCase("Man pasisekė mokytis java");
        stringMethod.textLength("Man pasisekė mokytis java");
        StringMethod.charAt("Man pasisekė mokytis java");
        StringMethod.printText("Mano PIRMOJI superinė programa!!!!");
        StringMethod.printText("Mokausi programuoti JAVA");
        StringMethod.printNumber(8);
        StringMethod.numbersSum(3,5);
        StringMethod.numbersAverage(5,2);
        int a=789;
        int b=987;
        int c=a;
        a=b;
        b=c;
        StringMethod.splitToDigits(6297);
        String namas = "Namas";
        namas = namas.replace('s','i');
        System.out.println(namas);
        namas=namas.toUpperCase();
        System.out.println(namas);
        namas=namas.substring(2,4);
        System.out.println(namas);
        namas=namas.concat("ma");
        System.out.println(namas);
        namas=namas.replace('m','n');
        System.out.println(namas);
        int index=namas.indexOf('n');
        System.out.println(index);
    }
}
