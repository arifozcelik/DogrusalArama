package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class DogrusalArama {
    public static void main(String[] args) {
        //sırasız dizi
        int A[] = {12,3,5,8,9,1,34,65,7,88};
        int i,Aranan,bayrak=0;
        System.out.printf("Aranan sayı:");
        Scanner tara = new Scanner(System.in);
        Aranan = tara.nextInt();

        //doğrusal arama algoritması
        for (i=0; i<10;i++){
            if(Aranan==A[i]){
                System.out.printf("%d. sırada bulundu", i+1);
                bayrak =1;
                break;
            }
        }//for i döngüsü sonu
        if (bayrak==0)
            System.out.println("Aranan bulunamadı...");
    }
}
