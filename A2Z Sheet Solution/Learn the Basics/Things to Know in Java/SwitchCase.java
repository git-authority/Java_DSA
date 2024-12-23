import java.util.List;
class SwitchCase{
    static double switchCase(int choice, List<Double> arr){
        // code here
        switch(choice){
            case 1:
                return (Math.PI*Math.pow(arr.get(0), 2));
            case 2:
                return (arr.get(0)*arr.get(1));
            default:
                return -1.0;
        }
    }
}