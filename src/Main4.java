import java.util.function.Consumer;

public class Main4 {
    public static void main(String args[]) {
        Consumer<String> consumer = (String val) -> System.out.println("My name is: "+val);
        consumer.accept("himani agnihotri");
    }
}
