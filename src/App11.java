public class App11 {
    public static void main(String []args){

        String myName = "Mike";
        sayHi(myName, 78);
        sayHi("Dave", 22);
        sayHi("Phyllys", 44);
        sayHi("Angela",25);
    }
    public static void sayHi(String name, int age){

        System.out.println("Hello " +name+ ",\n you are " +age);
    }
}
