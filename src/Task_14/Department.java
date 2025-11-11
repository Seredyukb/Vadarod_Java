package Task_14;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Department {

    private String name;
    private Set<Room> rooms;

    public Department(String name) {
        this.name = name;
        this.rooms = new HashSet<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int countGender(Gender gender) {
        int count = 0;
        for (Room room : rooms) {
            List<Patient> patients = room.getPatients();
            for (Patient patient : patients) {
                if (patient.getGender() == gender) {
                    count++;
                }
            }
        }
        return count;
    }

}
