
public class Magazine implements Printable {
    String name;

    Magazine(String name) {
        this.name = name;
    }

    @Override
    public String print() {
        return name;
    }
}
