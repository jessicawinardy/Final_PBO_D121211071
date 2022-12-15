public class SetengahLingkaran {
    private double PI = 3.14;
    private double r;

    public double luas() {
        double luas = 1 / 2 * PI * r * r;
        return luas;
    }

    public double keliling() {
        double keliling = 1 / 2 * PI * r * 2;
        return keliling;
    }
}

class Lingkaran extends SetengahLingkaran {
    private double PI = 3.14;
    private double r;

    public Lingkaran(double r) {
        setR(r);
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double luas() {
        double luas = PI * r * r;
        return luas;
    }

    public double keliling() {
        double keliling = PI * r * 2;
        return keliling;
    }
}
