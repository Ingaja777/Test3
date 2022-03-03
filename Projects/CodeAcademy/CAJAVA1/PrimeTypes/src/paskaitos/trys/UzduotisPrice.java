package paskaitos.trys;

public class UzduotisPrice {
    double price = 9.99;
    int count = 0;

    public static void main(String[] args) {

        spausdinkPrice();

        UzduotisPrice uzduotis2 = new UzduotisPrice();
        System.out.println(uzduotis2.count);
        uzduotis2.increaseCount();
        System.out.println(uzduotis2.count);
        uzduotis2.increaseCustomCount(10);
        System.out.println(uzduotis2.count);

        Asmuo asmuo = new Asmuo();
        Asmuo.vardoSpausdinimas("Svajūnas");
        asmuo.amziausSpausdinimas(33);
    }



    private void increaseCount() {
        count++;
    }
    private static void spausdinkPrice() {
        UzduotisPrice uzduotis = new UzduotisPrice();
        System.out.println(uzduotis.price);
    }

    private void increaseCustomCount(int countIncrease) {
        count += countIncrease;
    }
}

class Asmuo {

   public static void vardoSpausdinimas(String vardas) {
        System.out.println(vardas);
    }

    void amziausSpausdinimas(int amzius) {
        System.out.println(amzius);
    }
}