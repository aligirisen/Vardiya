/**
 *
 * @author aligirisen
 */
public class Display {

    // verileri içeren static arraylistleri alarak okunaklı bir biçimde bastırır
    // okunaklı bir formatta bastırır
    public static void dispall() {
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
        
    }
}
