/**
 * Created by Lena on 17.10.2016.
 */
public class Distribution {

    int n;
    double[] array;

    public Distribution(int n) {
        this.n = n;
        this.array = new double[n];
    }

    public void print() {
        for (int i = 0; i < n; ++i) {
            System.out.println(array[i]);
        }
    }

    public double M() {
        double sum = 0.0;
        for(int i = 0; i < n; ++i) {
            sum += array[i];
        }
        return sum / n;
    }

    public double D()
    {
        double m = M();
        double sum = 0.0;
        for(int i = 0; i < n; i++)
            sum += Math.pow(array[i] - m,2);
        return sum / n;
    }
}
