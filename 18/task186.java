public class task186 {

    static class ThrowsDemo {
        public void printMessage(String key) {
            String message = getDetails(key);
            System.out.println( message );
        }
        public String getDetails(String key) {
            try {
                return "data for " + key;
            }
            catch (NullPointerException e)
            {
                return "null key in getDetails";
            }
        }
    
    
    }
    public static void main(String[] args)
    {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage("0");
    }
}
