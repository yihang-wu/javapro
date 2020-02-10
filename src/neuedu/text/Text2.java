package neuedu.text;

public class Text2{
    public static void main(String[] args) {
            /*
            * 从1 2 3 4中取3个数不同的组合
            * */
//            int [] arry ={1,2,3,4};
//            for(int i:arry){
//                for (int j:arry){
//                    for(int k:arry) {
//                        if(i!=j&&i!=k&&j!=k){
//                            System.out.println(i*100+j*10+k);
//                        }
//                    }
//                }
//
//            }



//          int arry[]={1,2,3,4};
//          for(int i=1;i<5;i++) {
//              for (int j = 1; j < 5; j++) {
//                  for (int k = 1; k < 5; k++) {
//                      if (i != j && i != k && j != k) {
//                          int num = i * 100 + j * 10 + k;
//                          System.out.println(num);
//                      }
//                  }
//              }
//          }
        /*
        for (int i=0;i<arry.length;i++){
            int a=arry[i];
            System.out.println(a);
        }*/
        /*
        增强for
           for(int a : arry){

            System.out.println(a);
        }
        * */
        /*
        1到100偶数和
        */
        int sum=0;
        for (int i=0;i<101;i++){
            if (i%2==0){
                sum=sum+i;
            }

        }
        System.out.println(sum);
        /*
        * 水仙花数100-999
        * 因为水仙花数都是3位数，所以可以使用100到999的循环逐个进行判断，
        * 将三位数n除以100，便可得到百位i；将n减去百位i100，然后再除以10便可求得十位j；
        * 再用n减去百位i100再减去十位j*10，得到个位数k。
        * 最后判断百位i的三次方加十位j的三次方加个位k的三次方是否与原来的数n相等，
        * 若相等则输出该数，否则继续循环，n++。
        * * */
//        int i,j,k,n;
//        for(n=100;n<1000;n++){
//            i=n/100;
//            j=(n-i*100)/10;
//            k=n-i*100-j*10;
//            if(i*i*i+j*j*j+k*k*k==n){
//                System.out.println(n);
//            }
//        }

        /*
        *  定义两个int变量m和n 计算m的n次方
        * */
        /*
        int m=2;
        int n=3;
        int i=1;
        for(int x=0;x<n;x++){
//            i=i*m;
            i*=m;
        }
        System.out.println(i);
        /*
        * 计算两个数的最大公约数和最小公倍数
        * */
        int a=100,b=20;
        int max=1;//初始值设为1
        int min =max(a,b);
        for(int q=1;q<=a&&q<=b;q++){
            if(a%q==0&&b%q==0){
                max=q;
            }
        }
        for (int i=min;i<=a*b;i++){
            if(i%a==0&&i%b==0){
                min=i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
     /* 三目运算符
        * 表达式？如果成立返回：如果不成立返回
        * */
    public static int max(int s,int d){
            return (s>d)?s:d;
    }
}
