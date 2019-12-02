package tr.k12.meb.ibrahimonalfenlisesi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IkiliArama {


    private static Scanner oku=new Scanner(System.in);
    private static int tutulanSayi = (int) (Math.random() * 100) + 1;
    private static int girilenSayi;
    private static int sayac=0;

    public static void sayiGir() {

        try {
            System.out.print("1 ile 100 arasında sayi giriniz :");
            girilenSayi = oku.nextInt();
            if (girilenSayi < 1 || girilenSayi > 100) {
                throw new Exception("Sayı 1'den küçük veya 100'den büyük olamaz!");
            }
            //Eğer doğru değer ise hesapla yordamını çağır
            hesapla();
        }catch (InputMismatchException e1){
            System.err.println("Lütfen doğru değerler girin!");
        }catch (Exception e) {
            System.err.println("Hata :" + e.getLocalizedMessage());
         }

    }

    private static void hesapla() {

        int i=1;  // i arama aralığının sol sınırı
        int j=100;// j arama aralığının sağ sınırı


        while (i<j){

            int m=(int)((i+j)/2);
            System.out.printf("%d. adım  i-> %d\t j->%d\t m->%d \n",++sayac,i,j,m);
            if (tutulanSayi>m)
            {
                i=m+1;

            }else{
                j=m;
            }
            if (tutulanSayi==m) {
                System.out.println("sayac:"+sayac+" , tutulan sayı "+tutulanSayi+ " bulundu..");
                break;
            }

        }

    }

    public static void main(String[] args) {
        sayiGir();
    }
}
