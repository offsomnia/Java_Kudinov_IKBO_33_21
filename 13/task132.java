public class task132 {
    private String TwoName;
    private String FirstName = "";
    private String ThreeName = "";

    public task132(String TwoName)
    {
        this.TwoName = TwoName;
    }

    public task132(String TwoName, String FirstName)
    {
        this(TwoName);
        this.FirstName=FirstName;
    }

    public task132(String TwoName, String FirstName, String ThreeName)
    {
        this(TwoName, FirstName);
        this.ThreeName=ThreeName;
    }

    public String toString()
    {
        String A = TwoName;
        if (!FirstName.equals(""))
        {
            A += " ";
            A += FirstName.substring(0,1);
            A+=".";
            if (!ThreeName.equals(""))
            {
                A+=ThreeName.substring(0,1);
                A+=".";
            }
        }
        return A;
    }

    public static void main(String[] args)
    {
        task132 A = new task132("Кудинов");
        System.out.println(A.toString());
        task132 B = new task132("Кудинов","Георгий");
        System.out.println(B.toString());
        task132 C = new task132("Кудинов", "Георгий", "Александрович");
        System.out.println(C.toString());
    }
}
