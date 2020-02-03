public class App2 {
    public static void main(String [] args){

        String phrase = "Giraffe Academy";

        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.length());
        System.out.println(phrase.contains("dog"));
        System.out.println(phrase.charAt(1));
        System.out.println(phrase.indexOf("affe"));
        System.out.println(phrase.lastIndexOf("a"));
        System.out.println(phrase.substring(4,11));
        System.out.println(phrase.substring(0, phrase.indexOf(" ")));


        System.out.println("Giraffe \"Academy\"" +
                "ddfgdfg" +
                "sdfdsf");
    }
}
