
package progettoscuola;

public abstract class Gioco {

private String genere;
private String piattaforma;
private int eta;
private String dataUscita;
private String descrizione;
private boolean disponibile;
private int quantita;

    public Gioco(String genere, String piattaforma, int eta, String dataUscita, String descrizione, int quantita) {
        this.genere = genere;
        this.piattaforma = piattaforma;
        this.eta = eta;
        this.dataUscita = dataUscita;
        this.descrizione = descrizione;
        this.quantita = quantita;
    }
 abstract boolean disponibile(boolean disponibile);
 abstract boolean eta (int eta);

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getPiattaforma() {
        return piattaforma;
    }

    public void setPiattaforma(String piattaforma) {
        this.piattaforma = piattaforma;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getDataUscita() {
        return dataUscita;
    }

    public void setDataUscita(String dataUscita) {
        this.dataUscita = dataUscita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }


}
