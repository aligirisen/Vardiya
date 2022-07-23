import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author aligirisen
 */
public class Kidemsiz_Dagitici {
    public static ArrayList<Isci> kidemsizArrList = new ArrayList<Isci>();
  
    public static void kidemisiz_dagitan(Firma A, Firma B, Firma C, Firma D, Firma E, Firma F, Firma G, Firma H, Firma J){
        
        Random rand = new Random();// adaletli olması bir dağılım olması için random fonksiyonu kullanıldı ayrıca bir algoritma geliştirildi
        // initialize kıdemsiz işçi
        
        for (int i = 0; i < 47; i++) {// kidemsiz işçiler oluşturulup arraylist'e eklenir
            Isci temp = new Isci("W-" + String.valueOf(i + 1), false);
            kidemsizArrList.add(temp);
        }

        
        //Indexleri kontrol altında tutabilmek için gereken index sayar
        // Örnek : A firmasında çalışmış olan bir işçi bidaha orada çalışamaz.
        ArrayList<Integer> indexler_c = new ArrayList<>();
        ArrayList<Integer> indexler_a = new ArrayList<>();
        ArrayList<Integer> indexler_b = new ArrayList<>();
        ArrayList<Integer> indexler_d = new ArrayList<>();
        ArrayList<Integer> indexler_e = new ArrayList<>();
        ArrayList<Integer> indexler_f = new ArrayList<>();
        ArrayList<Integer> indexler_g = new ArrayList<>();
        ArrayList<Integer> indexler_h = new ArrayList<>();
        ArrayList<Integer> indexler_j = new ArrayList<>();
        ArrayList<Integer> indexler_global = new ArrayList<>();
        
        
        for (int i = 0; i < 47; i++) {//indexleri eklemek
            indexler_c.add(i);
            indexler_a.add(i);
            indexler_b.add(i);
            indexler_d.add(i);
            indexler_e.add(i);
            indexler_f.add(i);
            indexler_g.add(i);
            indexler_h.add(i);
            indexler_j.add(i);
        }
        int upperbound_global, upperbound_A = 47, upperbound_C = 47, upperbound_B = 47, upperbound_D = 47, upperbound_E = 47, upperbound_F = 47, upperbound_G = 47, upperbound_H = 47, upperbound_J = 47;

        iter:
        for (int counter = 0; counter < 3; counter++) {
            upperbound_global = 47;
            for (int i = 0; i < 47; i++) {// her iterasyon baslangıcında 47 işçilik index havuzunu sıfırlar
                indexler_global.add(i);
            }

            for (int i = 0; i < A.istedigiKidemsiz; i++) { // A sirketinin istediği kidemsiz eleman sayısıyla sınırlanır

                if (upperbound_A == 0) // her işçi A firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_A);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.add("A"); // A firmasını random sayi indexine karşılık gelen işçiye, indexler_a üzerinden arraylist'e ekler.
                    indexler_a.remove(int_random);//ardından indexler_a'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_A -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < B.istedigiKidemsiz; i++) { // B sirketi

                if (upperbound_B == 0) // her işçi b firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_B);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.add("B");// B firmasını random sayi indexine karşılık gelen işçiye, indexler_b üzerinden arraylist'e ekler.
                    indexler_b.remove(int_random);//ardından indexler_b'den o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_B -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < C.istedigiKidemsiz; i++) { // C sirketi

                if (upperbound_C == 0) // her işçi c firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_C);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.add("C");// C firmasını random sayi indexine karşılık gelen işçiye, indexler_c üzerinden arraylist'e ekler.
                    indexler_c.remove(int_random);//ardından indexler_c'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_C -= 1;
                    upperbound_global -= 1;
                }

            }
            for (int i = 0; i < D.istedigiKidemsiz; i++) { // D sirketi

                if (upperbound_D == 0) // her işçi D firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_D);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.add("D");// D firmasını random sayi indexine karşılık gelen işçiye, indexler_d üzerinden arraylist'e ekler.
                    indexler_d.remove(int_random);//ardından indexler_d'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_D -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < E.istedigiKidemsiz; i++) { // E sirketi

                if (upperbound_E == 0) {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_E);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.add("E");// E firmasını random sayi indexine karşılık gelen işçiye, indexler_e üzerinden arraylist'e ekler.
                    indexler_e.remove(int_random);//ardından indexler_e'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_E -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < F.istedigiKidemsiz; i++) { // F sirket

                if (upperbound_F == 0) // her işçi f firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_F);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.add("F");// F firmasını random sayi indexine karşılık gelen işçiye, indexler_f üzerinden arraylist'e ekler.
                    indexler_f.remove(int_random);//ardından indexler_f'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_F -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < G.istedigiKidemsiz; i++) { // G sirketi

                if (upperbound_G == 0) // her işçi g firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_G);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.add("G");// G firmasını random sayi indexine karşılık gelen işçiye, indexler_g üzerinden arraylist'e ekler.
                    indexler_g.remove(int_random);//ardından indexler_g'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_G -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < H.istedigiKidemsiz; i++) { // H sirketi

                if (upperbound_H == 0) // her işçi h firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_H);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.size() == 3) {//işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.isEmpty()) {// işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez.
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.add("H");// H firmasını random sayi indexine karşılık gelen işçiye, indexler_h üzerinden arraylist'e ekler.
                    indexler_h.remove(int_random);//ardından indexler_h'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_H -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < J.istedigiKidemsiz; i++) { // J sirketi

                if (upperbound_J == 0) // her işçi j firmasına gitmişse bitir
                {
                    break iter;
                }
                int int_random = rand.nextInt(upperbound_J);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.size() == 3) { //işçi zaten 3 (max iterasyon) firmada çalışmışsa 4.ye gidemez
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.isEmpty()) { // işçi ilk iterasyonda zaten bir firmaya gittiyse ikinciye gidemez. 
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.size() == 2) { // işçi ikinci iterasyonda 2 firmada çalışmışsa üçüncüye gidemez
                    i--;
                } else {
                    kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.add("J");// J firmasını random sayi indexine karşılık gelen işçiye, indexler_j üzerinden arraylist'e ekler.
                    indexler_j.remove(int_random);//ardından indexler_j'dan o indisi siler böylece bir daha ayni firma ve ayni işçi bir araya gelemez
                    indexler_global.remove(int_random_global);// Bir iterasyon esnasında ayni işçinin iki farklı firmaya gitmemesi için globalden silinir.
                    upperbound_J -= 1;
                    upperbound_global -= 1;
                }
            }
            
            
            
            /*
            //iterasyon tek tek burada da gösterilebilir
            System.out.println("ITERASYON-"+(counter+1)+"\n");
            for (int i = 0; i < 47; i++) {
            System.out.println(kidemsizArrList.get(i).isciAdi + kidemsizArrList.get(i).calistigiFirmalar.toString());
            }*/
            
        
        }
    }
}
        
     
    
