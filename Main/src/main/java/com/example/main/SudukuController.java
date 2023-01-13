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

        //  part-2
        for(int a=0; a<=2; a++){
            int d = 0;
            for(int b=3; b<=5; b++){
                if(a==2){
                    i[a][b] = i[0][d];
                    d++;
                }else {
                    i[a][b] = i[a + 1][d];
                    d++;
                }
            }
        }

        //  part-3
        for(int a=0; a<=2; a++){
            int d = 3;
            for(int b=6; b<=8; b++){
                if(a==2){
                    i[a][b] = i[0][d];
                    d++;
                }else {
                    i[a][b] = i[a + 1][d];
                    d++;
                }
            }
        }

        // 00 01 02
        // 10 11 12
        // 20 21 22



        //  part-4
        for(int a=3, d = 1, s=0; a<=5; a++){
            int c = 3;
            for(int b=0; b<=2; b++){
                if(a==5){
                    d = 0;
                    i[c][s] = i[b][d];
                    c++;
                }else {
                    i[c][s] = i[b][d];
                    c++;
                }
            }d++;
            s++;
        }

        // 00 01 02 03 04
        // 10 11 12
        // 20 21 22

        // 33 34 35
        // 43 44 45
        // 53 54 55

        //  part-5
        for(int a=3, d = 4, s=3; a<=5; a++){
            int c = 3;
            for(int b=0; b<=2; b++){
                if(a==5){
                    d = 3;
                    i[c][s] = i[b][d];
                    c++;
                }else {
                    i[c][s] = i[b][d];
                    c++;
                }
            }d++;
            s++;
        }

        // 00 01 02 03 04
        // 10 11 12
        // 20 21 22

        // 36 37 38
        // 46 47 48
        // 56 57 58

        //  part-6
        for(int a=3, d = 7, s=6; a<=5; a++){
            int c = 3;
            for(int b=0; b<=2; b++){
                if(a==5){
                    d = 6;
                    i[c][s] = i[b][d];
                    c++;
                }else {
                    i[c][s] = i[b][d];
                    c++;
                }
            }d++;
            s++;
        }

        // 33 34 35
        // 43 44 45
        // 53 54 55

        // 63 64 65
        // 73 74 75
        // 83 84 85

        //  part-7
        for(int a=6, d = 1, s=0; a<=8; a++){
            int c = 6;
            for(int b=3; b<=5; b++){
                if(a==8){
                    d = 3;
                    i[c][s] = i[b][d];
                    c++;
                }else {
                    i[c][s] = i[b][d];
                    c++;
                }
            }d++;
            s++;
        }

        // 33 34 35
        // 43 44 45
        // 53 54 55

        // 63 64 65
        // 73 74 75
        // 83 84 85

        //  part-8
        for(int a=6, d = 4, s=3; a<=8; a++){
            int c = 6;
            for(int b=3; b<=5; b++){
                if(a==8){
                    d = 3;
                    i[c][s] = i[b][d];
                    c++;
                }else {
                    i[c][s] = i[b][d];
                    c++;
                }
            }d++;
            s++;
        }

        // 36 37 38
        // 46 47 48
        // 56 57 58

        // 66 67 68
        // 76 77 78
        // 86 87 88

        //  part-9
        for(int a=6, d = 7, s=6; a<=8; a++){
            int c = 6;
            for(int b=3; b<=5; b++){
                if(a==8){
                    d = 6;
                    i[c][s] = i[b][d];
                    c++;
                }else {
                    i[c][s] = i[b][d];
                    c++;
                }
            }d++;
            s++;
        }

        // 00 01 02 03 04
        // 10 11 12
        // 20 21 22

        // 36 37 38
        // 46 47 48
        // 56 57 58

        int sd3 = 1, sd4 = 2;
        for(int a=0; a<=8; a++){
            int sp = i[a][sd3];
            i[a][sd3] = i[a][sd4];
            i[a][sd4] = sp;
        }

        sd3 = 3; sd4 = 4;
        for(int a=0; a<=8; a++){
            int sp = i[a][sd3];
            i[a][sd3] = i[a][sd4];
            i[a][sd4] = sp;
        }

        sd3 = 7; sd4 = 8;
        for(int a=0; a<=8; a++){
            int sp = i[a][sd3];
            i[a][sd3] = i[a][sd4];
            i[a][sd4] = sp;
        }

        //
        sd3 = 1; sd4 = 2;
        for(int a=0; a<=8; a++){
            int sp = i[sd3][a];
            i[sd3][a] = i[sd4][a];
            i[sd4][a] = sp;
        }

        sd3 = 3; sd4 = 4;
        for(int a=0; a<=8; a++){
            int sp = i[sd3][a];
            i[sd3][a] = i[sd4][a];
            i[sd4][a] = sp;
        }

        sd3 = 7; sd4 = 8;
        for(int a=0; a<=8; a++){
            int sp = i[sd3][a];
            i[sd3][a] = i[sd4][a];
            i[sd4][a] = sp;
        }


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
