import java.util.Scanner;
/**
 * Created by zhengxiaoyu on 16/3/29.
 */
public class LastThree {
    public static int main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Please input two number separated by space");
        Scanner in = new Scanner(System.in);
        int x,y,last=1;
        String nums = in.nextLine();
        String[] s = nums.split(" ");
        x = Integer.parseInt(s[0]);
        y = Integer.parseInt(s[1]);
        for(int i=1;i<=y;i++)
            last=last*x%1000;
        System.out.print("The last 3 dights is" + (last % 1000));
        return 0;
    }
}
