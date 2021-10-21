import java.util.Scanner;

class Nomor2{
    protected float berat, tinggi, bmi;

    public void setBerat(float berat) {
        this.berat = berat;
    }
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }
    public void setBmi(float bmi) {
        this.bmi = bmi;
    }
    public float getBerat() {
        return this.berat;
    }
    public float getTinggi() {
        return this.tinggi;
    }
    public float getBmi() {
        return this.bmi;
    }
    public void Input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa berat badan anda?(Kg) : ");
        berat = input.nextFloat();
        System.out.println("Berapa tinggi badan anda?(M) : ");
        tinggi = input.nextFloat();

        bmi = berat / (tinggi * tinggi);

        if (bmi >= 18.5 ){
            if (bmi <= 22.9){
                System.out.println("\nHasil perhitungan = " + this.bmi);
                System.out.println("Berat badan anda normal!");
            }
            else if(bmi > 22.9){
                System.out.println("\nHasil perhitungan = " + this.bmi);
                System.out.println("Berat badan ideal berada di 18,5 - 22,9!");
                System.out.println("Berat badan anda Overweight!");
            }
            else if(bmi < 18.5){
                System.out.println("\nHasil perhitungan = " + this.bmi);
                System.out.println("Berat badan ideal berada di 18,5 - 22,9!");
                System.out.println("Berat badan anda underweight!");
            }
        }
    }

}