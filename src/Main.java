import Package.Addtion;
import Package.Multiply;

public class Main {
    public static void main(String[] args) {

   Addtion Add = new Addtion();
   Multiply multiply = new Multiply();

   Add.method1();
   int Sum = Add.method2(223,16);
        System.out.println("The Sum is: " + Sum);


        multiply.method1();
        double product = multiply.method2(134, 18);
        System.out.println("The Product is: " + product);



    }
}
