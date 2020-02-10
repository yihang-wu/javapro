package neuedu.text;

public class Text3 {
    public static void main(String[] args) {
        /*
         * 冒泡排序
         * */
//        int[] arry ={1,6,2,30,100,50,80,70,98};
//        for (int i=0;i<=arry.length-1;i++){
//            int cont=0;
//            for (int j=0;j<arry.length-1-i;j++){
//                if(arry[j]>arry[j+1]){
//                    int t=arry[j];
//                    arry[j]=arry[j+1];
//                    arry[j+1]=t;
//                    cont++;
//                }
//            }
//            if(cont++==0){
//                break;
//            }
//        }
//        for(int a:arry){
//            System.out.println(a);
//        }
        /*
         * 选择排序
         * */
    }

    /* 二分查找
     * */
    int[] array = new int[10000];

    //        for (int i; i < array.length; i++) {
//            array[i] = i + 1;
//        }
//        int a = 8000;
//        int index = search(array, a);
    /* 从array中找到value的索引*/
//        public static int find ( int[] array, int value){
//
//        }
    public static int search(int[] array, int value) {
        int min = 0;
        int max = array.length - 1;
        int mid;
        int cont = 0;
        while (min < max) {
            cont++;
            mid = (min + max) / 2;
            if (value == array[mid]) {
                System.out.println("查找了" + cont + "次");
            } else if (value < mid) {
                max = mid;
            } else if (value > mid) {
                min = mid;
            }
        }
        return -1;
    }

}