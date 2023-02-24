
package HW_1;

import java.util.Scanner;
import java.util.*;







public class App {

    static int[][] getMap() {
        return new int[][] {
                { 00, 00, 00, 00, 00, 00, 00, 00 },
                { 00, 00, -1, 00, 00, 00, 00, 00 },
                { 00, 00, -1, 00, -1, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, -1, -1, -1, -1, -1, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, -1, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, -1, 00 },
                { 00, 00, 00, 00, 00, 00, 00, 00 }
        };
    }

    static void pprint(int[][] m) {
        int rows = m.length;
        int colums = m[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                if (m[i][j] == -1)
                    System.out.printf("%4s", m[i][j]);
                else if (m[i][j] == 2)
                    System.out.printf("%4s", m[i][j]);
                else if (m[i][j] == 70)
                    System.out.printf("%4s", m[i][j]);
                else
                    System.out.printf("%4d", m[i][j]);
            }
            System.out.println();
        }
    }

    static void start(int[][] map, int x, int y) {
        map[x][y] = 2;
    }

    static void finish (int[][] map, int x, int y) {
        map[x][y] = 2;
    }

    static void Le (int[][] map, int startX, int startY, int finishX, int finishY){
        int rows = map.length;
        int colums = map[0].length;
        int count = 0;
        while(count< (int i=startX; i<rows; i++){
            for(int j=startY; j<colums; j++) {
                if (((startX-i)>=0) & ((starX+i)<=rows) & ((starY-j)>=0) & ((startY+j)<=colums))) {
                    if (map[i][j] == 0) {
                        map[i][j]=map
                    }

                }
            }
        }
    }




    public static void main(String[] args) {
        int[][] map = getMap();
        start(map, 4, 1);
        finish(map, 8, 3);
        pprint(map);
    }
}