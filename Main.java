package tr.k12.meb.ibrahimonalfenlisesi;

public class Main {

    public static void main(String[] args) {

        int[] dizi={2,85,174,-5,98,0};
        // tamsayı tipinde sayılar kümesi
        int max=dizi[0];
        // dizinin ilk elemanını en büyük atıyoruz
        for (int i = 1; i <dizi.length ; i++) {
            // dizinin 2. elemanından itibaren büyüklük karşılaştırması yapıyopruz
            if (max<dizi[i])max=dizi[i];
            //eğer karşılaştırdığımız değer elimizde olan değerden büyükse
            //elimizde olan değer yerine yeni değeri atıyoruz
        }
        for (int i = 0; i < dizi.length ; i++) {
            //dizinin elemanlarını ekrana yazdırıyoruz
            System.out.println("dizi["+i+"] = "+dizi[i]);
        }
        //En büyük elemanı ekrana yazdırıyoruz
        System.out.printf("En büyük eleman %d",max);

    }
}
