package tr.k12.meb.ibrahimonalfenlisesi;

public class SecerekSiralama {


    public static void diziYaz(int[] C){
        for (int sayi:C ) {
            System.out.print(sayi+" ");
        }
        System.out.println();
    }

    public static int[] selectionsort(int[] B,int n){

        int min,tmp;
        for (int i = 0; i < n-1 ; i++) {
            min=i;
            for (int j = i; j <n ; j++) {
                if (B[j]<B[min]){
                    System.out.println("i="+i+" için en küçük değer "+B[j]);
                    min=j;
                }
           }
            System.out.println(B[i]+" ile "+B[min]+" yer değişitiriliyor...");
            tmp=B[i];
            B[i]=B[min];
            B[min]=tmp;
            diziYaz(B);
        }
      return B;
    }


    public static void main(String[] args) {
        int[] A={5,7,2,9,6,1,3,7};
        System.out.println("Karışık halde");
        diziYaz(A);
        selectionsort(A,A.length);
    }

}
