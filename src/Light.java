import java.util.HashMap;

public class Light extends Device {

    private final HashMap<Integer, String> colors = new HashMap<Integer, String>() {{ put(1, "white"); put(2, "red"); put(3, "purple"); put(4, "yellow"); }};

    protected String color;

    public Light (boolean status, int color){
        super(status);
        this.color = colors.get(color);
    }

    public Light (){
        super(false);
        this.color = colors.get(3);
    }

    @Override
    public void configure(){

        String string_colors = "";
        for (Integer x : colors.keySet()) {
            string_colors += x.toString() + ". " + colors.get(x) + "\n";
        }

        while (true){
            int n = Input.inputInt("""
                    Change color:
                    -1. Change status
                    0. Exit\n""" + string_colors + "Input: ", -1, colors.size());


            if (n == -1)
                changeStatus();
            else if (n == 0)
                break;
            else
                this.color = colors.get(n);
        }
    }
}


