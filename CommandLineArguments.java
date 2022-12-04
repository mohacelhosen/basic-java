public class CommandLineArguments{
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++){
            System.out.println("You Enter: "+args[i]);
        }
        int n = Integer.parseInt(args[0]);
        System.out.print("Square of "+n+" is = "+(n*n)); 
    }
}