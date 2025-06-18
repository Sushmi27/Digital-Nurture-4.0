package SingletonPattern;

public class Main {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first message");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second message");

        System.out.println("Are both logger objects same? " + (logger1 == logger2));
    }
}
