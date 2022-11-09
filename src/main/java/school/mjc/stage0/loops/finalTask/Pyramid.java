package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int coef =1;
        int k=0;
        for(int i=1;i<cathetusLength+1;i++){

            for (int s=0;s<cathetusLength-i;++s){
                System.out.print(" ");
            }

            while (k!=2*i-1 ){
                if(i>k) {
                    System.out.print(i - k);
                }
                else{
                    System.out.print(k-i+2);
                }
                    ++k;
                }
        k=0;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }
}
