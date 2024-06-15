public class OddEven {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the radius of the circle as a command-line argument.");
            return;
        }
        else{
            try {
                double radius = Double.parseDouble(args[0]);
                System.out.print(""+Math.PI*radius*radius);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }
}
