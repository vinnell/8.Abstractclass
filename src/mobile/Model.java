package mobile;

public class Model extends MobilePhone implements Mobile{
    private String name;
    public Model() {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public boolean sendSMS(String message) {
         System.out.println(message);
        return true;
    }
    @Override
    public String unlock() {
        System.out.println(name + ": for unlock, please, type passcode..." );
        return name;
    }
    @Override
   public void camera(String message) {
        System.out.println(message);
    }
    @Override
   public void touchDisplay(String message) {
        System.out.println(message);
    }
}
