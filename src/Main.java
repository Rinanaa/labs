import java.util.ArrayList;

public class Main {

    public static void main (String[] args) {

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room("Bedroom", 2, new Light()));
        rooms.add(new Room("Bathroom", 1, new Light(true, 1)));
        rooms.add(new Room("Kitchen", 3, new Light()));

        House house = new House(new Thermostat(), rooms);

        while (true) {

            int a = Input.inputInt("""
                    1. Show rooms
                    2. Show thermostat
                    3. Exit
                    Input: """, 1, 3);

            if (a == 1) {

                house.displayRooms();

                int roomNum = Input.inputInt("""
                        Enter room number or return (0): """, 0, house.rooms.size());



                    if (roomNum == 0) {
                        break;
                    }

                    else {
                        roomNum--;
                        while (true) {
                            int b = Input.inputInt("""
                                    1. Display cameras
                                    2. Display light
                                    3. Return
                                    Input: """, 1, 3);

                            if (b == 1) {
                                house.rooms.get(roomNum).displayCameras();

                                int camNum = Input.inputInt("""
                                        1. Enter camera number to change settings (0 to return): """, 0, house.rooms.get(roomNum).cameras.size());

                                while (true) {

                                    if (camNum == 0) {
                                        break;
                                    }

                                    else {
                                        camNum--;
                                        house.rooms.get(roomNum).cameras.get(camNum).configure();
                                        break;
                                    }
                                }
                            }

                            else if (b == 2) {
                                house.rooms.get(roomNum).displayLight();

                                house.rooms.get(roomNum).light.configure();
                            }
                            else if (b == 3) {
                                break;
                            }
                        }
                    }

            }

            else if (a == 2) {
                house.displayTemperature();
                house.thermostat.configure();
            }

            else if (a == 3) {
                break;
            }
        }
    }
}
