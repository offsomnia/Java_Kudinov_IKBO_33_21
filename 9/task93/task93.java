

public class task93 {
    public static void main(String[] args)
    {
        Test A = new Test(5, 7);
        System.out.println(A.toStringOneOld());
        System.out.println(A.toStringTwoOld());
        A.NewMass();
        System.out.println(A.toStringOneNew());
    }
}
