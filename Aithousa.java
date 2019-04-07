/**
 *
 * @author user
 */
public class Aithousa {
    private int arithmos;
    private int capacity;

    public int getArithmos() {
        return arithmos;
    }

    public void setArithmos(int arithmos) {
        this.arithmos = arithmos;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Aithousa(int arithmos, int capacity) {
        this.arithmos = arithmos;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Aithousa{" + "arithmos aithousas =" + arithmos + ", xoritikotita=" + capacity + '}';
    }
    
}
