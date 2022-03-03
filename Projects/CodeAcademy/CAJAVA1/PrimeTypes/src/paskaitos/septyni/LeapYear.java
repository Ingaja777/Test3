package paskaitos.septyni;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Įveskite metus");
        int yearToCheck=sc.nextInt();
        sc.nextLine();
        LeapYear leapYear=new LeapYear();
        leapYear.isLeap(yearToCheck);
    }
    private void isLeap(int yearToCheck){
        if (yearToCheck%4==0) {
            if (yearToCheck%100!=0){
                System.out.printf("%s is leap year",yearToCheck);
            } else if (yearToCheck%400==0){
                System.out.printf("%s is leap year",yearToCheck);
            } else {
                System.out.printf("%s is common year",yearToCheck);
            }
        } else {
            System.out.printf("%s is common year",yearToCheck);
        }
    }
}
