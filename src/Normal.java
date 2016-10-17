/**
 * Created by Lena on 16.10.2016.
 */
public class Normal extends Distribution {

    private int m;
    private int s_2 ;

    public Normal(int n, int m, int s_2) {
        super(n);
        this.m = m;
        this.s_2 = s_2;
    }

    private void generate() {
        for (int i = 0; i < n; ++i) {
            double res = 0.0;
            for (int j = 0; j < 12; ++j) {
                res += Math.random();
            }
            res -= 6;
            array[i] = m + res * Math.sqrt(s_2);
        }
    }
    private void checkKolmogorov() {

    }

    public static void main(String[] args) {
       Normal normal = new Normal(1000, -4, 4);
        normal.generate();
        normal.print();
        System.out.println("real M: " + normal.M());
        System.out.println("M: " + normal.m);
        System.out.println("real D: " + normal.D());
        System.out.println("D: " + normal.s_2);
    }
}
