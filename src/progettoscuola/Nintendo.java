package progettoscuola;
/**
 *
 * @author Emanuel
 */
public class Nintendo {
    private String prezzo;
    private String Titolo;
    private String piattaforma;

    public Nintendo(String prezzo, String Titolo, String piattaforma) {
        this.prezzo = prezzo;
        this.Titolo = Titolo;
        this.piattaforma = piattaforma;
    }

    /**
     * @return the prezzo
     */
    public String getPrezzo() {
        return prezzo;
    }

    /**
     * @param prezzo the prezzo to set
     */
    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    /**
     * @return the Titolo
     */
    public String getTitolo() {
        return Titolo;
    }

    /**
     * @param Titolo the Titolo to set
     */
    public void setTitolo(String Titolo) {
        this.Titolo = Titolo;
    }

    /**
     * @return the piattaforma
     */
    public String getPiattaforma() {
        return piattaforma;
    }

    /**
     * @param piattaforma the piattaforma to set
     */
    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }
   
    }
    

