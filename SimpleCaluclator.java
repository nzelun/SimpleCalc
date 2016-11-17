import java.util.Scanner;



public class SimpleCaluclator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        
        double answer = 0.0;
        double input = 0.0;
        double result = 0.0;
        String func;
        
        
        System.out.println("----------------------");
        System.out.println("[ "+answer+" ]");
        do
        {
            System.out.println("----------------------");
            System.out.println("+,-,*,/ value");
            System.out.println("Clear");
            System.out.println("Quit");
            System.out.println("----------------------");
            log("Select: ");
            func = scan.next();
            
            
            if (func.contains("+"))
            {	
            	input = scan.nextDouble();
                answer = add(answer,input);
            }
            if (func.contains("-"))
            {
            	input = scan.nextDouble();
                answer = subtract(answer,input);
            }
            if (func.contains("*"))
            {
            	input = scan.nextDouble();
                answer = product(answer,input);
            }
            if (func.contains("/"))
            {
            	input = scan.nextDouble();
                answer = div(answer,input);
            }
            if (func.contains("sin"))
            {
            	input = scan.nextDouble();
                answer = sin(input);
            }
            if (func.contains("clear"))
            {
                answer = 0.0;
            }
            if (func.equals("q"))
            {
            	System.out.println();
                log("Thanks for using \"SimpleCalc\", goodbye.");
                System.out.println();
            }
        	
            if (!"q".equals(func))
            {
                System.out.println();
                System.out.println("----------------------");
                System.out.println("[ "+answer+" ]");
                result = answer;
            }
        }
        while(!"q".equals(func));
    }
    
    //methods for add,sub,div and prod
    public static double add (double x, double y)
    {
        double result = x + y;
        return result;
    }
    
    public static double subtract (double x, double y)
    {
        double result = x - y;
        return result;
    }
    
    public static double product (double x, double y)
    {
        double result = x * y;
        return result;
    } 
    
    public static double div (double x, double y)
    {
        double result = x/y;
        return result;
    }
    
    public static void log (String s)
    {
        System.out.print(s);
    }
    
    public static double sin (double x)
    {
    	x *= Math.PI/180;
        double result;
        result = Math.sin(x);
        return result;
    }
    
}
