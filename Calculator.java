public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) throws Exception {
        if(a > b) {
            return a - b;
        } else if (a < b){
            return b - a;
        }
        
        throw new Exception("Result cannot be 0"); // business imposed
    }

    public int substractNegative(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) throws Exception {
        try{
        	return a / b;
        }catch (Exception e) {
        	throw new Exception("Division went wrong");
        }
    }

    public static void main(String[] args) {
        System.out.println("Running Calculator.java ... ");
    }
}
