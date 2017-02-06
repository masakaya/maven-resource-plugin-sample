import java.util.ResourceBundle;

/**
 * Created by sylph on 2017/02/06.
 */
public class Main {
    public static void main( String[] args ) {
        System.out.println("Hello World");
        ResourceBundle bundle = ResourceBundle.getBundle("test");
        System.out.println( bundle.getString("base"));
    }
}
