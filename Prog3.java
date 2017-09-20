package practice_9_19;

/*题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。*/
public class Prog3{

    public static void main(String[] args){

        for(int i=100;i<1000;i++){

            if(isLotus(i))

               System.out.print(i+" ");

        }

        System.out.println();

    }

    //判断水仙花数

    private static boolean isLotus(int lotus){

        int m = 0;

        int n = lotus;

        int sum = 0;

        m = n/100;

        n  -= m*100;

        sum = m*m*m;

        m = n/10;

        n -= m*10;

        sum += m*m*m + n*n*n;

        if(sum==lotus)

            return true;

        else

            return false;

        }

}