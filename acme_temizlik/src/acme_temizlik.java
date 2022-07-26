/**
 *
 * @author aligirisen
 */
public class acme_temizlik {

    
    public static void main(String[] args) throws InterruptedException {

        // firmaları olustur
        // firmaadı, istenen kidemli işçi sayisi, istenen işçi sayisi
        Firma A = new Firma("A", 1, 4);
        Firma B = new Firma("B", 1, 4);
        Firma C = new Firma("C", 2, 12);
        Firma D = new Firma("D", 2, 6);
        Firma E = new Firma("E", 1, 3);
        Firma F = new Firma("F", 1, 2);
        Firma G = new Firma("G", 1, 5);
        Firma H = new Firma("H", 0, 1);
        Firma J = new Firma("J", 0, 1);

        
        while(Display.iter_counter < 7){
            Kidemli_Dagitici.kidemli_dagitan(A, B, C, D, E, F, G, H, J);
            Kidemsiz_Dagitici.kidemsiz_dagitan(A, B, C, D, E, F, G, H, J);
            Display.dispall();
        }
        
        
    }
}
