package percabangan;

public class IfElse {
    public class static void (String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if(uangDiDompet<totalBelanja) {
            System.out.println("Uang kurang, kurangin jajan anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
        System.out.println("Uang cukup, selamat menikmati" +angsul);
        }else{
            System.out.Println("uang pas..  sarangheo..")
        }
    }
}
