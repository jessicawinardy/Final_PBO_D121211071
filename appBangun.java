import java.io.File;
import java.util.Scanner;
import java.util.function.Consumer;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class appBangun {
    static int choice = 0;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            File history = new File("history.txt");
            history.createNewFile();
            System.out.println("File untuk penyimpanan data: " + history.getName());
        } catch (IOException e) {
            System.out.println("Telah terjadi error.");
            e.printStackTrace();
        }

        System.out.println("Waktu Saat ini: " + waktuIni());
        try {
            FileWriter writer = new FileWriter("history.txt", true);
            writer.write(
                    "===================================================================================================\n");
            writer.write(
                    "                                     CATATAN HASIL LUAS KELILING                                   \n");
            writer.write("Waktu akses: " + waktuIni() + "\n");
            writer.write(
                    "===================================================================================================\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Telah terjadi error.");
            e.printStackTrace();
        }
        do {
            System.out.println("\nSelamat datang di aplikasi bangun datar");
            System.out.println("=======================================");
            System.out.println("1. Luas dan keliling Persegi");
            System.out.println("2. Luas dan keliling Persegi Panjang ");
            System.out.println("3. Luas dan keliling Segitiga");
            System.out.println("4. Luas dan keliling Lingkaran");
            System.out.println("5. Menampilkan file history");
            System.out.println("6. Bonus: Mencari jari-jari lingkaran dari diameter");
            System.out.println("7. Bonus: Mencari luas beberapa persegi sekaligus");
            System.out.println("8. Keluar");
            System.out.println("Silahkan pilih(1-8): ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Berapa panjang sisinya?");
                    double panjang = scan.nextDouble();
                    Persegi persegi = new Persegi(panjang);
                    System.out.println(
                            "Keliling persegi dengan sisi " + persegi.getPanjang() + " cm: "
                                    + persegi.keliling()
                                    + " cm");
                    System.out.println(
                            "Luas persegi dengan sisi " + persegi.getPanjang() + " cm: " + persegi.luas()
                                    + " cm^2");
                    try {
                        FileWriter writer = new FileWriter("history.txt", true);
                        writer.write("Keliling persegi dengan sisi " + persegi.getPanjang() + " cm: "
                                + persegi.keliling() + " cm\n");
                        writer.write("Luas persegi dengan sisi " + persegi.getPanjang() + " cm: "
                                + persegi.luas() + " cm^2\n\n");
                        writer.write("Waktu pencatatan: " + waktuIni() + "\n");
                        writer.write(
                                "---------------------------------------------------------------------------------------------------\n");
                        writer.close();
                        System.out.println("File penyimpanan telah diperbarui.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    continueChoice();
                    break;

                case 2:
                    System.out.println("Berapa panjangnya?");
                    panjang = scan.nextDouble();
                    System.out.println("Berapa lebarnya?");
                    double lebar = scan.nextDouble();
                    PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println(
                            "Keliling persegi panjang dengan panjang " + persegipanjang.getPanjang() + " cm dan lebar "
                                    + persegipanjang.getLebar() + " cm: "
                                    + persegipanjang.keliling() + " cm");
                    System.out.println(
                            "Luas persegi panjang dengan panjang " + persegipanjang.getPanjang() + " cm dan lebar "
                                    + persegipanjang.getLebar() + " cm: "
                                    + persegipanjang.luas() + " cm^2");

                    try {
                        FileWriter writer = new FileWriter("history.txt", true);
                        writer.write("Keliling persegi panjang dengan panjang " + persegipanjang.getPanjang()
                                + " cm dan lebar "
                                + persegipanjang.getLebar() + " cm: "
                                + persegipanjang.keliling() + " cm\n");
                        writer.write(
                                "Luas persegi panjang dengan panjang " + persegipanjang.getPanjang() + " cm dan lebar "
                                        + persegipanjang.getLebar() + " cm: "
                                        + persegipanjang.luas() + " cm^2\n\n");
                        writer.write("Waktu pencatatan: " + waktuIni() + "\n");
                        writer.write(
                                "---------------------------------------------------------------------------------------------------\n");
                        writer.close();
                        System.out.println("File penyimpanan telah diperbarui.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    continueChoice();
                    break;

                case 3:
                    int choice3;
                    System.out.println("\nBerikut pilihan segitiga yang kami sediakan:");
                    System.out.println("1. Segitiga sama sisi");
                    System.out.println("2. Segitiga sama kaki");
                    System.out.println("3. Segitiga siku-siku");
                    System.out.println("Segitiga apa yang diinginkan? (1-3)");
                    choice3 = scan.nextInt();

                    if (choice3 == 1) {
                        System.out.println("Berapa panjang sisinya?");
                        double sisi1 = scan.nextDouble();
                        System.out.println("Berapa tingginya?");
                        double tinggi = scan.nextDouble();
                        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(sisi1, tinggi);
                        System.out.println(
                                "Keliling segitiga sama sisi dengan panjang sisi " + segitiga.getSisi1()
                                        + " cm: "
                                        + segitiga.keliling() + " cm");
                        System.out.println(
                                "Luas segitiga sama sisi dengan panjang " + segitiga.getSisi1() + " cm dan tinggi "
                                        + segitiga.getTinggi() + " cm: "
                                        + segitiga.luas() + " cm^2");

                        try {
                            FileWriter writer = new FileWriter("history.txt", true);
                            writer.write("Keliling segitiga sama sisi dengan panjang sisi " + segitiga.getSisi1()
                                    + " cm: "
                                    + segitiga.keliling() + " cm\n");
                            writer.write(
                                    "Luas segitiga sama sisi dengan panjang " + segitiga.getSisi1() + " cm dan tinggi "
                                            + segitiga.getTinggi() + " cm: "
                                            + segitiga.luas() + " cm^2\n\n");
                            writer.write("Waktu pencatatan: " + waktuIni() + "\n");
                            writer.write(
                                    "---------------------------------------------------------------------------------------------------\n");
                            writer.close();
                            System.out.println("File penyimpanan telah diperbarui.");
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                        continueChoice();
                        break;

                    } else if (choice3 == 2) {
                        System.out.println("Berapa panjang kedua kakinya?");
                        double kaki = scan.nextDouble();
                        System.out.println("Berapa panjang alasnya?");
                        double alas = scan.nextDouble();
                        System.out.println("Berapa tingginya?");
                        double tinggi = scan.nextDouble();
                        SegitigaSamaKaki segitiga = new SegitigaSamaKaki(kaki, alas, tinggi);
                        System.out.println(
                                "Keliling segitiga sama kaki dengan panjang kaki " + segitiga.getKaki()
                                        + " cm dan alas " + segitiga.getAlas() + " cm: "
                                        + segitiga.keliling() + " cm");
                        System.out.println(
                                "Luas segitiga sama kaki dengan alas " + segitiga.getAlas() + " cm dan tinggi "
                                        + segitiga.getTinggi() + " cm: "
                                        + segitiga.luas() + " cm^2");

                        try {
                            FileWriter writer = new FileWriter("history.txt", true);
                            writer.write("Keliling segitiga sama kaki dengan panjang kaki " + segitiga.getKaki()
                                    + " cm dan alas " + segitiga.getAlas() + " cm: "
                                    + segitiga.keliling() + " cm\n");
                            writer.write(
                                    "Luas segitiga sama kaki dengan alas " + segitiga.getAlas() + " cm dan tinggi "
                                            + segitiga.getTinggi() + " cm: "
                                            + segitiga.luas() + " cm^2\n\n");
                            writer.write("Waktu pencatatan: " + waktuIni() + "\n");
                            writer.write(
                                    "---------------------------------------------------------------------------------------------------\n");
                            writer.close();
                            System.out.println("File penyimpanan telah diperbarui.");
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                        continueChoice();
                        break;

                    } else if (choice3 == 3) {
                        System.out.println("Berapa panjang sisi tegaknya?");
                        double sisitegak = scan.nextDouble();
                        System.out.println("Berapa panjang sisi miringnya?");
                        double sisimiring = scan.nextDouble();
                        System.out.println("Berapa panjang alasnya?");
                        double alas = scan.nextDouble();
                        SegitigaSikuSiku segitiga = new SegitigaSikuSiku(sisitegak, sisimiring, alas);
                        System.out.println(
                                "Keliling segitiga siku-siku dengan sisi tegak " + segitiga.getTegak()
                                        + " cm, sisi miring " + segitiga.getMiring() + " cm, dan alas "
                                        + segitiga.getAlas() + " cm: "
                                        + segitiga.keliling() + " cm");
                        System.out.println(
                                "Luas segitiga siku siku dengan alas " + segitiga.getAlas() + " cm dan sisi tegak "
                                        + segitiga.getTegak() + " cm: "
                                        + segitiga.luas() + " cm^2");

                        try {
                            FileWriter writer = new FileWriter("history.txt", true);
                            writer.write("Keliling segitiga siku-siku dengan sisi tegak " + segitiga.getTegak()
                                    + " cm, sisi miring " + segitiga.getMiring() + " cm, dan alas "
                                    + segitiga.getAlas() + " cm: "
                                    + segitiga.keliling() + " cm\n");
                            writer.write(
                                    "Luas segitiga siku siku dengan alas " + segitiga.getAlas() + " cm dan sisi tegak "
                                            + segitiga.getTegak() + " cm: "
                                            + segitiga.luas() + " cm^2\n\n");
                            writer.write("Waktu pencatatan: " + waktuIni() + "\n");
                            writer.write(
                                    "---------------------------------------------------------------------------------------------------\n");
                            writer.close();
                            System.out.println("File penyimpanan telah diperbarui.");
                        } catch (IOException e) {
                            System.out.println("An error occurred.");
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Mohon memasukkan angka yang sesuai\n");
                        break;
                    }
                    continueChoice();
                    break;

                case 4:
                    System.out.println("Masukkan jari-jari lingkaran: ");
                    double r = scan.nextDouble();
                    Lingkaran lingkaran = new Lingkaran(r);
                    System.out.println(
                            "Keliling lingkaran dengan jari-jari " + lingkaran.getR()
                                    + " cm: " + lingkaran.keliling() + " cm");
                    System.out.println(
                            "Luas lingkaran dengan jari-jari " + lingkaran.getR() + " cm: "
                                    + lingkaran.luas() + " cm^2");

                    try {
                        FileWriter writer = new FileWriter("history.txt", true);
                        writer.write("Keliling lingkaran dengan jari-jari " + lingkaran.getR()
                                + " cm: " + lingkaran.keliling() + " cm\n");
                        writer.write(
                                "Luas lingkaran dengan jari-jari " + lingkaran.getR() + " cm: "
                                        + lingkaran.luas() + " cm^2\n\n");
                        writer.write("Waktu pencatatan: " + waktuIni() + "\n");
                        writer.write(
                                "---------------------------------------------------------------------------------------------------\n");
                        writer.close();
                        System.out.println("File penyimpanan telah diperbarui.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }

                    continueChoice();
                    break;

                case 5:
                    try {
                        File history = new File("history.txt");
                        Scanner scanRead = new Scanner(history);
                        while (scanRead.hasNextLine()) {
                            String data = scanRead.nextLine();
                            System.out.println(data);
                        }
                        scanRead.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    continueChoice();
                    break;
                case 6:
                    System.out.println("Masukkan diameter lingkaran");
                    float d = scan.nextInt();
                    Consumer<Float> cariJari = (x) -> {
                        System.out.println("Jari-jari lingkaran dengan diameter " + d + " cm: " + x / 2 + " cm");
                    };
                    cariJari.accept(d);

                    continueChoice();
                    break;

                case 7:
                    System.out.println("Berapa persegi?");
                    int n = scan.nextInt();
                    int manyPersegi[] = new int[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Masukkan sisi persegi-" + (i + 1) + ":");
                        int sisi = scan.nextInt();
                        manyPersegi[i] = sisi * sisi;
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("Luas persegi ke-" + (i + 1) + ": " + manyPersegi[i] + "cm^2");
                    }
                    try {
                        FileWriter writer = new FileWriter("history.txt", true);
                        for (int i = 0; i < n; i++) {
                            writer.write("Luas persegi ke-" + (i + 1) + ": " + manyPersegi[i] + "cm^2\n");
                        }
                        writer.write("\nWaktu pencatatan: " + waktuIni() + "\n");
                        writer.write(
                                "---------------------------------------------------------------------------------------------------\n");
                        writer.close();
                        System.out.println("File penyimpanan telah diperbarui.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    continueChoice();
                    break;
                default:
                    System.out.println("Maaf kami tidak mengerti");
                    continueChoice();
            }
        } while (choice != 8);
        deleteFile();
        System.out.println("Terima kasih telah menggunakan aplikasi kami");
    }

    public static void deleteFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("CONFIRMATION: Apakah anda ingin menghapus file history? (y/n)");
        char choice5 = scan.next().charAt(0);
        if (choice5 == 'y') {
            File history = new File("history.txt");
            if (history.delete()) {
                System.out.println(history.getName() + " telah dihapus pada " + waktuIni());
            } else {
                System.out.println("Gagal menghapus file.");
            }
        } else if (choice5 == 'n') {
            System.out.println(
                    "File tidak dihapus");
        }
        scan.close();
    }

    public static String waktuIni() {
        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter formatWaktu = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String waktu2 = waktu.format(formatWaktu);
        return waktu2;
    }

    public static void continueChoice() {
        System.out.println("\nApakah masih ingin melanjukan? (y/n)");
        char choice2 = scan.next().charAt(0);
        if (choice2 == 'y') {
            choice = 0;
        } else if (choice2 == 'n') {
            choice = 8;
        }
    }
}
