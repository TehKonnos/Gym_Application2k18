
public class Sindromi {

    private String typos; // yoga, trx, pilates
    private int kwdikosPaketou; // kwdikos paketou
    private String onomaPaketou;

    public String getTypos() {
        return typos;
    }

    public int getKwdikosPaketou() {
        return kwdikosPaketou;
    }

    public String getOnomaPaketou() {
        return onomaPaketou;
    }

    public void setTypos(String typos) {
        this.typos = typos;
    }

    public void setKwdikosPaketou(int kwdikosPaketou) {
        this.kwdikosPaketou = kwdikosPaketou;
    }

    public void setOnomaPaketou(String onomaPaketou) {
        this.onomaPaketou = onomaPaketou;
    }
    
    public Sindromi(String typos, int kwdikosPaketou, String onomaPaketou) {
        this.typos = typos;
        this.kwdikosPaketou = kwdikosPaketou;
        this.onomaPaketou = onomaPaketou;
    } 
}
