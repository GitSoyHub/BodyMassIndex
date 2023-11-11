public class bmiService {
    public int calculate(double height, int weight) {
        return (int) (weight / (height * height));
    }
}