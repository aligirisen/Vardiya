import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author aligirisen
 */
public class Kidemli_Dagitici {
    public static ArrayList<Isci> kidemlilerArrList = new ArrayList<Isci>();

    public static void kidemli_dagitan(Firma A, Firma B, Firma C, Firma D, Firma E, Firma F, Firma G, Firma H, Firma J) {
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {// kidemli işçiler oluşturulup arraylist'e eklenir
            Isci temp = new Isci("LW-" + String.valueOf(i + 1), true);
            kidemlilerArrList.add(temp);
        }
        
        int kidemli_global = 10;
        ArrayList<Integer> indexler_kidemli_global = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            indexler_kidemli_global.add(i);
            
        }
        for (int i = 0; i < A.istedigiKidemli; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("A");// random kidemli işçiye A firması eklenir
                break;
            }

        }
        
        for (int i = 0; i < B.istedigiKidemli; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("B");// random kidemli işçiye B firması eklenir
                break;
            }
           
        }
        for (int j = 0; j < C.istedigiKidemli; j++) {
            for (int i = 0; i < kidemli_global; i++) {
                int int_rand = rand.nextInt(kidemli_global);
                if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                    kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("C");// random kidemli işçiye C firması eklenir
                    break;
                }
            }
        }
        for (int j = 0; j < D.istedigiKidemli; j++){
            for (int i = 0; i < kidemli_global; i++) {
                int int_rand = rand.nextInt(kidemli_global);
                if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                    kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("D");// random kidemli işçiye D firması eklenir
                    break;
                }
            }
        }
        
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("E");// random kidemli işçiye E firması eklenir
                break;
            }
            
        }
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("F");// random kidemli işçiye F firması eklenir
                break;
            }
        }
        for (int i = 0; i < kidemli_global; i++) {
            int int_rand = rand.nextInt(kidemli_global);
            if (kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.size() == 0) {// bir iterasyonda bir tane firmaya sahip olacakları için sınırlandırma
                kidemlilerArrList.get(indexler_kidemli_global.get(int_rand)).calistigiFirmalar.add("G"); // random kidemli işçiye G firması eklenir
                break;
            }
        }
        
    }
    
    
    
    
    
}
