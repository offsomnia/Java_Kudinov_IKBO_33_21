public class Coverings {

    public static void main(String args[]) {

        // 1
        Double intTest = Double.valueOf(5);
        Double floatTest = Double.valueOf(190.567);
        Double charTest = Double.valueOf('8');
        Double stringTest = Double.valueOf("6712812.691");

        System.out.println(intTest);
        System.out.println(floatTest);
        System.out.println(charTest);
        System.out.println(stringTest);
        System.out.println();

        // 2
        String s2 = "10.1";
        Double d = Double.parseDouble(s2);
        System.out.println(d);
        System.out.println();

        // 3/4

        Double obj = new Double("39.45");

        int intVal = obj.intValue();
        System.out.println(intVal);
        
        byte byteVal = obj.byteValue();
        System.out.println(byteVal);

        short shortVal = obj.shortValue();
        System.out.println(shortVal);

        long longVal = obj.longValue();
        System.out.println(longVal);

        float floatVal = obj.floatValue();
        System.out.println(floatVal);
        
    }
}
