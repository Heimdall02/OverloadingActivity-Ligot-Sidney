public class App {

    // Method that takes in 2 parameters to add
    private static int sum2(int num1, int num2) {
        return num1 + num2;
    }

    // Method that takes in 3 parameters to add
    private static int sum3(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    // method that returns the greater integer value
    public static int greaterValue(int num1, int num2) {
        int result;
        if(num1 > num2)
        result = num1;
        else
        result = num2;
        
        return result;
    }

    // method that returns the greater double value
    public static double greaterValue(double num1, double num2) {
        double result;
        if(num1 > num2)
        result = num1;
        else
        result = num2;
        
        return result;
    }

    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Overloading");

        // Invoke Methods
        System.out.println("The sum of 20 and 50 is " + App.sum2(20, 50));
        System.out.println("The sum of 18 and 22 and 40 is " + App.sum3(18, 22, 40));

        System.out.println("The greater value between 45 and 100 is " + greaterValue(45,100));
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14,9.8));
        
        // Calling/Invoking Overload Methods
        System.out.println("----------------------------");
        System.out.println("Overloading Methods");
        System.out.println("The sum of 20 and 50 is " + App.computeSum(20, 50));
        System.out.println("The sum of 18 and 22 and 40 is " + App.computeSum(18, 22, 40));
        
    }
}

