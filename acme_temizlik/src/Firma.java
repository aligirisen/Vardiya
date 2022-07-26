
import java.util.ArrayList;

/**
 *
 * @author aligirisen
 */
public class Firma {
    String firmaAdi;
    int istedigiKidemli;
    int istedigiKidemsiz;
    ArrayList<String> calisanlar = new ArrayList<>();

    public Firma(String firmaAdi, int istedigiKidemli, int istedigiKidemsiz) {
        this.firmaAdi = firmaAdi;
        this.istedigiKidemli = istedigiKidemli;
        this.istedigiKidemsiz = istedigiKidemsiz;
    }
    
}
