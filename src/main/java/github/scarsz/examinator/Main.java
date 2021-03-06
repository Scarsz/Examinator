package github.scarsz.examinator;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No bot token provided");
            System.exit(1);
        }

        try {
            new Examinator(args[0]);
        } catch (Exception e) {
            System.err.println("Failed to start: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
