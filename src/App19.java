public class App19 {
    public static void main(String []args){
        boolean isMale = true;
        boolean isTall = false;

        if (isMale && isTall){
            System.out.println("You are a tall male");
        }        else if(isMale && !isTall) {
            System.out.println("You are a short male");
        }        else if (!isMale && isTall) {
            System.out.println("You are not male, but are tall");
        }        else {
            System.out.println("You are not male and not tall");
        }
    }
}
