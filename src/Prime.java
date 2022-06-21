// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

public class Prime {
    public static void main(String[] args) {

        System.out.println();

        /* İlk olarak sınır değerlerim olan 1-100'ü belirliyorum ve bir sayaç ekliyorum. Bir sonraki adımda her sayıyı kendine eşit olana kadar gelen sayılara bölüyorum
        ve her kalansız bölmede sayacı bir arttırıyorum. Sayacı 2 gelen sayıları ekrana yazdırıyoruz. Çünkü her asal sayının 2 böleni vardır (1 ve kendisi). */

        for (int i = 1; i <= 100; i++) {

            int counter = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}