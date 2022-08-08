package com.example.main;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

public class SudukuController implements Initializable {
    public TextField tf_3_7;
    public TextField tf_4_8;
    public TextField tf_4_7;
    public TextField tf_4_6;
    public TextField tf_5_8;
    public TextField tf_5_7;
    public TextField tf_5_6;
    public TextField tf_3_8;
    public TextField tf_3_6;
    public TextField tf_3_1;
    public TextField tf_4_2;
    public TextField tf_4_1;
    public TextField tf_4_0;
    public TextField tf_5_2;
    public TextField tf_5_1;
    public TextField tf_5_0;
    public TextField tf_3_2;
    public TextField tf_3_0;
    public TextField tf_3_4;
    public TextField tf_4_5;
    public TextField tf_4_4;
    public TextField tf_4_3;
    public TextField tf_5_5;
    public TextField tf_5_4;
    public TextField tf_5_3;
    public TextField tf_3_5;
    public TextField tf_3_3;
    public TextField tf_6_7;
    public TextField tf_7_8;
    public TextField tf_7_7;
    public TextField tf_7_6;
    public TextField tf_8_8;
    public TextField tf_8_7;
    public TextField tf_8_6;
    public TextField tf_6_8;
    public TextField tf_6_6;
    public TextField tf_6_4;
    public TextField tf_7_5;
    public TextField tf_7_4;
    public TextField tf_7_3;
    public TextField tf_8_5;
    public TextField tf_8_4;
    public TextField tf_8_3;
    public TextField tf_6_5;
    public TextField tf_6_3;
    public TextField tf_6_1;
    public TextField tf_7_2;
    public TextField tf_7_1;
    public TextField tf_7_0;
    public TextField tf_8_2;
    public TextField tf_8_1;
    public TextField tf_8_0;
    public TextField tf_6_2;
    public TextField tf_6_0;
    public TextField tf_0_1;
    public TextField tf_1_2;
    public TextField tf_1_1;
    public TextField tf_1_0;
    public TextField tf_2_2;
    public TextField tf_2_1;
    public TextField tf_2_0;
    public TextField tf_0_2;
    public TextField tf_0_0;
    public TextField tf_0_7;
    public TextField tf_1_8;
    public TextField tf_1_7;
    public TextField tf_1_6;
    public TextField tf_2_8;
    public TextField tf_2_7;
    public TextField tf_2_6;
    public TextField tf_0_8;
    public TextField tf_0_6;
    public TextField tf_0_4;
    public TextField tf_1_5;
    public TextField tf_1_4;
    public TextField tf_1_3;
    public TextField tf_2_5;
    public TextField tf_2_4;
    public TextField tf_2_3;
    public TextField tf_0_5;
    public TextField tf_0_3;

    int[][] i = new int[10][10];
    boolean[][] visit = new boolean[10][10];

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for(int a=0; a<9; a++){
            for(int b=0; b<9; b++){
                i[a][b] = 0;
            }
        }
    }

    void reset(){
        for(int a=0; a<10; a++){
            for(int b=0; b<10; b++){
                visit[a][b] = false;
            }
        }
    }

    private String emptyChecker(String s){
        return s.length()==0 ? "0" : s;
    }
    private void getUserInput(){
        i[0][0] = Integer.parseInt(emptyChecker(tf_0_0.getText()));
        i[0][1] = Integer.parseInt(emptyChecker(tf_0_1.getText()));
        i[0][2] = Integer.parseInt(emptyChecker(tf_0_2.getText()));
        i[0][3] = Integer.parseInt(emptyChecker(tf_0_3.getText()));
        i[0][4] = Integer.parseInt(emptyChecker(tf_0_4.getText()));
        i[0][5] = Integer.parseInt(emptyChecker(tf_0_5.getText()));
        i[0][6] = Integer.parseInt(emptyChecker(tf_0_6.getText()));
        i[0][7] = Integer.parseInt(emptyChecker(tf_0_7.getText()));
        i[0][8] = Integer.parseInt(emptyChecker(tf_0_8.getText()));

        i[1][0] = Integer.parseInt(emptyChecker(tf_1_0.getText()));
        i[1][1] = Integer.parseInt(emptyChecker(tf_1_1.getText()));
        i[1][2] = Integer.parseInt(emptyChecker(tf_1_2.getText()));
        i[1][3] = Integer.parseInt(emptyChecker(tf_1_3.getText()));
        i[1][4] = Integer.parseInt(emptyChecker(tf_1_4.getText()));
        i[1][5] = Integer.parseInt(emptyChecker(tf_1_5.getText()));
        i[1][6] = Integer.parseInt(emptyChecker(tf_1_6.getText()));
        i[1][7] = Integer.parseInt(emptyChecker(tf_1_7.getText()));
        i[1][8] = Integer.parseInt(emptyChecker(tf_1_8.getText()));

        i[2][0] = Integer.parseInt(emptyChecker(tf_2_0.getText()));
        i[2][1] = Integer.parseInt(emptyChecker(tf_2_1.getText()));
        i[2][2] = Integer.parseInt(emptyChecker(tf_2_2.getText()));
        i[2][3] = Integer.parseInt(emptyChecker(tf_2_3.getText()));
        i[2][4] = Integer.parseInt(emptyChecker(tf_2_4.getText()));
        i[2][5] = Integer.parseInt(emptyChecker(tf_2_5.getText()));
        i[2][6] = Integer.parseInt(emptyChecker(tf_2_6.getText()));
        i[2][7] = Integer.parseInt(emptyChecker(tf_2_7.getText()));
        i[2][8] = Integer.parseInt(emptyChecker(tf_2_8.getText()));

        i[3][0] = Integer.parseInt(emptyChecker(tf_3_0.getText()));
        i[3][1] = Integer.parseInt(emptyChecker(tf_3_1.getText()));
        i[3][2] = Integer.parseInt(emptyChecker(tf_3_2.getText()));
        i[3][3] = Integer.parseInt(emptyChecker(tf_3_3.getText()));
        i[3][4] = Integer.parseInt(emptyChecker(tf_3_4.getText()));
        i[3][5] = Integer.parseInt(emptyChecker(tf_3_5.getText()));
        i[3][6] = Integer.parseInt(emptyChecker(tf_3_6.getText()));
        i[3][7] = Integer.parseInt(emptyChecker(tf_3_7.getText()));
        i[3][8] = Integer.parseInt(emptyChecker(tf_3_8.getText()));

        i[4][0] = Integer.parseInt(emptyChecker(tf_4_0.getText()));
        i[4][1] = Integer.parseInt(emptyChecker(tf_4_1.getText()));
        i[4][2] = Integer.parseInt(emptyChecker(tf_4_2.getText()));
        i[4][3] = Integer.parseInt(emptyChecker(tf_4_3.getText()));
        i[4][4] = Integer.parseInt(emptyChecker(tf_4_4.getText()));
        i[4][5] = Integer.parseInt(emptyChecker(tf_4_5.getText()));
        i[4][6] = Integer.parseInt(emptyChecker(tf_4_6.getText()));
        i[4][7] = Integer.parseInt(emptyChecker(tf_4_7.getText()));
        i[4][8] = Integer.parseInt(emptyChecker(tf_4_8.getText()));

        i[5][0] = Integer.parseInt(emptyChecker(tf_5_0.getText()));
        i[5][1] = Integer.parseInt(emptyChecker(tf_5_1.getText()));
        i[5][2] = Integer.parseInt(emptyChecker(tf_5_2.getText()));
        i[5][3] = Integer.parseInt(emptyChecker(tf_5_3.getText()));
        i[5][4] = Integer.parseInt(emptyChecker(tf_5_4.getText()));
        i[5][5] = Integer.parseInt(emptyChecker(tf_5_5.getText()));
        i[5][6] = Integer.parseInt(emptyChecker(tf_5_6.getText()));
        i[5][7] = Integer.parseInt(emptyChecker(tf_5_7.getText()));
        i[5][8] = Integer.parseInt(emptyChecker(tf_5_8.getText()));

        i[6][0] = Integer.parseInt(emptyChecker(tf_6_0.getText()));
        i[6][1] = Integer.parseInt(emptyChecker(tf_6_1.getText()));
        i[6][2] = Integer.parseInt(emptyChecker(tf_6_2.getText()));
        i[6][3] = Integer.parseInt(emptyChecker(tf_6_3.getText()));
        i[6][4] = Integer.parseInt(emptyChecker(tf_6_4.getText()));
        i[6][5] = Integer.parseInt(emptyChecker(tf_6_5.getText()));
        i[6][6] = Integer.parseInt(emptyChecker(tf_6_6.getText()));
        i[6][7] = Integer.parseInt(emptyChecker(tf_6_7.getText()));
        i[6][8] = Integer.parseInt(emptyChecker(tf_6_8.getText()));

        i[7][0] = Integer.parseInt(emptyChecker(tf_7_0.getText()));
        i[7][1] = Integer.parseInt(emptyChecker(tf_7_1.getText()));
        i[7][2] = Integer.parseInt(emptyChecker(tf_7_2.getText()));
        i[7][3] = Integer.parseInt(emptyChecker(tf_7_3.getText()));
        i[7][4] = Integer.parseInt(emptyChecker(tf_7_4.getText()));
        i[7][5] = Integer.parseInt(emptyChecker(tf_7_5.getText()));
        i[7][6] = Integer.parseInt(emptyChecker(tf_7_6.getText()));
        i[7][7] = Integer.parseInt(emptyChecker(tf_7_7.getText()));
        i[7][8] = Integer.parseInt(emptyChecker(tf_7_8.getText()));

        i[8][0] = Integer.parseInt(emptyChecker(tf_8_0.getText()));
        i[8][1] = Integer.parseInt(emptyChecker(tf_8_1.getText()));
        i[8][2] = Integer.parseInt(emptyChecker(tf_8_2.getText()));
        i[8][3] = Integer.parseInt(emptyChecker(tf_8_3.getText()));
        i[8][4] = Integer.parseInt(emptyChecker(tf_8_4.getText()));
        i[8][5] = Integer.parseInt(emptyChecker(tf_8_5.getText()));
        i[8][6] = Integer.parseInt(emptyChecker(tf_8_6.getText()));
        i[8][7] = Integer.parseInt(emptyChecker(tf_8_7.getText()));
        i[8][8] = Integer.parseInt(emptyChecker(tf_8_8.getText()));


//        for(int c=0; c<9; c++) {
//            System.out.println("i[4][" + c + "] = Integer.parseInt(emptyChecker(tf_4_" + c + ".getText()));");
//        }
    }

    private void sw(int a, int b){
        int sp = a;
        a = b;
        b = sp;
    }
    private void setValue(){

        /*
        2 4 8 5 9 7 3 1 6
        5 4 8 9 3 6 1 7 2
        5 8 3 9 1 4 6 7 2
        7 1 8 6 9 3 5 2 4
        7 5 1 4 9 8 6 2 3
        3 5 1 6 8 9 2 7 4
        6 5 2 8 9 7 3 4 1
        6 3 2 9 8 1 4 5 7
        3 4 8 5 2 6 9 7 1
         */

        Random random = new Random();

        int[] j1 = {1,2,3,4,5,6,7,8,9}; int p1 = 9;

        // part-1
        for(int a=0; a<=2; a++){
            for(int b=0; b<=2; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        p1 = 9;
        // part-2
        for(int a=0; a<=2; a++){
            for(int b=3; b<=5; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        // part-2 section-1
        int[] s1 = {i[0][0], i[0][1], i[0][2]};
        boolean[] sb1 = new boolean[11];
        for(int a=1; a<=9; a++){
            sb1[a] = false;
        }

        for(int a=0; a<3; a++){
            sb1[s1[a]] = true;
        }

        for(int a=3; a<=5; a++){
            if(sb1[i[0][a]]){
                int ssd = i[0][a];
                boolean port1 = false;
                for(int b=3; b<=5; b++){
                    if(!sb1[i[1][b]]){
                        i[0][a] = i[1][b];
                        i[1][b] = ssd;
                        port1 = true;
                        break;
                    }
                }

                if(!port1){
                    for(int b=3; b<=5; b++){
                        if(!sb1[i[2][b]]){
                            i[0][a] = i[2][b];
                            i[2][b] = ssd;
                            break;
                        }
                    }
                }
            }
        }

        // part-2 section-2
        int[] s2 = {i[1][0], i[1][1], i[1][2]};
        boolean[] sb2 = new boolean[11];
        for(int a=1; a<=9; a++){
            sb2[a] = false;
        }

        for(int a=0; a<3; a++){
            sb2[s2[a]] = true;
        }

        for(int a=3; a<=5; a++){
            if(sb2[i[1][a]]){
                int ssd = i[1][a];
                boolean port1 = false;
                for(int b=3; b<=5; b++){
                    if(!sb2[i[2][b]]){
                        i[1][a] = i[2][b];
                        i[2][b] = ssd;
                        port1 = true;
                        break;
                    }
                }

            }
        }

        // part-2 section-3
        int[] s3 = {i[2][0], i[2][1], i[2][2]};
        boolean[] sb3 = new boolean[11];
        for(int a=1; a<=9; a++){
            sb3[a] = false;
        }

        for(int a=0; a<3; a++){
            sb3[s3[a]] = true;
        }

        for(int a=3; a<=5; a++){
            if(sb3[i[2][a]]){
                int ssd = i[2][a];
                for(int b=3; b<=5; b++){
                    if(!sb3[i[1][b]] && !sb2[ssd]){
                        i[2][a] = i[1][b];
                        i[1][b] = ssd;
                        break;
                    }
                }
            }
        }

        // part-3
        p1 = 9;
        for(int a=0; a<=2; a++){
            for(int b=6; b<=8; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }
        // part-3 section - 1
        int[] r1 = {i[0][0], i[0][1], i[0][2], i[0][3], i[0][4], i[0][5], i[0][6]};
        boolean[] rb1 = new boolean[11];
        for(int a=1; a<=9; a++){
            rb1[a] = false;
        }

        for(int a=0; a<6; a++){
            rb1[r1[a]] = true;
        }

        for(int a=6; a<=8; a++){
            if(rb1[i[0][a]]){
                int ssd = i[0][a];
                boolean port1 = false;
                for(int b=6; b<=8; b++){
                    if(!rb1[i[1][b]]){
                        i[0][a] = i[1][b];
                        i[1][b] = ssd;
                        port1 = true;
                        break;
                    }
                }

                if(!port1){
                    for(int b=3; b<=5; b++){
                        if(!rb1[i[2][b]]){
                            i[0][a] = i[2][b];
                            i[2][b] = ssd;
                            break;
                        }
                    }
                }
            }
        }


        int[] r2 = {i[1][0], i[1][1], i[1][2], i[1][3], i[1][4], i[1][5], i[1][6]};
        int[] r3 = {i[2][0], i[2][1], i[2][2], i[2][3], i[2][4], i[2][5], i[2][6]};

        /*
        p1 = 9;
        // part-4
        for(int a=3; a<=5; a++){
            for(int b=0; b<=2; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        p1 = 9;
        // part-5
        for(int a=3; a<=5; a++){
            for(int b=3; b<=5; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        p1 = 9;
        // part-6
        for(int a=3; a<=5; a++){
            for(int b=6; b<=8; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        p1 = 9;
        // part-7
        for(int a=6; a<=8; a++){
            for(int b=0; b<=2; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        p1 = 9;
        // part-8
        for(int a=6; a<=8; a++){
            for(int b=3; b<=5; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }


        p1 = 9;
        // part-9
        for(int a=6; a<=8; a++){
            for(int b=6; b<=8; b++){
                int nn = random.nextInt(p1);
                i[a][b] = j1[nn];
                int sp = j1[nn];
                j1[nn] = j1[p1-1];
                j1[p1-1] = sp;
                p1--;
            }
        }

        // -------------------------------------
        // ------------- PART Checker ----------
        // -------------------------------------

        boolean[][] visit = new boolean[10][10];
        for(int a=0; a<9; a++){
            for(int b=0; b<9; b++){
                visit[a][b] = false;
            }
        }

        // part - 2
        for(int a=0; a<=2; a++){
            for(int b=3; b<=5; b++){
                boolean[] visit1 = new boolean[10];
                for(int c=9; c>=1; c--){
                    visit1[c] = false;
                }
                for(int c=b-1; c>=0; c--){
                    System.out.print(i[a][c] + " ");
                    visit1[i[a][c]] = true;
                }
                System.out.println("");


                if(!visit[a][b]){
                    int ssd = i[a][b];
                    for(int c=0; c<=2; c++){
                        boolean port2 = false;
                        for(int d=3; d<=5; d++){
                            if(!visit[c][d] && !visit1[i[c][d]]){
                                i[a][b] = i[c][d];
                                i[c][d] = ssd;
                                port2 = true;
                                visit[a][b] = true;
                                visit1[i[a][b]] = true;
                                break;
                            }
                        }
                        if(port2){
                            break;
                        }
                    }
                }
            }
        }

        /*
        // part - 1

        for(int a=0; a<=2; a++){
            boolean[] visit1 = new boolean[10];
            // number 1 to 9
            for(int b=1; b<=9; b++){
                visit1[b] = false;
            }
            // cell value come from i[a][b]
            for(int b=3; b<=8; b++){
                visit1[i[a][b]] = true;
            }

            // cell value check
            for(int b=0; b<=2; b++){
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=0; d<=2; d++){
                        boolean porting = false;
                        for(int e=0; e<=2; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }

        // part - 2

        for(int a=0; a<=2; a++){
            boolean[] visit1 = new boolean[10];
            // number 1 to 9
            for(int b=1; b<=9; b++){
                visit1[b] = false;
            }
            // cell value come from i[a][b]
            for(int b=0; b<=2; b++){
                visit1[i[a][b]] = true;
            }

            for(int b=6; b<=8; b++){
                visit1[i[a][b]] = true;
            }

            // cell value check
            for(int b=3; b<=5; b++){
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=0; d<=2; d++){
                        boolean porting = false;
                        for(int e=3; e<=5; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }


        // part - 3

        for(int a=0; a<=2; a++){
            boolean[] visit1 = new boolean[10];
            // number 1 to 9
            for(int b=1; b<=9; b++){
                visit1[b] = false;
            }
            // cell value come from i[a][b]
            for(int b=0; b<=5; b++){
                visit1[i[a][b]] = true;
            }

            // cell value check
            for(int b=6; b<=8; b++){
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=0; d<=2; d++){
                        boolean porting = false;
                        for(int e=6; e<=8; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }


        /////////////////////////////////////////////////

        // part - 4

        for(int a=3; a<=5; a++){
            // cell value check
            for(int b=0; b<=2; b++){
                boolean[] visit1 = new boolean[10];
                // number 1 to 9
                for(int c=1; c<=9; c++){
                    visit1[c] = false;
                }
                for(int c=a-1; c>=0; c--){
                    if(!visit[a][b]) {
                        visit1[i[c][b]] = true;
                    }
                }
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=3; d<=5; d++){
                        boolean porting = false;
                        for(int e=0; e<=2; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }


        /////////////////////////////////////////////////

        // part - 7

        for(int a=6; a<=8; a++){

            // cell value check
            for(int b=0; b<=2; b++){
                boolean[] visit1 = new boolean[10];
                // number 1 to 9
                for(int c=1; c<=9; c++){
                    visit1[c] = false;
                }
                for(int c=a-1; c>=0; c--){
                    if(!visit[a][b]) {
                        visit1[i[c][b]] = true;
                    }
                }
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=6; d<=8; d++){
                        boolean porting = false;
                        for(int e=0; e<=2; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }

        /*
        // part - 5

        for(int a=3; a<=5; a++){
            boolean[] visit1 = new boolean[10];
            // number 1 to 9
            for(int b=1; b<=9; b++){
                visit1[b] = false;
            }
            // cell value come from i[a][b]
            for(int b=0; b<=2; b++){
                visit1[i[a][b]] = true;
            }

            for(int b=6; b<=8; b++){
                visit1[i[a][b]] = true;
            }

            // cell value check
            for(int b=3; b<=5; b++){
                for(int c=a-1; c>=0; c--){
                    visit1[i[c][b]] = true;
                }
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=3; d<=5; d++){
                        boolean porting = false;
                        for(int e=3; e<=5; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }

        // part - 6

        for(int a=3; a<=5; a++){
            boolean[] visit1 = new boolean[10];
            // number 1 to 9
            for(int b=1; b<=9; b++){
                visit1[b] = false;
            }
            // cell value come from i[a][b]
            for(int b=0; b<=5; b++){
                visit1[i[a][b]] = true;
                System.out.print(i[a][b] + " ");
            }
            System.out.println("");

            // cell value check
            for(int b=6; b<=8; b++){
                for(int c=a-1; c>=0; c--){
                    visit1[i[c][b]] = true;
                    System.out.print(i[c][b] + " ");
                }
                System.out.println("");
                if(!visit1[i[a][b]] && !visit[a][b]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=3; d<=5; d++){
                        boolean porting = false;
                        for(int e=6; e<=8; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }


        /*
        // part - 3
        for(int a=0; a<=2; a++){
            boolean[] visit1 = new boolean[10];
            // number 1 to 9
            for(int b=1; b<=9; b++){
                visit1[b] = false;
            }
            // cell value come from i[a][b]
            for(int b=0; b<=6; b++){
                visit1[i[a][b]] = true;
            }

            // cell value check
            for(int b=6; b<=8; b++){
                if(!visit1[i[a][b]]){
                    visit[a][b] = true;
                    visit1[i[a][b]] = true;
                }else{
                    int ssd = i[a][b];
                    for(int d=0; d<=2; d++){
                        boolean porting = false;
                        for(int e=6; e<=8; e++) {
                            if (!visit1[i[d][e]] && !visit[d][e]) {
                                i[a][b] = i[d][e];
                                i[d][e] = ssd;
                                visit1[i[a][b]] = true;
                                visit[a][b] = true;
                                porting = true;
                                break;
                            }
                        }
                        if(porting){
                            break;
                        }
                    }
                }
            }
        }


        /*
        int n = 9;
        for(int a=0; a<9; a++){
            int j[] = {1,2,3,4,5,6,7,8,9}, p = 9;
            for(int b=0; b<9; b++){
                int nn = random.nextInt(p);
                i[a][b] = j[nn];
                int sp = j[nn];
                j[nn] = j[p-1];
                j[p-1] = sp;
                p--;
                System.out.print("i[" + a + "][" + b + "]   ");
            }
            System.out.println("");
        }

        /*


        /**
        for(int a=0; a<9; a++){
            for(int b=0; b<9; b++){
                System.out.print(i[a][b] + " ");
            }
            System.out.println("");
        }

        System.out.println("\n\n");

        for(int a=0; a<9; a++){
            for(int b=0; b<9; b++){
                System.out.print(i[b][a]+" ");
            }
            System.out.println("");
        }
        System.out.println("\n\n");
         */

        // -----------------------------
        // ----------  one -------------
        // -----------------------------
        int[] part1 = {
                i[0][0], i[0][1], i[0][2],
                i[1][0], i[1][1], i[1][2],
                i[2][0], i[2][1], i[2][2]
        };


//        boolean[] visit1 = new boolean[10];
//        for(int a=0; a<9; a++){
//            boolean[] visiting = new boolean[10];
//            for(int b=0; b<9; b++){
//               if(!visiting[i[b][a]]){
//                   visiting[i[b][a]] = true;
//               }else{
//                   i[b][a] = 0;
//               }
//            }
//        }

        // 1. need from part1
        // 2.

//        for(int a=0; a<3; a++){
//            for(int b=0; b<3; b++){
//
//            }
//        }

        int[] part2 = {
                i[0][3], i[0][4], i[0][5],
                i[1][3], i[1][4], i[1][5],
                i[2][3], i[2][4], i[2][5]
        };


        int[] part3 = {
                i[0][6], i[0][7], i[0][8],
                i[1][6], i[1][7], i[1][8],
                i[2][6], i[2][7], i[2][8]
        };


        // -----------------------------
        // ----------  two -------------
        // -----------------------------
        int[] part4 = {
                i[3][0], i[3][1], i[3][2],
                i[4][0], i[4][1], i[4][2],
                i[5][0], i[5][1], i[5][2]
        };

        int[] part5 = {
                i[3][3], i[3][4], i[3][5],
                i[4][3], i[4][4], i[4][5],
                i[5][3], i[5][4], i[5][5]
        };

        int[] part6 = {
                i[3][6], i[3][7], i[3][8],
                i[4][6], i[4][7], i[4][8],
                i[5][6], i[5][7], i[5][8]
        };

        // ------------------------------
        // ----------  three  -----------
        // ------------------------------
        int[] part7 = {
                i[6][0], i[6][1], i[6][2],
                i[7][0], i[7][1], i[7][2],
                i[8][0], i[8][1], i[8][2]
        };

        int[] part8 = {
                i[6][3], i[6][4], i[6][5],
                i[7][3], i[7][4], i[7][5],
                i[8][3], i[8][4], i[8][5]
        };

        int[] part9 = {
                i[6][6], i[6][7], i[6][8],
                i[7][6], i[7][7], i[7][8],
                i[8][6], i[8][7], i[8][8]
        };

        // if range 0,0 to 2,2 == part1
        // if range 0,3 to 2,5 == part2
        // if range 0,6 to 2,8 == part3

        // if range 3,0 to 5,2 == part4
        // if range 3,3 to 5,5 == part5
        // if range 3,6 to 5,8 == part6

        // if range 6,0 to 8,2 == part7
        // if range 6,3 to 8,5 == part8
        // if range 6,6 to 8,8 == part9

        // search in part1


        tf_0_0.setText(String.valueOf(i[0][0]));
        tf_0_1.setText(String.valueOf(i[0][1]));
        tf_0_2.setText(String.valueOf(i[0][2]));
        tf_0_3.setText(String.valueOf(i[0][3]));
        tf_0_4.setText(String.valueOf(i[0][4]));
        tf_0_5.setText(String.valueOf(i[0][5]));
        tf_0_6.setText(String.valueOf(i[0][6]));
        tf_0_7.setText(String.valueOf(i[0][7]));
        tf_0_8.setText(String.valueOf(i[0][8]));
        tf_1_0.setText(String.valueOf(i[1][0]));
        tf_1_1.setText(String.valueOf(i[1][1]));
        tf_1_2.setText(String.valueOf(i[1][2]));
        tf_1_3.setText(String.valueOf(i[1][3]));
        tf_1_4.setText(String.valueOf(i[1][4]));
        tf_1_5.setText(String.valueOf(i[1][5]));
        tf_1_6.setText(String.valueOf(i[1][6]));
        tf_1_7.setText(String.valueOf(i[1][7]));
        tf_1_8.setText(String.valueOf(i[1][8]));
        tf_2_0.setText(String.valueOf(i[2][0]));
        tf_2_1.setText(String.valueOf(i[2][1]));
        tf_2_2.setText(String.valueOf(i[2][2]));
        tf_2_3.setText(String.valueOf(i[2][3]));
        tf_2_4.setText(String.valueOf(i[2][4]));
        tf_2_5.setText(String.valueOf(i[2][5]));
        tf_2_6.setText(String.valueOf(i[2][6]));
        tf_2_7.setText(String.valueOf(i[2][7]));
        tf_2_8.setText(String.valueOf(i[2][8]));
        tf_3_0.setText(String.valueOf(i[3][0]));
        tf_3_1.setText(String.valueOf(i[3][1]));
        tf_3_2.setText(String.valueOf(i[3][2]));
        tf_3_3.setText(String.valueOf(i[3][3]));
        tf_3_4.setText(String.valueOf(i[3][4]));
        tf_3_5.setText(String.valueOf(i[3][5]));
        tf_3_6.setText(String.valueOf(i[3][6]));
        tf_3_7.setText(String.valueOf(i[3][7]));
        tf_3_8.setText(String.valueOf(i[3][8]));
        tf_4_0.setText(String.valueOf(i[4][0]));
        tf_4_1.setText(String.valueOf(i[4][1]));
        tf_4_2.setText(String.valueOf(i[4][2]));
        tf_4_3.setText(String.valueOf(i[4][3]));
        tf_4_4.setText(String.valueOf(i[4][4]));
        tf_4_5.setText(String.valueOf(i[4][5]));
        tf_4_6.setText(String.valueOf(i[4][6]));
        tf_4_7.setText(String.valueOf(i[4][7]));
        tf_4_8.setText(String.valueOf(i[4][8]));
        tf_5_0.setText(String.valueOf(i[5][0]));
        tf_5_1.setText(String.valueOf(i[5][1]));
        tf_5_2.setText(String.valueOf(i[5][2]));
        tf_5_3.setText(String.valueOf(i[5][3]));
        tf_5_4.setText(String.valueOf(i[5][4]));
        tf_5_5.setText(String.valueOf(i[5][5]));
        tf_5_6.setText(String.valueOf(i[5][6]));
        tf_5_7.setText(String.valueOf(i[5][7]));
        tf_5_8.setText(String.valueOf(i[5][8]));
        tf_6_0.setText(String.valueOf(i[6][0]));
        tf_6_1.setText(String.valueOf(i[6][1]));
        tf_6_2.setText(String.valueOf(i[6][2]));
        tf_6_3.setText(String.valueOf(i[6][3]));
        tf_6_4.setText(String.valueOf(i[6][4]));
        tf_6_5.setText(String.valueOf(i[6][5]));
        tf_6_6.setText(String.valueOf(i[6][6]));
        tf_6_7.setText(String.valueOf(i[6][7]));
        tf_6_8.setText(String.valueOf(i[6][8]));
        tf_7_0.setText(String.valueOf(i[7][0]));
        tf_7_1.setText(String.valueOf(i[7][1]));
        tf_7_2.setText(String.valueOf(i[7][2]));
        tf_7_3.setText(String.valueOf(i[7][3]));
        tf_7_4.setText(String.valueOf(i[7][4]));
        tf_7_5.setText(String.valueOf(i[7][5]));
        tf_7_6.setText(String.valueOf(i[7][6]));
        tf_7_7.setText(String.valueOf(i[7][7]));
        tf_7_8.setText(String.valueOf(i[7][8]));
        tf_8_0.setText(String.valueOf(i[8][0]));
        tf_8_1.setText(String.valueOf(i[8][1]));
        tf_8_2.setText(String.valueOf(i[8][2]));
        tf_8_3.setText(String.valueOf(i[8][3]));
        tf_8_4.setText(String.valueOf(i[8][4]));
        tf_8_5.setText(String.valueOf(i[8][5]));
        tf_8_6.setText(String.valueOf(i[8][6]));
        tf_8_7.setText(String.valueOf(i[8][7]));
        tf_8_8.setText(String.valueOf(i[8][8]));


//        for(int a=0; a<9; a++){
//            for(int b=0; b<9; b++){
//                System.out.println("tf_" + a + "_" + b + ".setText(String.valueOf(i["+ a +"][" + b +"]));");
//            }
//        }
        //int n = 12;
        //tf_0_0.setText(String.valueOf(n));
    }

    public void newGame(ActionEvent actionEvent) {
        setValue();
//        for(int a=0; a<9; a++){
//            for(int b=0; b<9; b++){
//                System.out.print(a + b + " ");
//            }
//            System.out.println("");
//        }
    }
}
