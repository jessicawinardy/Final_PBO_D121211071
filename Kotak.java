abstract class Kotak {

    public abstract double keliling();

    public abstract double luas();
}

class Persegi extends Kotak {

    private double panjang;

    public Persegi(double panjang) {
        setPanjang(panjang);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double luas() {
        double luas = panjang * panjang;
        return luas;
    }

    public double keliling() {
        double keliling = panjang * 4;
        return keliling;
    }

}

class PersegiPanjang extends Kotak {

    private double lebar;
    private double panjang;

    public PersegiPanjang(double panjang, double lebar) {
        setPanjang(panjang);
        setLebar(lebar);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas() {
        double luas = panjang * lebar;
        return luas;
    }

    public double keliling() {
        double keliling = panjang * 2 + lebar * 2;
        return keliling;
    }
}
