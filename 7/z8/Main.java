
public class Main {
    public static void main(String[] args) {
        Printable[] test = new Printable[3];
        test[0] = new Book("Записки Пушкина");
        test[1] = new Magazine("TED Talks");
        test[2] = new Book("Космос между нами");
        Book A = new Book();
        A.getIng(test);
    }
}
