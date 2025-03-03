
import java.util.ArrayList;
import java.util.List;

public class swap {

    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> result = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        result.add(a);
        result.add(b);
        return result;
    }
}
