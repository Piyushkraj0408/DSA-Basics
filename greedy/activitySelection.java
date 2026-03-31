package greedy;
import java.util.*;
class Activity{
    int start;
    int end;
    Activity(int start,int end){
        this.start=start;
        this.end = end;
    }
}
public class activitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        Activity[] arr = new Activity[n];
        for(int i=0;i<n;i++){
            start[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            end[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i] = new Activity(start[i],end[i]);
        }
        Arrays.sort(arr,(a,b)->a.end-b.end);
        int count = 1;
        int lend = arr[0].end;
        for(int i=1;i<n;i++){
            if(arr[i].start>=lend){
                count++;
                lend = arr[i].end;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
