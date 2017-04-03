package pl.akademiakodu;

public class Main {

    public static void main(String[] args) {

//        int[] tab = null;
//        try {
//            tab = new int[5];
//            tab[6] = 32;
//            tab[0] = 352;
//        } catch (ArrayIndexOutOfBoundsException e) {
////            e.printStackTrace();
//        }
//        System.out.println("NIE! " + tab[0]);

//        ---------------------------------------------

        int[] tab = {5,33,13};
        try {
            tab[5]  = 5;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("<!>  Error w tablicy  <!>");
        }

        System.out.println("NIE!  " + tab[0]);

    }
}
