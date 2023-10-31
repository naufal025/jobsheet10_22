import java.util.Scanner;
public class BioskopWithScanner22 {
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        
        String[][] penonton = new String[4][2];
        int baris,kolom;
        String next,nama;
        
        while (true){
            System.out.print("Masukkan nama : ");
            nama = sc22.nextLine();
            System.out.print("Masukkan baris : ");
            baris = sc22.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = sc22.nextInt();
            sc22.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = sc22.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
