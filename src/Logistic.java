/**
 * Created by Lena on 17.10.2016.
 */
public class Logistic extends Distribution {

    private double a;
    private double b;

    public Logistic(int n, double a, double b) {
        super(n);
        this.a = a;
        this.b = b;
    }

    public void generate() {
        for (int i = 0; i < n; ++i) {
            double y = Math.random();
            array[i] = a + b * Math.log(y / (1 - y));
        }
    }

    public static void main(String[] args) {
        Logistic logistic = new Logistic(1000, 0, 1.5);
        logistic.generate();
        logistic.print();
        System.out.println("real M: " + logistic.M());
        System.out.println("M: " + logistic.a);
        System.out.println("real D: " + logistic.D());
        System.out.println("D: " + (logistic.b * logistic.b) * Math.PI * Math.PI / 3);
    }
}
