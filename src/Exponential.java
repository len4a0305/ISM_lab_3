/**
 * Created by Lena on 17.10.2016.
 */
public class Exponential extends Distribution {

     private double a;
    public Exponential(int n, double a) {
        super(n);
        this.a = a;
    }

    public void generate() {
        for (int i = 0; i < n; ++i) {
            array[i] = -Math.log(1 - Math.random()) / a;
        }
    }

    public static void main(String[] args) {
        Exponential exponential = new Exponential(1000, 0.5);
        exponential.generate();
        exponential.print();
        System.out.println("real M: " + exponential.M());
        System.out.println("M: " + 1 / exponential.a);
        System.out.println("real D: " + exponential.D());
        System.out.println("D: " + 1 / (exponential.a * exponential.a));
    }
}
