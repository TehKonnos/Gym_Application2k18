
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DilwsiSymmetoxisController {

    private DilwsiSimmetoxisUI uiDilwsiSym;
    private ArrayList <Program> programs = new ArrayList<>(); 
    private ArrayList <Sindromi> syndromes = new ArrayList<>();
    private ArrayList <String> onomata = new ArrayList<>();
    private static ArrayList <Program> result = new ArrayList<>();
            
    public DilwsiSymmetoxisController(){
         
        uiDilwsiSym = new DilwsiSimmetoxisUI(this);
        uiDilwsiSym.setVisible(true); 
         
        programs.add(new Program ("TRX",101,"Monday",15,7));
        programs.add(new Program ("Pilates",202,"Tuesday",9,3));
        programs.add(new Program ("Pilates",202,"Wednesday",10,10));
        programs.add(new Program ("Yoga",303,"Thursday",20,12));
        programs.add(new Program ("TRX",404,"Friday",9,16));
        programs.add(new Program ("Pilates",202,"Saturday",10,23));
        programs.add(new Program ("Yoga",202,"Sunday",16,15));
        programs.add(new Program ("Yoga",102,"Monday",13,3));
        programs.add(new Program ("Pilates",103,"Monday",15,10));
        programs.add(new Program ("Crossfit",101,"Monday",18,15));
        
        syndromes.add(new Sindromi ("Yoga",1,"Tone"));
        syndromes.add(new Sindromi ("Yoga",2,"Strong"));
        syndromes.add(new Sindromi ("Pilates",1,"Tone"));
        syndromes.add(new Sindromi ("Pilates",3,"Power"));
        syndromes.add(new Sindromi ("Pilates",4,"Step"));
        syndromes.add(new Sindromi ("TRX",2,"Strong")); 
        syndromes.add(new Sindromi ("TRX",3,"Power")); 
    }

   
    
    public ArrayList<Program> getPrograms(Client c1){
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        Calendar cal = Calendar.getInstance();
        String today = formatter.format(cal.getTime()); // day: h mera shmera
        
        int kwdikos = c1.getProgramma_epiloghs();
        
        for (int counter = 0; counter < syndromes.size(); counter++) { 		      
            int k = syndromes.get(counter).getKwdikosPaketou(); 		
            if(k==kwdikos){
                String onomaP = syndromes.get(counter).getTypos();
                onomata.add(onomaP); // exoume ta programmata gia ta opoia exei plhrwsei o pelatis
            }
        }    
         
        for (int counter2 = 0; counter2 < onomata.size(); counter2++){
            for (int counter = 0; counter < programs.size(); counter++){
                String m = programs.get(counter).getDay();
                String n = programs.get(counter).getTitlos();

                if(m.equals(today) && n.equals(onomata.get(counter2))){
                    int aithousa=programs.get(counter).getAithousa();
                    int capacity =programs.get(counter).getCapacity();
                    int time= programs.get(counter).getTime();
                    result.add(new Program (n,aithousa,m,capacity,time));
                }
            }
        }
    return result;
    }  
}
   

