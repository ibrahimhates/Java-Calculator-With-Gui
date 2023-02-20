
package src;

public class MainClass {

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        new Listener(cal).start();
        cal.setDefaultCloseOperation(Calculator.EXIT_ON_CLOSE);
    }
    
}
