public class Thermostat extends Device{

    protected int temperature;

    public Thermostat(boolean status, int temperature){
        super(status);
        this.temperature = temperature;
    }

    public Thermostat(){
        super(true);
        this.temperature = 25;
    }

    @Override
    public void configure(){

        while (true){
        int a = Input.inputInt("""
                1. Set temperature
                2. Change status
                3. Exit
                Input: """, 1, 3);
            if (a == 1)
                this.temperature = Input.inputInt("Enter temperature (from -40 to 50): ", -40, 50);

            else if (a == 2)
                changeStatus();
            else if (a == 3)
                break;
        }
    }
}
