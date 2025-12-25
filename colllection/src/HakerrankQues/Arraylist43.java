package HakerrankQues;

import java.util.*;

public class Arraylist43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number of lines
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read n lines
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();    // number of integers in this line
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                temp.add(sc.nextInt());
            }
            list.add(temp);
        }

        int q = sc.nextInt();   // number of queries

        // Process each query
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();   // line number
            int y = sc.nextInt();   // position

            try {
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
