package tr.k12.meb.ibrahimonalfenlisesi;

public class DogrusalArama {

    public static void main(String[] args) {

        int[] dizi={1,6,8,3,2,7,4,9,5,10};
        int i=0;
        int n=dizi.length;
        int aranan=5;
        int konum=0;
        System.out.println("Dizinin elemanları");
        for (int sayi:dizi) {
            System.out.print(sayi+" ");
        }
        System.out.println();
        while (i<=n && aranan!=dizi[i]){
            System.out.println("Aranan:"+aranan+" ,Karşılaştırılan :"+dizi[i]+" dizide "+(konum+1)+" .konumda yer almaktadır.");
            i++;
            if (i<=n){konum=i;
            }
            else konum=0;
        }
        System.out.println("Tebrikler buldunuz "+aranan+", "+(konum+1+" .konumda yer almaktadır."));

    }

}
