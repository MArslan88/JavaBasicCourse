public class Foor_Loop {
    public static void main(String[] args) {
//        for(int i=0; i<5; i++){
//            System.out.println("Kamal");
//        }
//
//        int tableNo = 13;
//        int ans;
//
//        for(int i=1; i<=10; i++){
//            // 2 x 1 = 2
//            // 2 x 2 = 4
//
//            ans = tableNo * i;
//            System.out.println(tableNo + " x " + i + " = " + ans);
//        }

        for(int a=1; a<=5; a++){
            for(int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
