public class Loops {
    public static void main(String[] args){
//        int i = 1;
        /* While Loops*/
//        while (i <= 10){
//            System.out.println("Printing... " + i);
//            int j = 1;
//            while (j<=3){
//                System.out.println("Hello " + j);
//                j++;
//            }
//            i++;
//        }
//        System.out.println("Bye" + i);

//        do {
//            System.out.println("Printing... " + 1);
//            i++;
//        }while (i <=10);

        for (int i=1; i <=5; i++) {
            System.out.println("DAY" + i);

            for (int j = 1; j <=9 ; j++) {
                System.out.println(" " + (j + 8) + " - " + (j + 9));
            }
        }

    }
}
