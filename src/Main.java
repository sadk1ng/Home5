public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double weight = 75;
        double height = 1.83;

        int bmiIndex = bmiService.calculate(weight, height);
        System.out.println("BMI Index: " + bmiIndex);
    }
}
