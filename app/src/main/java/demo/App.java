/*
 * This source file was generated by the Gradle 'init' task
 */
package demo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public String getGreeting1(){
        return "welcome to gradle";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        System.out.println( new App().getGreeting1());

        DemoString eg1 = new DemoString();
        eg1.demoString();
    }
}
