package neuedu.text;

public class Myarry {
    //作为存储数据的数组
    private int [] arry;
    //作为实际放入数组中的个数
    private int size;
    public Myarry(){
        size = 0;
        arry = new int [10];
    }
    public int getSize(){
        return size;
    }
    public void add(int i){
        //如果存放的个数大于数组的长度，则需要扩容
        if(size>=arry.length){
            //扩大容量的方式  定义一个更大的数组，把之前的数组放进去   一般情况下扩大1.5倍
            int [] newarry = new int [size+size/2];
            for(int j=0;j<arry.length;j++){
                newarry[j]=arry[j];
            }
            arry = newarry;
            System.out.println("扩容完成，新数组长度为"+arry.length);
        }
        arry[size++]=i;
    }
    //通过读取下标值
    public  int get(int i){
        //取值范围0---size-1
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return arry[i];
    }
}
