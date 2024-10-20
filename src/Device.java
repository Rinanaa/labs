public abstract class Device {

    protected boolean status;

    public Device(boolean status){
        this.status = status;
    }

    public void changeStatus(){
        this.status = !this.status;
    }

    public void configure(){
        System.out.println("Device");
    }
}
