package printable;

public class Magazine implements Printable{
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println("Printable magazine " + getName());
    }
    public void    printMagazines(Printable[] printable){
        System.out.println(name);
    }
}
