package Task_14;

import java.util.ArrayList;
import java.util.List;

public class Room {
    // У палаты поля: номер, тип палаты (энам мужская или женская), список пациентов

    private int number;
    private RoomType type;
    private List<Patient> patients;

    public Room(int number, RoomType type) {
        this.number = number;
        this.type = type;
        this.patients = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public boolean addPatient(Patient patient) {
        if (patients.size() >= 3) {
            return false;
        }
        if (type==RoomType.MALE && patient.getGender() !=Gender.MALE){
            return false;
        }
if (type==RoomType.FEMALE && patient.getGender() != Gender.FEMALE){
    return false;
}
if (!patients.isEmpty()){
    String existingDiagnosis = patients.get(0).getDiagnosis();
    if (!existingDiagnosis.equals((patient.getDiagnosis()))){
        return false;
    }
}
if (!patients.contains(patient)){
    patients.add(patient);
    return true;
}
return false;
    }
    public int countByGender(Gender gender){
        int count=0;
        for (Patient p: patients){
            if (p.getGender()==gender){
                count++;
            }
        }
        return count;
    }
    public void  printPatients(){
        System.out.println( "Пациенты палаты " +number + " :");
        for (Patient p: patients){
            System.out.println(p);
        }
    }


}

