import java.util.Scanner;

public class TP_3 {
    public static void main(String[] args) {
        chat();
    }
    public static void chat() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Hauteur ? ");
        int a = scan.nextInt();
        System.out.println("Largeur ?");
        int b = scan.nextInt();

        System.out.print("|\\");
        for(int i=0; i<b; i++) {
            System.out.print("-");
        }
        System.out.println("/|");
        for(int i=2; i<a; i++) {
            if(a % 2 ==0 && i==(a/2)) {
                System.out.print("|0");
                for(int j=0; j<b; j++) {
                    System.out.print("-");
                }
                System.out.println("0|");
            } else if(a % 2 !=0 && i==((a+1)/2)) {
                System.out.print("|0");
                for(int k=0; k<b; k++) {
                    System.out.print("-");
                }
                System.out.println("0|");
            } else {
                System.out.print("|");
                for(int l=0; l<b+2; l++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }

        }
        System.out.print("\\_");
        for(int m=0; m<b; m++) {
            System.out.print("^");
        }
        System.out.print("_/");

    }
}