
public class Client extends User {
    private String hm_eggrafhs;
    private String lh_eggrafhs;
    private int programma_epiloghs; //kwdikos paketou (Sindromi)
   // private Subscription subscr;
    

    public Client() {}
    public Client(String hm_eggrafhs, String lh_eggrafhs, int programma_epiloghs) {
        this.hm_eggrafhs = hm_eggrafhs;
        this.lh_eggrafhs = lh_eggrafhs;
        this.programma_epiloghs = programma_epiloghs; 
    }

    public Client(String name, String surname, String email, int age, int AM, String hm_eggrafhs, String lh_eggrafhs, int programma_epiloghs) {
        super(name, surname, email, age, AM);
        this.hm_eggrafhs = hm_eggrafhs;
        this.lh_eggrafhs = lh_eggrafhs;
        this.programma_epiloghs = programma_epiloghs;
    }

    public String getHm_eggrafhs() {
        return hm_eggrafhs;
    }

    public String getLh_eggrafhs() {
        return lh_eggrafhs;
    }

    public int getProgramma_epiloghs() {
        return programma_epiloghs;
    }
    
   /* public void addSubscr(Subscription sub) {
        this.subscr = sub;
    }*/

    @Override
    public String toString() {
        return "Client{" + "hm_eggrafhs=" + hm_eggrafhs + ", lh_eggrafhs=" + lh_eggrafhs + ", programma_epiloghs=" + programma_epiloghs + '}';
    }
}

