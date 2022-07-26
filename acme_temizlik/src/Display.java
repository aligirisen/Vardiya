import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author aligirisen
 */
public class Display {
    public static int iter_counter = 0;
    public static ArrayList<String> firmalist_A = new ArrayList<>();
    public static ArrayList<String> firmalist_B = new ArrayList<>();
    public static ArrayList<String> firmalist_C = new ArrayList<>();
    public static ArrayList<String> firmalist_D = new ArrayList<>();
    public static ArrayList<String> firmalist_E = new ArrayList<>();
    public static ArrayList<String> firmalist_F = new ArrayList<>();
    public static ArrayList<String> firmalist_G = new ArrayList<>();
    public static ArrayList<String> firmalist_H = new ArrayList<>();
    public static ArrayList<String> firmalist_J = new ArrayList<>();
    

    // verileri içeren static arraylistleri alarak okunaklı bir biçimde bastırır
    // okunaklı bir tablo formatında bastırır
    public static void calcKidemsiz(String kidemsiz_isci, String firma_adi) {
        switch (firma_adi) {
            case "A":
                firmalist_A.add(kidemsiz_isci);
                break;
            case "B":
                firmalist_B.add(kidemsiz_isci);
                break;
            case "C":
                firmalist_C.add(kidemsiz_isci);
                break;
            case "D":
                firmalist_D.add(kidemsiz_isci);
                break;
            case "E":
                firmalist_E.add(kidemsiz_isci);
                break;
            case "F":
                firmalist_F.add(kidemsiz_isci);
                break;
            case "G":
                firmalist_G.add(kidemsiz_isci);
                break;
            case "H":
                firmalist_H.add(kidemsiz_isci);
                break;
            case "J":
                firmalist_J.add(kidemsiz_isci);
                break;
            default:
                break;
        }
    }
    public static void calcKidemli(String kidemli_isci, String firma_adi){
        
        switch (firma_adi) {
            case "A":
                firmalist_A.add(kidemli_isci);
                break;
            case "B":
                firmalist_B.add(kidemli_isci);
                break;
            case "C":
                firmalist_C.add(kidemli_isci);
                break;
            case "D":
                firmalist_D.add(kidemli_isci);
                break;
            case "E":
                firmalist_E.add(kidemli_isci);
                break;
            case "F":
                firmalist_F.add(kidemli_isci);
                break;
            case "G":
                firmalist_G.add(kidemli_isci);
                break;
            default:
                break;
        }
    }
    
    
    // 1. iterasyondan W-0 Cye gitse
   /* public static void dispall() {
        System.out.println(" MAKSIMUM ITERASYON (3)");
        int j =0;
        for (int i = 0; i < 47; i++) {
            if(j < 10)
                System.out.print(Kidemli_Dagitici.kidemlilerArrList.get(j).isciAdi + Kidemli_Dagitici.kidemlilerArrList.get(j).calistigiFirmalar.toString()+"   ");
            else
                System.out.print("\t  ");
            System.out.println(Kidemsiz_Dagitici.kidemsizArrList.get(i).isciAdi + Kidemsiz_Dagitici.kidemsizArrList.get(i).calistigiFirmalar.toString());
            
            j++;
        }
    }*/
    

    public static void dispall(){
        
        List<String> head_A = firmalist_A.subList(0, 5);
        List<String> mid_A = firmalist_A.subList(5, 9);
        List<String> tail_A = firmalist_A.subList(9, 13);
        List<String> head_B = firmalist_B.subList(0, 5);
        List<String> mid_B = firmalist_B.subList(5, 9);
        List<String> tail_B = firmalist_B.subList(9, 13);
        List<String> head_C = firmalist_C.subList(0, 14);
        List<String> mid_C = firmalist_C.subList(14, 26);
        List<String> tail_C = firmalist_C.subList(26, 38);
        List<String> head_D = firmalist_D.subList(0, 8);
        List<String> mid_D = firmalist_D.subList(8, 14);
        List<String> tail_D = firmalist_D.subList(14, 20);
        List<String> head_E = firmalist_E.subList(0, 4);
        List<String> mid_E = firmalist_E.subList(4, 7);
        List<String> tail_E = firmalist_E.subList(7, 10);
        List<String> head_F = firmalist_F.subList(0, 3);
        List<String> mid_F = firmalist_F.subList(3, 5);
        List<String> tail_F = firmalist_F.subList(5, 7);
        List<String> head_G = firmalist_G.subList(0, 6);
        List<String> mid_G = firmalist_G.subList(6, 11);
        List<String> tail_G = firmalist_G.subList(11, 16);
        List<String> head_H = firmalist_H.subList(0, 1);
        List<String> mid_H = firmalist_H.subList(1, 2);
        List<String> tail_H = firmalist_H.subList(2, 3);
        List<String> head_J = firmalist_J.subList(0, 1);
        List<String> mid_J = firmalist_J.subList(1, 2);
        List<String> tail_J = firmalist_J.subList(2, 3);
        
        
          if(iter_counter == 0){
            System.out.println("\t \t\tA Firmasi\t\tB Firmasi\t\tC Firmasi\t\tD Firmasi\t\tE Firmasi\t\tF Firmasi\t\tG Firmasi\t\tH Firmasi\t\tJ Firmasi\n");
        }
        System.out.print((iter_counter+1)+". ITERASYON : \t"+head_A+
                " \t"+head_B+
                " \t"+head_C.get(0)+
                " \t"+head_D+
                " \t"+head_E+
                " \t"+head_F+
                " \t"+head_G+
                " \t"+head_H+
                " \t"+head_J);
        
        System.out.println("\n");
        
        iter_counter++;
        discard_arraylists();
    }

    public static void discard_arraylists() {
        firmalist_A.removeAll(firmalist_A);
        firmalist_B.removeAll(firmalist_B);
        firmalist_C.removeAll(firmalist_C);
        firmalist_D.removeAll(firmalist_D);
        firmalist_E.removeAll(firmalist_E);
        firmalist_F.removeAll(firmalist_F);
        firmalist_G.removeAll(firmalist_G);
        firmalist_H.removeAll(firmalist_H);
        firmalist_J.removeAll(firmalist_J);

    }

}
