
public class Program {
    private String titlos;
    private int aithousa;
    private String day;
    private int capacity;
    private int time;
    private int programCode;
    private String nameGymnasti;
    private String lastUpdate;

    public Program() {}
    
    public Program(String titlos, int aithousa, String day, int capacity, int time, int programCode, String nameGymnasti, String lastUpdate) {
        this.aithousa = aithousa;
        this.day = day;
        this.capacity = capacity;
        this.time = time;
        this.programCode = programCode;
        this.nameGymnasti = nameGymnasti;
        this.lastUpdate=lastUpdate;
    }

    public Program(String titlos, int aithousa, String day, int capacity, int time)
    {
        this.titlos = titlos;
        this.aithousa = aithousa;
        this.day = day;
        this.capacity = capacity;
        this.time = time;
    }
    
    @Override
    public String toString() {
        return "Gym_Programs{" + "Teleftaia enimerosi: " + lastUpdate + '}';
    }

    public Program(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public int getAithousa() {
        return aithousa;
    }

    public String getNameGymnasti() {
        return nameGymnasti;
    }

    public void setTitlos(String titlos) {
        this.titlos = titlos;
    }

    public void setAithousa(int aithousa) {
        this.aithousa = aithousa;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setProgramCode(int programCode) {
        this.programCode = programCode;
    }

    public void setNameGymnasti(String nameGymnasti) {
        this.nameGymnasti = nameGymnasti;
    }

    public String getTitlos() {
        return titlos;
    }

    public String getDay() {
        return day;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getProgramCode() {
        return programCode;
    }

    public int getTime() {
        return time;
    }
    
    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}
