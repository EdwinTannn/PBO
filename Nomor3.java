import java.util.Scanner;

class Nomor3{

    public void Input(){
    Scanner userInput = new Scanner(System.in);
    System.out.println("Masukkan nilai : ");
    int nilai = userInput.nextInt();

    printNilai(nilai);
    int jumlah = jumlahNilai(nilai);
    System.out.println("Jumlah : " + jumlah);
    } 
    private static int jumlahNilai(int parameter){
        System.out.println("Parameter : " + parameter);

        if (parameter == 0){
            return parameter;
        }
        return parameter + jumlahNilai(parameter - 1);
    }
    private static void printNilai (int parameter){
        System.out.println("nilai = " + parameter);

        if (parameter == 0){
            return;
        }
        parameter--;

        printNilai(parameter);
    }
    public static void main(String[] args){
        Nomor3 v = new Nomor3();
        v.Input();
    }
}


