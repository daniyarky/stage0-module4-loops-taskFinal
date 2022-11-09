package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        for(int i=0; i<11; i++){
            System.out.println( numberTableToPrint+"*"+i+"="+numberTableToPrint*i);
        }

    }
    public static void main(String[] args) {
        new MultiplicationTable().printTable(5);
    }
}
