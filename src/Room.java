import java.util.ArrayList;

public class Room {

    public String name;
    public ArrayList<Camera> cameras;
    public Light light;

    public Room (String name, ArrayList<Camera> cameras, Light light){
        this.name = name;
        this.cameras = cameras;
        this.light = light;
    }

    public Room (String name, int cameras, Light light){
        this.name = name;
        this.cameras = new ArrayList<>();
        for (int i = 0; i < cameras; i++){
            this.cameras.add(new Camera());
        }
        this.light = light;
    }

    public void displayCameras (){
        for (Camera cam: this.cameras){

            String camStatus = "off";
            if (cam.status){
                camStatus = "on";
            }

            String camMode = "off";
            if (cam.nightMode){
                camMode = "on";
            }

            System.out.println("Camera " + (this.cameras.indexOf(cam)+1));
            System.out.println("Status: " + camStatus + "\tNight mode: " + camMode);
        }
    }

    public void displayLight (){
        String lightStatus = "off";
        if (light.status){
            lightStatus = "on";
        }
        System.out.println("Light status: " + lightStatus + "\tColor: " + this.light.color);
    }
}
