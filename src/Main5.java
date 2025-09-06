import java.util.function.Supplier;

public class Main5 {
    public static void main(String args[]){
        Supplier<String> supplier = () -> "himani agnihotri";
        System.out.println(supplier.get());
    }
}
