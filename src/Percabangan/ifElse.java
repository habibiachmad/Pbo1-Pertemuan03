package Percabangan;

public class ifElse {
    public static void main(String[] args) {
        double  totalbelaja = 53000;
        double uangDidompet = 25000;

        if(uangDidompet<totalbelaja) {
            System.out.println("Uang Kurang, kurangi jajan anda");
        }else if (uangDidompet>totalbelaja){
            double  angsul = uangDidompet-totalbelaja;
            System.out.println("uang cukup, angsul  :" +angsul);
        }
        else{
            System.out.println("Uang anda pas selamat");
        }
    }
}
