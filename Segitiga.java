public interface Segitiga {
    luas();

    keliling();
}

class SegitigaSamaSisi implements Segitiga {

    private double sisi1;
    private double tinggi;

    public SegitigaSamaSisi(double sisi1, double tinggi) {
        setSisi1(sisi1);
        setTinggi(tinggi);
    }

    public double getSisi1() {
        return sisi1;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double luas() {
        double luas = sisi1 * tinggi / 2;
        return luas;
    }

    public double keliling() {
        double keliling = sisi1 * 3;
        return keliling;
    }
}

class SegitigaSamaKaki implements Segitiga {

    private double kaki;
    private double alas;
    private double tinggi;

    public SegitigaSamaKaki(double kaki, double alas, double tinggi) {
        setKaki(kaki);
        setAlas(alas);
        setTinggi(tinggi);
    }

    public double getKaki() {
        return kaki;
    }

    public void setKaki(double kaki) {
        this.kaki = kaki;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double luas() {
        double luas = alas * tinggi / 2;
        return luas;
    }

    public double keliling() {
        double keliling = kaki * 2 + alas;
        return keliling;
    }
}

class SegitigaSikuSiku implements Segitiga {
    private double alas;
    private double sisitegak, sisimiring;

    public SegitigaSikuSiku(double sisitegak, double sisimiring, double alas) {
        setTegak(sisitegak);
        setMiring(sisimiring);
        setAlas(alas);
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getMiring() {
        return sisimiring;
    }

    public void setMiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }

    public double getTegak() {
        return sisitegak;
    }

    public void setTegak(double sisitegak) {
        this.sisitegak = sisitegak;
    }

    public double luas() {
        double luas = alas * sisitegak / 2;
        return luas;
    }

    public double keliling() {
        double keliling = sisitegak + sisimiring + alas;
        return keliling;
    }
}
