package neuedu.text;

public class Text8 {
    public static void main(String[] args) {
        int [][] arry = new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12,15,16}};
        System.out.println(arry[0][1]);
//        int [][] arry = new int[4][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int i=1;
        switch (i){
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 0:
                System.out.println("周日");
                break;
                default:
                    System.out.println("错误");
        }
    }
}
