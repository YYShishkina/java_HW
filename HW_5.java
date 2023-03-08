
package HW_OOP_1;


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


/*
    static void Le (int[][] map, int startX, int startY, int finishX, int finishY){
        ArrayList<Integer> lst = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int rows = map.length;
        int colums = map[0].length;
        lst.add(startX,startY);
        for (int i=1; i<3; i++) {
            if (map[startX+i][startY] != -1)  {
                map[startX+i][startY] = map[startX][startY]+1;
                lst.add(map[startX+i][startY]);
            }

        }
        System.out.println(lst);
        map[][] = lst.get(1) ;

            if map(lst.get(1)))
            map[startX+i][startY] = map[startX][startY]+1;
            lst.add(map[startX+i][startY]);
        }
    }
*/




    public static void main(String[] args) {
        Node nod1 = new Node();
        int[][] map = getMap();
        start(map, 4, 1);
        finish(map, 8, 3);
        pprint(map);
//        Le(map,4,1,8,3);
//        pprint(map);
    }
}