package neuedu.text;

public class Maopao {
    public static void main(String[] args) {
        int [] arry = {55,2,33,25,100,98,75};
        for (int i=0;i<arry.length-1;i++){
            for (int j=0;j<arry.length-1;j++){
                if (arry[j]>arry[j+1]){
                    int t=arry[j];
                    arry[j]=arry[j+1];
                    arry[j+1]=t;

                }
            }
        }
       /* for (int a=0;a<arry.length;a++){
            System.out.println(arry[a]);
        }*/
        for (int a:arry) {
            System.out.println(a);
        }
    }
}
