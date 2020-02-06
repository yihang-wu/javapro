
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Text3 {
    public static void main(String[] args) {
        /*
         * 定义一个ArryList 和LinkList比较他们的读写和性能差异
         * */
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        Date startarray = new Date();//获取当前时间
        for (int i= 0;i<100000;i++){
            arrayList.add(i);
        }
        Date endarray = new Date();//结束时间
        System.out.println("ArryList add时间"+(endarray.getTime()-startarray.getTime()));//毫秒数
        Date startlinked = new Date();
        for (int i= 0;i<1000000;i++){
            linkedList.add(i);
        }
        Date endlinked = new Date();
        System.out.println("LinkedList add时间"+(endlinked.getTime()-startlinked.getTime()));
        //读取
        Date startreadarry =new Date();
        for(int i=0;i<arrayList.size();i++){
            Object object =arrayList.get(i);
        }
        Date endreadarry =new Date();
        System.out.println("ArryList读取时间"+(endreadarry.getTime()-startreadarry.getTime()));
        Date startreadlinked =new Date();
        for(int i=0;i<linkedList.size();i++){
            Object object =linkedList.get(i);
        }
        Date endreadlinked =new Date();
        System.out.println("LinkedList读取时间"+(endreadlinked.getTime()-startreadlinked.getTime()));
    }
}
