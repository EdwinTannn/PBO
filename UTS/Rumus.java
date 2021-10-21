import java.util.Scanner;

class Rumus{
    protected double pi = 3.14;
    protected double a = 2;
    protected double r = 0;
    protected double keliling;
    protected double luas;

    public void Kel(){
        Scanner kel = new Scanner(System.in);

        System.out.println("Panjang lingkaran dalam r : ");
        r = kel.nextDouble();
        keliling = 2 * pi * r;
        luas = pi * r * r;
        System.out.println("Keliling lingkaran = " + keliling);
        System.out.println("Luas lingkaran = " + luas);
    }
}