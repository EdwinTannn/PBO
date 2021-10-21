import java.util.Scanner;

class Nomor1{
    protected float jam, menit, detik, total, pulsa, harga;

    public void setJam(float jam) {
        this.jam = jam;
    }
    public void setMenit(float menit) {
        this.menit = menit;
    }
    public void setDetik(float detik) {
        this.detik = detik;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public void setPulsa(float pulsa) {
        this.pulsa = pulsa;
    }
    public void setHarga(float harga) {
        this.harga = harga;
    }
    public float getJam() {
        return this.jam;
    }
    public float getMenit() {
        return this.menit;
    }
    public float getDetik() {
        return this.detik;
    }
    public float getTotal() {
        return this.total;
    }
    public float getPulsa() {
        return this.pulsa;
    }
    public float getHarga() {
        return this.harga;
    }
    public void Input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Berapa jam? : ");
        jam = input.nextFloat();
        System.out.println("Berapa menit? : ");
        menit = input.nextFloat();
        System.out.println("Berapa detik? : ");
        detik = input.nextFloat();

        total = (jam * 60 * 60) + (menit * 60) + (detik * 1);
        pulsa = (total / 5);
        harga = (pulsa * 150);

        System.out.println("\nAnda telah memakai pulsa anda sebesar : " + this.pulsa);
        System.out.println("\nBiaya pulsa anda sebesar : Rp" + this.harga );
    }
    public static void main(String[] args){
        Nomor1 v = new Nomor1();
        v.Input();
    }
}