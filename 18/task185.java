

public class task185 {

    static class ThrowsDemo {
        public void printMessage(String key) {
            String message = getDetails(key);
            System.out.println( message );
        }
        public String getDetails(String key) {
            if(key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        }
    }


    public static void main(String[] args)
    {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage("0");
    }
}
