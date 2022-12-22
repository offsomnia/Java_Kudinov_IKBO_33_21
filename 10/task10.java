
public class task10 {
    public static void main(String[] args)
    {
        SortingStudentsByGPA A = new SortingStudentsByGPA();
        A.setArray(3);

        System.out.println();
        System.out.println("Students:");
        System.out.println();
        A.outArray();
        System.out.println();
        
        A.quicksortScore();
        System.out.println("Quick sorted by score:");
        System.out.println();
        A.outArray();
        System.out.println();
        
        A.quicksortCourse();
        System.out.println("Quick sorted by course:");
        System.out.println();
        A.outArray();
        System.out.println();
        

        A.quicksortGroup();
        System.out.println("Quick sorted by group:");
        System.out.println();
        A.outArray();
        System.out.println();
        

        SortingStudentsByGPA B = new SortingStudentsByGPA();
        B.setArray(2);
        B.outArray();
        SortingStudentsByGPA C = new SortingStudentsByGPA();
        C.MassPlusPlus(A,B);
        C.outArray();
    }
}
