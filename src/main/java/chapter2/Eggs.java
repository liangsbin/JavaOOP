package chapter2;

/**
 * 课后作业，蓝子里的鸡蛋个数。
 * 有一个问题，一筐鸡蛋：
         1个1个拿，正好拿完。
	     2个2个拿，还剩1个。
	     3个3个拿，正好拿完。
	     4个4个拿，还剩1个。
	     5个5个拿，还差1个。
	     6个6个拿，还剩3个。
	     7个7个拿，正好拿完。
	     8个8个拿，还剩1个。
	     9个9个拿，正好拿完。
   问框里最少有多少鸡蛋？

 * @author 梁胜彬
 * 2020-10-13
 *
 */
public class Eggs {
    public static void main(String[] args) {
        int i=1000;
        while(i>=9){
            if(i%9==0 && i%8==1 && i%7==0 && i%6==3 && i%5==1 && i%4==1 && i%3==0 &&i%2==1)
            {
                System.out.println(i);
                break;
            }
            i--;
        }
    }
}
