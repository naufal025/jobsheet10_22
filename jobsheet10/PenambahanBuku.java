import java.util.Scanner;

public class PenambahanBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String[] namaBuku = new String[100];
        int[] kodeBuku = new int[100];
        System.out.println("Masukkan Jumlah Buku : ");
        int jumlah = sc.nextInt();
        for(int i =0; i<jumlah; i++){
            System.out.println("Masukkan Nama Buku : ");
            sc.nextLine();
            namaBuku[i] = sc.nextLine();
            System.out.println("Masukkan Kode Buku : ");
            kodeBuku[i] = sc.nextInt();
        }

        for (int i=0; i < jumlah; i++) {
            System.out.println("NAma Buku : " + namaBuku[i] + ", Kode Buku : " + kodeBuku[i]);   
        
        
        }
    }
    
}
