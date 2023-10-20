public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is my display!");
    }

    public static void display(String message){
        int length = message.length();

        String border = "+";

        for(int i = 0; i < length; i++){
            border += "-";
        }

        border += "+";

        System.out.println(border);
        System.out.println("|" + message + "|");
        System.out.println(border);
    }
}
