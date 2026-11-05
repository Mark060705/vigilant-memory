package nezet;

import java.util.Scanner;

public class KonzolNezet {
    static Scanner scanner = new Scanner(System.in);
    
    public static void kiirAllitasok(String sz){System.out.println(sz + "\nKi a tettes?(sorszám)\n");}
    
    public static int beker(){
    int szam = scanner.nextInt();

        while (szam < 1 || szam > 4) {
            System.out.print("1-től 4-ig: ");
            szam = scanner.nextInt();
        }
        return szam - 1;
    }
    
    public static void kiir(String sz){System.out.println("\n" + sz);}
}
