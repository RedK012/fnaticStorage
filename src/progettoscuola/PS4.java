package progettoscuola;
/**
 *
 * @author Emanuel
 */
public class PS4 {
    private String prezzo;
    private String Titolo;
    private String piattaforma;

    public PS4(String prezzo, String Titolo, String piattaforma) {
        this.prezzo = prezzo;
        this.Titolo = Titolo;
        this.piattaforma = piattaforma;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String Titolo) {
        this.Titolo = Titolo;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }
    
}
