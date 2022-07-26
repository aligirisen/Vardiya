import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 *
 * @author aligirisen
 */
public class Display {/*
    public static TableList tl = new TableList(10,"Iterasyon" , "A Firmasi-------------------------------------------------------------", 
                "--------------------------------B Firmasi--------------------------------------------------", 
                "---------------------------------------------C Firmasi---------------------------------------------------------------------------------------------",
                "------------------------------------------------------------------D Firmasi--------------------------------------------------------------------------------------------",
                "--------------------------------------------------------------------------------------"
                        + "------------E Firmasi------------------------------------------------------------------------------------------------------------------------------",
                "------------------------------------------------------------------------------------"
                        + "--------------F Firmasi-------------------------------------------------------------------------------------------------------------------------------------------------",
                "----------------------------------------------------------------------------------"
                        + "----------------------G Firmasi--------------------------------------------------------------------------------------------------------",
                "-----------------------------------------------------------------------"
                        + "---------------------------------H Firmasi--------------------------------------------------------------------------------------------------------------------------------------------------------------------",
                "-------------------------------------------------------------------------------"
                        + "----------------------------------------------------------------------J Firmasi--------------------------------------------------").sortBy(0).withUnicode(false);
    */public static int iter_counter = 0;
    public static ArrayList<String> firmalist_A = new ArrayList<>();
    public static ArrayList<String> firmalist_B = new ArrayList<>();
    public static ArrayList<String> firmalist_C = new ArrayList<>();
    public static ArrayList<String> firmalist_D = new ArrayList<>();
    public static ArrayList<String> firmalist_E = new ArrayList<>();
    public static ArrayList<String> firmalist_F = new ArrayList<>();
    public static ArrayList<String> firmalist_G = new ArrayList<>();
    public static ArrayList<String> firmalist_H = new ArrayList<>();
    public static ArrayList<String> firmalist_J = new ArrayList<>();/*
    public static String firma_A_1 = "";
    public static String firma_A_2 = "";
    public static String firma_A_3 = "";
    public static String firma_B_1 = "";
    public static String firma_B_2 = "";
    public static String firma_B_3 = "";
    public static String firma_C_1 = "";
    public static String firma_C_2 = "";
    public static String firma_C_3 = "";
    public static String firma_D_1 = "";
    public static String firma_D_2 = "";
    public static String firma_D_3 = "";
    public static String firma_E_1 = "";
    public static String firma_E_2 = "";
    public static String firma_E_3 = "";
    public static String firma_F_1 = "";
    public static String firma_F_2 = "";
    public static String firma_F_3 = "";
    public static String firma_G_1 = "";
    public static String firma_G_2 = "";
    public static String firma_G_3 = "";
    public static String firma_H_1 = "";
    public static String firma_H_2 = "";
    public static String firma_H_3 = "";
    public static String firma_J_1 = "";
    public static String firma_J_2 = "";
    public static String firma_J_3 = "";*/
    

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
        
        
        
        /*
        for (String s : head_A){
            firma_A_1 += s + "\t";
        }
        for (String s : mid_A){
            firma_A_2 += s + "\t";
        }
        for (String s : tail_A){
            firma_A_3 += s + "\t";
        }
        for (String s : head_B){
            firma_B_1 += s + "\t";
        }
        for (String s : mid_B){
            firma_B_2 += s + "\t";
        }
        for (String s : tail_B){
            firma_B_3 += s + "\t";
        }
        for (String s : head_C){
            firma_C_1 += s + "\t";
        }
        for (String s : mid_C){
            firma_C_2 += s + "\t";
        }
        for (String s : tail_C){
            firma_C_3 += s + "\t";
        }
        for (String s : head_D){
            firma_D_1 += s + "\t";
        }
        for (String s : mid_D){
            firma_D_2 += s + "\t";
        }
        for (String s : tail_D){
            firma_D_3 += s + "\t";
        }
        for (String s : head_E){
            firma_E_1 += s + "\t";
        }
        for (String s : mid_E){
            firma_E_2 += s + "\t";
        }
        for (String s : tail_E){
            firma_E_3 += s + "\t";
        }
        for (String s : head_F){
            firma_F_1 += s + "\t";
        }
        for (String s : mid_F){
            firma_F_2 += s + "\t";
        }
        for (String s : tail_F){
            firma_F_3 += s + "\t";
        }
        for (String s : head_G){
            firma_G_1 += s + "\t";
        }
        for (String s : mid_G){
            firma_G_2 += s + "\t";
        }
        for (String s : tail_G){
            firma_G_3 += s + "\t";
        }
        for (String s : head_H){
            firma_H_1 += s + "\t";
        }
        for (String s : mid_H){
            firma_H_2 += s + "\t";
        }
        for (String s : tail_H){
            firma_H_3 += s + "\t";
        }
        for (String s : head_J){
            firma_J_1 += s + "\t";
        }
        for (String s : mid_J){
            firma_J_2 += s + "\t";
        }
        for (String s : tail_J){
            firma_J_3 += s + "\t";
        }*/
        
          if(iter_counter == 0){
            System.out.println("\t \t\tA Firmasi\t\tB Firmasi\t\tC Firmasi\t\tD Firmasi\t\tE Firmasi\t\tF Firmasi\t\t\tG Firmasi\t\tH Firmasi\t\tJ Firmasi\n");
        }
        System.out.print((iter_counter+1)+". ITERASYON : "+
                " \t"+head_A.get(0)+" "+head_A.get(1)+" "+head_A.get(2)+
                " \t|"+head_B.get(0)+" "+head_B.get(1)+" "+head_B.get(2)+
                " \t|"+head_C.get(0)+" "+head_C.get(1)+" "+head_C.get(2)+
                " \t|"+head_D.get(0)+" "+head_D.get(1)+" "+head_D.get(2)+
                " \t|"+head_E.get(0)+" "+head_E.get(1)+" "+head_E.get(2)+
                " \t|"+head_F.get(0)+" "+head_F.get(1)+" "+head_F.get(2)+
                " \t|\t"+head_G.get(0)+" "+head_G.get(1)+" "+head_G.get(2)+
                " \t|\t"+head_H.get(0)+
                " \t|\t"+head_J.get(0)+
                "\n\t\t\t"+head_A.get(3)+" "+head_A.get(4)+
                "\t\t"+head_B.get(3)+" "+head_B.get(4)+
                "\t\t"+head_C.get(3)+" "+head_C.get(4)+" "+head_C.get(5)+
                "\t\t"+head_D.get(3)+" "+head_D.get(4)+" "+head_D.get(5)+
                "\t\t"+head_E.get(3)+
                "\t\t"+"\t\t\t"+
                "\t\t"+head_G.get(3)+" "+head_G.get(4)+" "+head_G.get(5)+
                "\n\t\t\t\t\t\t\t\t\t"+head_C.get(6)+" "+head_C.get(7)+" "+head_C.get(8)+
                "\t\t"+head_D.get(6)+" "+head_D.get(7)+
                "\n\t\t\t\t\t\t\t\t\t"+head_C.get(9)+" "+head_C.get(10)+" "+head_C.get(11)+" "+head_C.get(12)+
                "\n\n\n"
        );
        iter_counter += 1;
        System.out.print((iter_counter+1)+". ITERASYON : "+
                " \t"+tail_A.get(0)+" "+tail_A.get(1)+" "+tail_A.get(2)+
                " \t|\t"+tail_B.get(0)+" "+tail_B.get(1)+" "+tail_B.get(2)+
                " \t|\t"+tail_C.get(0)+" "+tail_C.get(1)+" "+tail_C.get(2)+
                " \t|\t"+tail_D.get(0)+" "+tail_D.get(1)+" "+tail_D.get(2)+
                " \t|\t"+tail_E.get(0)+" "+tail_E.get(1)+" "+tail_E.get(2)+
                " \t|\t"+tail_F.get(0)+" "+tail_F.get(1)+
                " \t|\t"+tail_G.get(0)+" "+tail_G.get(1)+" "+tail_G.get(2)+
                " \t|\t"+tail_H.get(0)+
                " \t|\t"+tail_J.get(0)+
                "\n\t\t\t"+tail_A.get(3)+
                "\t\t\t"+tail_B.get(3)+
                "\t\t\t"+tail_C.get(3)+" "+tail_C.get(4)+" "+tail_C.get(5)+
                "\t\t"+tail_D.get(3)+" "+tail_D.get(4)+" "+tail_D.get(5)+
                "\t\t"+
                "\t\t"+"\t\t\t"+
                "\t\t"+tail_G.get(3)+" "+tail_G.get(4)+
                "\n\t\t\t\t\t\t\t\t\t"+tail_C.get(6)+" "+tail_C.get(7)+" "+tail_C.get(8)+
                "\n\t\t\t\t\t\t\t\t\t"+tail_C.get(9)+" "+tail_C.get(10)+
                "\n\n\n"
        );
        iter_counter += 1;
        System.out.print((iter_counter+1)+". ITERASYON : "+
                " \t"+mid_A.get(0)+" "+mid_A.get(1)+" "+mid_A.get(2)+
                " \t|\t"+mid_B.get(0)+" "+mid_B.get(1)+" "+mid_B.get(2)+
                " \t|\t"+mid_C.get(0)+" "+mid_C.get(1)+" "+mid_C.get(2)+
                " \t|\t"+mid_D.get(0)+" "+mid_D.get(1)+" "+mid_D.get(2)+
                " \t|\t"+mid_E.get(0)+" "+mid_E.get(1)+" "+mid_E.get(2)+
                " \t|\t"+mid_F.get(0)+" "+mid_F.get(1)+
                " \t|\t"+mid_G.get(0)+" "+mid_G.get(1)+" "+mid_G.get(2)+
                " \t|\t"+mid_H.get(0)+
                " \t|\t"+mid_J.get(0)+
                "\n\t\t\t"+mid_A.get(3)+
                "\t\t\t"+head_B.get(3)+
                "\t\t\t"+head_C.get(3)+" "+head_C.get(4)+" "+head_C.get(5)+
                "\t\t"+head_D.get(3)+" "+head_D.get(4)+" "+head_D.get(5)+
                "\t\t"+
                "\t\t"+"\t\t\t"+
                "\t\t"+mid_G.get(3)+" "+mid_G.get(4)+
                "\n\t\t\t\t\t\t\t\t\t"+mid_C.get(6)+" "+mid_C.get(7)+" "+mid_C.get(8)+
                "\n\t\t\t\t\t\t\t\t\t"+mid_C.get(9)+" "+mid_C.get(10)+
                "\n\n\n"
        );
        
        iter_counter += 1;/*
        tl.addRow("1", firma_A_1, firma_B_1,firma_C_1,firma_D_1,firma_E_1,firma_F_1,firma_G_1,firma_H_1,firma_J_1);
        iter_counter += 1;
        tl.addRow("2", firma_A_2, firma_B_2,firma_C_2,firma_D_2,firma_E_2,firma_F_2,firma_G_2,firma_H_2,firma_J_2);
        iter_counter += 1;
        tl.addRow("3", firma_A_3, firma_B_3,firma_C_3,firma_D_3,firma_E_3,firma_F_3,firma_G_3,firma_H_3,firma_J_3);
        if(iter_counter == 18)
            tl.print();*/
        System.out.println("\n");
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
