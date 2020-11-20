import java.util.Arrays;
import java.util.Scanner;

public  class ArrayDemo{
    public static void main(String[] args) {
        System.out.println("请输入10位数字：");
        int [] a=new int[10];
        for(int i=0;i<a.length;i++){
            Scanner sc=new Scanner(System.in);
            int b=sc.nextInt();
            if(b!=-1){
                a[i]=b;
            }else{
                break;
            }
        }
        System.out.println("排序前："+arrayToString(a));
        // Sort(a);
        // System.out.println("排序后："+arrayToString(a));
        System.out.println("-------------");
        Arrays.sort(a);
        System.out.println("排序后："+arrayToString(a));

    }
    public static String arrayToString ( int[] arr){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }

        }
        sb.append("]");
        String s=sb.toString();
        return s;

    }

public static void Sort(int [] a) {
    for(int i=0;i<a.length-1;i++){
        for(int j=0;j<a.length-1-i;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
}

}
