public class Main {
    public static void main(String[] args) {
        bmiService service = new bmiService();
        double height = 1.87;
        int weight = 98;
        int bmi = service.calculate(height, weight);

        System.out.println(bmi);
    }
}