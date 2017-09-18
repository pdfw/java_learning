package discontinued_numbers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class app {
    public static void main(String[] args)
    {
        long startTime = System.currentTimeMillis();   //获取开始时间
        long[] randoms = new long[1000];
        int count = 0;
        for(int i = 0; i < 1000;i++) {
            randoms[i] = Math.round(Math.random()*10+count); //获取特定间隔内的随机数
            count += 10; //将间隔向前移动10
        }

        long endTime = System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
        System.out.println(Arrays.toString(randoms));

//        int[] values=new int[1000];
//        long startTime= System.currentTimeMillis();
//        Random random=new Random();
//        for(int x=0;x<1000;x++)
//        {
//            values[x]=x*10+random.nextInt(9);
//        }
//        long endTime= System.currentTimeMillis();
//
//        System.out.println("Learning1_1处理时间 ：" +(endTime-startTime));
//        System.out.println(Arrays.toString(values));
    }
}
