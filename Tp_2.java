import java.util.Scanner;
import java.util.Arrays;

public class Tp_2 {
    public static void main(String[] args) {
        int choix;
        do {
            System.out.println("Quel exercice ? Saisissez :\n" +
                    "1. Discriminant\n" +
                    "2. Parité d’un nombre\n" +
                    "3. Calcul du maximum de deux entiers\n" +
                    "4. Calcul du minimum de deux entiers\n" +
                    "5. Égalité entre chaînes de caractères\n" +
                    "6. Factorielle\n" +
                    "7. Compte à rebours\n" +
                    "8. Valeurs de carrés\n" +
                    "9. Table de multiplication\n" +
                    "10. Division d’entiers\n" +
                    "11. Règle graduée\n" +
                    "12. Nombres premiers\n" +
                    "13. Manipulations sur un tableau\n" +
                    "14. Inverse d'un tableau\n");


            Scanner scan = new Scanner(System.in);
            choix = scan.nextInt();
        }while (choix > 14);
        switch(choix){
            case(1):
                discriminant();
                break;
            case(2):
                parite();
                break;
            case(3):
                max();
                break;
            case(4):
                min();
                break;
            case(5):
                egaliteStr();
                break;
            case(6):
                factorielle();
                break;
            case(7):
                countdown();
                break;
            case(8):
                carres();
                break;
            case(9):
                tableMultiplication();
                break;
            case(10):
                division();
                break;
            case(11):
                regle();
                break;
            case(12):
                nombrePremier();
                break;
            case(13):
                initialisationTableau();
                break;
            case(14):
                inverseTableau();
                break;

        }
    }
    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);


        if (delta < 0) {

            System.out.println("Ce polynome n’a pas de racine reelle, ses racines complèxes sont: s1= (" + -b + " - i * sqrt(-delta)) / " + 2*a + " et s2 = -s1");
        } else if (delta == 0) {
            int sol0 = - b / (2 * a);
            System.out.println("Ce polynome a une racine reelle à savoir " + sol0 );
        } else {

            double sol1 = ((-b -Math.sqrt(delta))/ (2 * a));
            double sol2 = -sol1;
            System.out.println("Ce polynome a deux racines reelles à savoir " + sol1 + sol2 );
        }

    }
    public static void parite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un entier");
        int a = scanner.nextInt();
        if (a % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez deux entiers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < b) {
            System.out.println(b + " est le max de ces deux entiers");
        } else {
            System.out.println(a + " est le max de ces deux entiers");
        }
    }
    public static void min() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez deux entiers");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(b + " est le min de ces deux entiers");
        } else {
            System.out.println(a + " est le min de ces deux entiers");
        }
    }
    public static void egaliteStr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez deux chaînes de caractère");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("Ce sont les mêmes textes!");
        } else {
            System.out.println("Ce ne sont pas les mêmes textes !");
        }
    }
    public static void factorielle() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }
    public static void countdown() {
        for (int i = 15; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Booouuuuuuum");
    }
    public static void carres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choisissez un entier");
        int a = scanner.nextInt();
        int b=a;
        for (int i = 1; i <= 2; i++) {
            System.out.println(b+"^" + i + " = " + a);
            a*=a;
        }
    }
    public static void tableMultiplication() {
        for (int i = 1; i <= 10; i++) {
            int b=0;
            b+=i;
            for(int j = 1; j <= 9; j++) {
                System.out.print(b + "  ");
                b+=i;
            }
            System.out.println(b);
        }
    }
    public static void division() {
        Scanner scanner = new Scanner(System.in);
        int entier1;
        int entier2;
        do {
            System.out.println("Veuillez saisir un entier positif ou nul:");
            entier1 = scanner.nextInt();
        } while (entier1 < 0 );
        do {
            System.out.println("Veuillez saisir un entier strictement positif:");
            entier2 = scanner.nextInt();
        } while (entier2 <= 0);
        System.out.println(entier1 / entier2 + "\n");
    }
    public static void regle() {
        Scanner scanner = new Scanner(System.in);
        int l;
        do {
            System.out.println("Veuillez saisir la longueur souhaitée (un entier strictement positif) :");
            l = scanner.nextInt();
        } while (l <= 0);
        for (int i = 0; i <= l; i++) {
            if (i % 10 == 0) {
                System.out.print("|");
            } else {
                    System.out.print("_");
                }
        }
    System.out.print("\n");
    }
    public static void nombrePremier() {
        Scanner scanner = new Scanner(System.in);
        int nbr;
        int compteur = 0;
        do {
            System.out.println("Veuillez saisir un entier strictement positif) :");
            nbr = scanner.nextInt();
        } while (nbr <= 0);
        for (int i = 1; i <= nbr; i++) {
            if (nbr % i == 0) {
                compteur++;
            }
        }
        if (compteur > 2) {
            System.out.print("Ce nombre n'est pas premier ! \n");
        } else {
            System.out.print("Ce nombre est premier ! \n");
        }

    }
    public static void initialisationTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        int max = tableau[0];
        int min = tableau[0];
        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
            if (max < tableau[i]) {
                max = tableau[i];
            }
            if (min > tableau[i]) {
                min = tableau[i];
            }
            if (i % 2 == 0) {
                System.out.println(tableau[i] + " est un nombre d'indice pair dans le tableau ");
            }
            if (tableau[i] % 2 == 0) {
                System.out.println(tableau[i] + " est pair");
            }
        }
        System.out.println("  ");
        System.out.println("Le max : " + max);
        System.out.println("Le min : " + min);
        System.out.println("La somme : " + somme);


    }
    public static void inverseTableau() {
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }

        int[] tableau2 = new int[tableau.length];

        for (int i = 0; i < tableau.length; i++) {
            tableau2[i] = tableau[tableau.length - i - 1 ];

        }
        System.out.println("Le tableau inversé est " + Arrays.toString(tableau2));
    }

}

