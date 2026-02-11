public class Input {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No username provided.");
            return;
        }

        String userName = args[0];
        System.out.println("Username is: " + userName);
    }
}
