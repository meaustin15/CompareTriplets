import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] aList = new int[3];
        int[] bList = new int[3];

        for(int x =0; x < 3; x++){
            aList[x] = in.nextInt();
        }

        for(int x =0; x < 3; x++){
            bList[x] = in.nextInt();
        }

        int[] points = new int[2];

        for(int x = 0; x < 3; x++){
            if(aList[x] > bList[x]){
                points[0]+=1;
            }else if (aList[x] < bList[x]){
                points[1]+=1;
            }
        }

        System.out.println(points[0] + " " + points[1]);
    }
}
