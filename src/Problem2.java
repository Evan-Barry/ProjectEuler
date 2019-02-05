import java.util.ArrayList;

public class Problem2 {
    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3 = 0;
        int i;
        int limit = 4000000;
        int sum = 2;

        for(i = 3; n3 < limit; i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            if(n3 < 4000000)
            {
                if(n3 % 2 == 0)
                {
                    sum += n3;
                }
            }
        }

        System.out.println(sum);

    }
}
