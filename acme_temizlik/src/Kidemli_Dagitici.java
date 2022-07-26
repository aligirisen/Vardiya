import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author aligirisen
 */
public class Kidemli_Dagitici {
    public static ArrayList<Isci> kidemlilerArrList = new ArrayList<Isci>();
    public static ArrayList<Integer> indexler_kidemli_global = new ArrayList<>();
    public static int kidemli_global = 10;


    public static void kidemli_dagitan(Firma A, Firma B, Firma C, Firma D, Firma E, Firma F, Firma G, Firma H, Firma J) {
        Random rand = new Random();
        init_kidemli();

        for (int i = 0; i < 50; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("A");// random kidemli işçiye A firması eklenir
                Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "A");
                break;
            }

        }
        
        for (int i = 0; i < 50; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("B");// random kidemli işçiye B firması eklenir
                Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "B");
                break;
            }
           
        }
        for (int j = 0; j < C.istedigiKidemli; j++) {
            for (int i = 0; i < kidemli_global; i++) {
                int int_rand = rand.nextInt(kidemli_global);
                if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                    kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("C");// random kidemli işçiye C firması eklenir
                    Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "C");
                    break;
                }
            }
        }
        for (int j = 0; j < D.istedigiKidemli; j++){
            for (int i = 0; i < kidemli_global; i++) {
                int int_rand = rand.nextInt(kidemli_global);
                if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                    kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("D");// random kidemli işçiye D firması eklenir
                    Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "D");
                    break;
                }
            }
        }
        
        for (int i = 0; i < 50; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("E");// random kidemli işçiye E firması eklenir
                Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "E");
                break;
            }
            
        }
        for (int i = 0; i < 50; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("F");// random kidemli işçiye F firması eklenir
                Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "F");
                break;
            }
        }
        for (int i = 0; i < 50; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.isEmpty()) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("G"); // random kidemli işçiye G firması eklenir
                Display.calcKidemli(kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).isciAdi, "G");
                break;
            }
        }
        init_kidemli();
    }
    public static void init_kidemli(){
        
        for (int i = 0; i < 10; i++) {// kidemli işçiler oluşturulup arraylist'e eklenir
            Isci temp = new Isci("LW-" + String.valueOf(i + 1), true);
            kidemlilerArrList.add(temp);
        }
        for (int i = 0; i < 10; i++){
            indexler_kidemli_global.add(i);
        }
        for(int i = 0 ; i<10; i++){
            kidemlilerArrList.get(i).calistigiFirmalar.clear();
        }
    }
    // kidemsizin entegresyonu oldu gibi kidemliyi yapıp dene
}
