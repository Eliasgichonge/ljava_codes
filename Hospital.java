import java.util.ArrayList;

public class Hospital {

    ArrayList<Patient> pList; //stores list of patients
    public Hospital(){
        pList = new ArrayList<>(); // initilaization arrayList
    }

    public void addPatient(Patient p){
        pList.add(p);
    }

    public boolean deletePatient(Patient p){
        if (pList.contains(p)) {
            pList.remove(p);
            return true;
        }
        return false;
    }

    public void dispalyAllPatients(Patient p){
        for (Patient patient : pList) {
            patient.display();
        }
    }
    
    public void displayYoungPatients(Patient p){
        for (Patient patient : pList) {
            if (patient.getAge() < 12) {
                patient.display();
            }
        }
    }
}
