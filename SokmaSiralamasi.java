package tr.k12.meb.ibrahimonalfenlisesi;

public class SokmaSiralamasi {


    private void ekranaYaz(int[] dizi){

        int n = dizi.length;
        for (int i = 0; i < n; ++i)
            System.out.print(dizi[i] + " ");

        System.out.println();
    }

    private void sirala(int dizi[]){


        for (int i = 1; i < dizi.length; ++i) {
            int anahtar = dizi[i];
            int j = i - 1;
            System.out.println("Şimdiki eleman:"+anahtar);
              while (j >= 0 && dizi[j] > anahtar) {
                System.out.println(dizi[j]+" ile "+ anahtar + " yer değiştiriliyor");
                dizi[j + 1] = dizi[j];
                j = j - 1;
            }
            dizi[j + 1] = anahtar;

            ekranaYaz(dizi);
        }

    }

    public static void main(String[] args) {

        int[] dizi={ 4,3,2,10,12,1,5,6};
        SokmaSiralamasi sirala=new SokmaSiralamasi();
        sirala.ekranaYaz(dizi);
        sirala.sirala(dizi);


    }

}
