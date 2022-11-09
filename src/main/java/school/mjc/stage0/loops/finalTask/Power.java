package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        double res=1;
        if(power>0){
            for (int i = 0; i < power; i++) {
                res *= numberToPrint;
            }
        } else if (power<0) {
            for (int i = 0; i < power*(-1); i++) {
                res /= numberToPrint;
            }
        }
        else{ res=1;}
        System.out.println(res);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 0    );
    }
}
