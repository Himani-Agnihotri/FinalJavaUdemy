import java.util.function.Function;

public class Main6 {
    public static void main(String args[]){
       Function<Integer,String> f = (Integer val) -> {
           return val.toString();
       };
       System.out.println(f.apply(5));
    }
}
