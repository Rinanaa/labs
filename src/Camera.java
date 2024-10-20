public class Camera extends Device{

    protected boolean nightMode;

    public Camera(boolean status, boolean nightMode){
        super(status);
        this.nightMode = nightMode;
    }

    public Camera(){
        super(true);
        this.nightMode = false;
    }

    @Override
    public void configure(){

        while (true){
        int a = Input.inputInt("""
                1. Turn on night mode
                2. Turn off night mode
                3. Change status
                4. Exit
                Input: """, 1, 4);
            if (a == 1)
                this.nightMode = true;
            else if (a == 2)
                this.nightMode = false;
            else if (a == 3)
                changeStatus();
            else if (a == 4)
                break;
        }
    }
}
