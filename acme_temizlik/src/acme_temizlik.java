
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author agiri
 */
public class acme_temizlik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        // TODO code application logic here
        // initialize kıdemsiz işçi
        ArrayList<Isci> kidemsizArrList = new ArrayList<Isci>();
        for (int i = 0; i < 47; i++) {
            Isci temp = new Isci("W-" + String.valueOf(i + 1), false);
            kidemsizArrList.add(temp);
        }

        // initialize kıdemli işçi
        ArrayList<Isci> kidemlilerArrList = new ArrayList<Isci>();
        for (int i = 0; i < 10; i++) {
            Isci temp = new Isci("LW-" + String.valueOf(i + 1), true);
            kidemlilerArrList.add(temp);
        }

        //initialize firmalar
        Firma A = new Firma("A", 1, 4);
        Firma B = new Firma("B", 1, 4);
        Firma C = new Firma("C", 2, 12);
        Firma D = new Firma("D", 2, 6);
        Firma E = new Firma("E", 1, 3);
        Firma F = new Firma("F", 1, 2);
        Firma G = new Firma("G", 1, 5);
        Firma H = new Firma("H", 0, 1);
        Firma J = new Firma("J", 0, 1);

        // main algoritma burası
        // kıdemsizleri random bir şekilde C firmasına dağıt
        // tekrardan kıdemsizleri C firmasına dağıt ama eğer C de çalışmışlarsa olana kadar dağıt
        ArrayList<Integer> indexler_c = new ArrayList<>();//  tombala torbası
        ArrayList<Integer> indexler_a = new ArrayList<>();
        ArrayList<Integer> indexler_b = new ArrayList<>();
        ArrayList<Integer> indexler_d = new ArrayList<>();
        ArrayList<Integer> indexler_e = new ArrayList<>();
        ArrayList<Integer> indexler_f = new ArrayList<>();
        ArrayList<Integer> indexler_g = new ArrayList<>();
        ArrayList<Integer> indexler_h = new ArrayList<>();
        ArrayList<Integer> indexler_j = new ArrayList<>();
        ArrayList<Integer> indexler_global = new ArrayList<>();

        ArrayList<Integer> indexler_kidemli_global = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_a = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_b = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_c = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_d = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_e = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_f = new ArrayList<>();
        ArrayList<Integer> indexler_kidemli_g = new ArrayList<>();

        for (int i = 0; i < 47; i++) {
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
        for (int i = 0; i < 10; i++) {
            indexler_kidemli_global.add(i);
            
        }

        int kidemli_global = 10;

        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("A");

                break;
            }

        }
        
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("B");

                break;
            }
           
        }
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < kidemli_global; i++) {
                int int_rand = rand.nextInt(kidemli_global);
                if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                    kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("C");
                    break;
                }
            }
            for (int i = 0; i < kidemli_global; i++) {
                int int_rand = rand.nextInt(kidemli_global);
                if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                    kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("D");
                    break;
                }
            }
        }
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("E");
                break;
            }
            
        }
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("F");
                break;
            }
        }
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("G");
 

                break;
            }
        }
        
        
        
        

        for (int i = 0; i < 10; i++) {
            System.out.println(kidemlilerArrList.get(i).isciAdi + " firma : " + kidemlilerArrList.get(i).calistigiFirmalar.toString());
            //TimeUnit.SECONDS.sleep(1);
        }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int upperbound_global, upperbound_A = 47, upperbound_C = 47, upperbound_B = 47, upperbound_D = 47, upperbound_E = 47, upperbound_F = 47, upperbound_G = 47, upperbound_H = 47, upperbound_J = 47;

        iter:
        for (int counter = 0; counter < 3; counter++) {
            upperbound_global = 47;
            for (int i = 0; i < 47; i++) {// her iterasyon baslangıcında 47 işçilik index havuzunu sıfırlar
                indexler_global.add(i);
            }

            for (int i = 0; i < 4; i++) { // A sirketi

                if (upperbound_A == 0) // her işçi A firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_A);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_a.get(int_random)).calistigiFirmalar.add("A");
                    indexler_a.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_A -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 4; i++) { // B sirketi

                if (upperbound_B == 0) // her işçi b firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_B);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_b.get(int_random)).calistigiFirmalar.add("B");
                    indexler_b.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_B -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 12; i++) { // C sirketi

                if (upperbound_C == 0) // her işçi c firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_C);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_c.get(int_random)).calistigiFirmalar.add("C");
                    indexler_c.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_C -= 1;
                    upperbound_global -= 1;
                }

            }
            for (int i = 0; i < 6; i++) { // D sirketi

                if (upperbound_D == 0) // her işçi D firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_D);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_d.get(int_random)).calistigiFirmalar.add("D");
                    indexler_d.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_D -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 3; i++) { // E sirketi

                if (upperbound_E == 0) {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_E);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_e.get(int_random)).calistigiFirmalar.add("E");
                    indexler_e.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_E -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 2; i++) { // F sirket

                if (upperbound_F == 0) // her işçi f firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_F);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_f.get(int_random)).calistigiFirmalar.add("F");
                    indexler_f.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_F -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 5; i++) { // G sirketi

                if (upperbound_G == 0) // her işçi g firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_G);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_g.get(int_random)).calistigiFirmalar.add("G");
                    indexler_g.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_G -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 1; i++) { // H sirketi

                if (upperbound_H == 0) // her işçi h firmasına gitmişse bitir
                {
                    break iter;
                }

                int int_random = rand.nextInt(upperbound_H);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_h.get(int_random)).calistigiFirmalar.add("H");
                    indexler_h.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_H -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 1; i++) { // J sirketi

                if (upperbound_J == 0) // her işçi j firmasına gitmişse bitir
                {
                    break iter;
                }
                int int_random = rand.nextInt(upperbound_J);
                int int_random_global = rand.nextInt(upperbound_global);

                if (kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.size() == 3) {
                    i--;
                } else if (counter == 0 && !kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.isEmpty()) {
                    i--;
                } else if (counter == 1 && kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.size() == 2) {
                    i--;
                } else {
                    kidemsizArrList.get(indexler_j.get(int_random)).calistigiFirmalar.add("J");
                    indexler_j.remove(int_random);
                    indexler_global.remove(int_random_global);
                    upperbound_J -= 1;
                    upperbound_global -= 1;
                }
            }
            for (int i = 0; i < 47; i++) {
                System.out.println(kidemsizArrList.get(i).isciAdi + " firma : " + kidemsizArrList.get(i).calistigiFirmalar.toString());
                //TimeUnit.SECONDS.sleep(1);
            }
        }

    }

}
