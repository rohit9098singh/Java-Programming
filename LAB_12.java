public class LAB_12 {
    public static void main(String[] args) {
        String city = null;
        try {
            if (city.equals("BANGLORE")) {
                System.out.println("equals");

            } else {
                System.out.println("not equals");
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("finally block will execute at any cost no matter exception occur or not");
        }
    }

}
