package greedy;
import java.util.*;
class Job{
    char c;
    int dead;
    int profit;
    Job(char c,int dead,int profit){
        this.c = c;
        this.dead = dead;
        this.profit = profit;
    }
}
public class jobSequencing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Job[] job = new Job[n];
        for(int i=0;i<n;i++){
            char c = sc.next().charAt(0);
            int dead = sc.nextInt();
            int profit = sc.nextInt();
            job[i] = new Job(c,dead,profit);
        }

        int max = -1;
        for(int i=0;i<n;i++){
            if(max<job[i].dead){
                max = job[i].dead;
            }
        }

        int[] arr = new int[max];
        Arrays.sort(job,(a,b)->b.profit-a.profit);
        Arrays.fill(arr,'-');

        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=job[i].dead;j>=0;j--){
                if(arr[j]=='-'){
                    arr[j] = job[i].c;
                    count+=job[i].profit;
                    break;
                }
            }
        }
        System.out.println(arr);
        System.out.print(count);
        sc.close();
    }
}
