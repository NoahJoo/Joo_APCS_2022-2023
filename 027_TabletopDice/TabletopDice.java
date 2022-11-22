public class TabletopDice {
    public static void main(String[] args) {

        
        int d4 = (int) (Math.random()*4*1);
        System.out.println("the number for 4 sided is " + d4);
        int d6 = (int) (Math.random()*6*1);
        System.out.println("the number for 6 sided is " + d6);
        int d8 = (int) (Math.random()*8*1);
        System.out.println("the number for 8 sided is  " + d8);
        int d10 = (int) (Math.random()10*1);
        System.out.println("the number for 10 sided is " + d10);
        int d12 = (int) (Math.random()12*1);
        System.out.println("the number for 12 sided is " + d12);
        int d20 = (int) (Math.random()*20*1);
        int Percentile = 10 * (int) (Math.random()*10*1);
        System.out.println("the number for Percentile is " + Percentile);

    }
}