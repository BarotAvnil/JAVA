public class Lab4_6 {
    public static void main(String[] args) {
        if (args.length == 0) {
                    System.out.println("No command-line arguments provided.");
                    return;
                }
        
                for (String arg : args) {
              
                    if (arg.isEmpty()) {
                        System.out.println("Error: Empty argument found.");
                        return;
                    }
        
                    char firstChar = arg.charAt(0);
                    if (!Character.isUpperCase(firstChar)) {
                        System.out.println("Error: Argument \"" + arg + "\" does not start with an uppercase letter.");
                        return;
                    }
                }
    
                System.out.println("All arguments start with an uppercase letter:");
                for (String arg : args) {
                    System.out.println(arg);
                }
    }
}
