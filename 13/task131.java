public class task131 {
    private String string;

    public task131(String string)
    {
        this.string=string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public int BackIndex()
    {
        return string.length() - 1;
    }

    public static void main(String[] args)
    {
        task131 A = new task131("I like Java!!!");
        System.out.println(A.getString());
        A.setString("Wassup?");
        System.out.println(A.getString());

        System.out.println(A.getString().charAt(A.BackIndex()));

        System.out.println(A.getString().endsWith("!!!"));

        System.out.println(A.getString().startsWith("Java"));

        A.setString("I like Java!!!");
        System.out.println(A.getString().contains("Java"));

        System.out.println(A.getString().indexOf("Java"));

        A.setString(A.getString().replace("a", "ooo"));
        System.out.println(A.getString());

        A.setString(A.getString().toUpperCase());
        System.out.println(A.getString());

        A.setString(A.getString().toLowerCase());
        System.out.println(A.getString());

        A.setString("I like Java!!!");
        task131 B = new task131(A.getString().substring(A.getString().indexOf("Java"), A.getString().indexOf("Java") + 4));
        System.out.println(B.getString());
    }
}

