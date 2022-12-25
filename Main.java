import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] i = new int[9][9];

        int n = 9;

        /*
        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                i[a][b] = 0;
                System.out.print(i[a][b]);
            }
            System.out.println();
        }

         */

        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                System.out.print(a+""+b+" ");
            }
            System.out.println();
        }

        Random random = new Random();

        boolean[][] visit1 = new boolean[3][3];
        boolean[][] visit2 = new boolean[3][3];
        boolean[][] visit3 = new boolean[3][3];
        boolean[][] visit4 = new boolean[3][3];
        boolean[][] visit5 = new boolean[3][3];
        boolean[][] visit6 = new boolean[3][3];
        boolean[][] visit7 = new boolean[3][3];
        boolean[][] visit8 = new boolean[3][3];
        boolean[][] visit9 = new boolean[3][3];


        for(int a=0; a<n; a++) {
            int[] j1 = {1,2,3,4,5,6,7,8,9}; int p1 = 9;
            for (int b = a; b < n; b += 3) {
                for (int c =a; c < n; c += 3) {
                    int nn = random.nextInt(p1);
                    i[b][c] = j1[nn];
                    int sp = j1[nn];
                    j1[nn] = j1[p1 - 1];
                    j1[p1 - 1] = sp;
                    p1--;
                }
            }

            if(a==0){
                break;
            }

            p1 = 9;
            for (int b = 0; b < n; b += 3) {
                for (int c =a; c < n; c += 3) {
                    int nn = random.nextInt(p1);
                    i[b][c] = j1[nn];
                    int sp = j1[nn];
                    j1[nn] = j1[p1 - 1];
                    j1[p1 - 1] = sp;
                    p1--;
                }
            }

            p1 = 9;
            for (int b = a; b < n; b += 3) {
                for (int c =0; c < n; c += 3) {
                    int nn = random.nextInt(p1);
                    i[b][c] = j1[nn];
                    int sp = j1[nn];
                    j1[nn] = j1[p1 - 1];
                    j1[p1 - 1] = sp;
                    p1--;
                }
            }
        }

      //  p1 = 9;
//        int[] j2 = {1,2,3,4,5,6,7,8,9}; //int p1 = 9;
//        p1 = 9;
//        for(int a=0; a<9; a++){
//            if(j2[a]==i[0][0]){
//                int sp = j2[a];
//                j2[a] = j2[p1-1];
//                j2[p1-1] = sp;
//                p1--;
//                break;
//            }
//        }

//        // part-1
//        for(int a=0; a<=2; a++){
//            for(int b=0; b<=2; b++){
//                int nn = random.nextInt(p1);
//                i[a][b] = j1[nn];
//                int sp = j1[nn];
//                j1[nn] = j1[p1-1];
//                j1[p1-1] = sp;
//                p1--;
//            }
//        }

//        for(int a=0; a<n; a++) {
//            if(a==0){
//                int[] j1 = {1,2,3,4,5,6,7,8,9}; int p1 = 9;
//                for(int b=0; b<n; b+=3){
//                    for(int c=0; c<n; c+=3){
//                        int nn = random.nextInt(p1);
//                        i[b][c] = j1[nn];
//                        int sp = j1[nn];
//                        j1[nn] = j1[p1-1];
//                        j1[p1-1] = sp;
//                        p1--;
//                    }
//                }
//            }else if(a==199){
//                int[] j1 = {1,2,3,4,5,6,7,8,9}; int p1 = 9;
//                for(int b=0; b<n; b+=3){
//                    for(int c=1; c<n; c+=3){
//                        int nn = random.nextInt(p1);
//                        if(i[b][c]==0) {
//                            i[b][c] = j1[nn];
//                            // check it is visited or not
//
//                            int sp = j1[nn];
//                            j1[nn] = j1[p1 - 1];
//                            j1[p1 - 1] = sp;
//                            p1--;
//                        }else{
//                            continue;
//                        }
//                    }
//                }
//            }
            /*
            else if(a==2){
                int[] j1 = {1,2,3,4,5,6,7,8,9}; int p1 = 9;
                for(int b=2; b<n; b+=3){
                    for(int c=2; c<n; c+=3){
                        int nn = random.nextInt(p1);
                        i[b][c] = j1[nn];
                        int sp = j1[nn];
                        j1[nn] = j1[p1-1];
                        j1[p1-1] = sp;
                        p1--;
                    }
                }
            }*/
     //   }

        for(int a=0; a<n; a++){
            for(int b=0; b<n; b++){
                System.out.print(i[a][b] + " ");
            }
            System.out.println();
        }
    }
}