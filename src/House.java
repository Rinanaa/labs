import java.util.ArrayList;

public class House {

    public Thermostat thermostat;
    public ArrayList<Room> rooms;

    public House (Thermostat thermostat, ArrayList<Room> rooms){
        this.rooms = rooms;
        this.thermostat = thermostat;
    }

    public void displayRooms (){
        for (Room r: this.rooms){
            System.out.println((this.rooms.indexOf(r)+1) + ". " + r.name);
            System.out.println("\tNumber of cameras: " + r.cameras.size());
        }
    }

    public void displayTemperature (){
        String temper = "off";
        if (thermostat.status){
            temper = "on";
        }
        System.out.println("Thermostat status: " + temper + "\tTemperature: " + this.thermostat.temperature);
    }
}
