package paskaitos.du;

public class Uzduotis2Metodai{
    public static void main(String[] args) {
        spausdink("Inga","Jakubėnaitė","JAVA",30);
        spausdink("Inga","Jakubėnaitė","JAVA");
 //       m1();
    }

    public static void spausdink(String vardas, String pavarde, String kalba, int savaites){
        System.out.printf("Aš %s %s tikrai išmoksiu programuoti %s per %s savaites!!!!\n",vardas,pavarde,kalba,savaites);

    }

    public static void spausdink(String vardas, String pavarde, String kalba){
        System.out.printf("Aš %s %s tikrai išmoksiu programuoti %s !!!!!!!!",vardas,pavarde, kalba);

    }
    public static void m1(){
        System.out.println("Pirmas metodas");
        m2();
    }
    public static void m2(){
        System.out.println("Antras metodas");
        m3();
    }
    public static void m3(){
        System.out.println("Trečias metodas");
    }
}
