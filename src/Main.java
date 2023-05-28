import mobile.Model;
import printable.Book;
import printable.Magazine;
import printable.Printable;

public class Main {
    public static void main(String[] args) {
        Model phone1 = new Model();
        phone1.setName("Nokia");
        phone1.unlock();
        phone1.sendSMS("I can send SMS");
        phone1.camera("50 Mega Pixel Camera");
        phone1.touchDisplay("5.5 inch Display");

        Model phone2 = new Model();
        phone2.setName("\nSamsung");
        phone2.unlock();
        phone2.camera("52 Mega Pixel Camera");
        phone2.touchDisplay("5 inch Display");
        phone2.sendSMS("I can send SMS and MMS\n");

        Book b1 = new Book("Children's book");
        Book b2 = new Book("The little astronaut");
        Magazine m1 = new Magazine("Travel journal");
        Magazine m2 = new Magazine("Children's journal");
        Book b3 = new Book("When I grow up");
        Book b4 = new Book("Charlie can do it");



        Printable[] printables = {b1, b2, b3, b4, m1, m2};
        for (Printable printable : printables) {
            printable.print();
        }
    }
}