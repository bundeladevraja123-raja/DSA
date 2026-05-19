import java.util.*;
public class indexdef1 {
//    public static int vv(int[] arr,int t,int i){
//        for(i=0; i<5; i++)
//        {
//            if(arr[i]==t)return (i);
//
//        }
//        for(i=0; i<5; i++)
//        {
//            if(arr[i]>t)return (i);
//        }
//        return 5;
//    }
//
//    public static void main(String[] args) {
//        int[] arr= {1,3,4,5,6};
//        int t=6,i=0;
//        int a = vv(arr, t, i);
//        System.out.println(a);
//    }}
public static void main(String[] args){
int arr[]={1,3,4,6,9,10};
int n=arr.length;
int left=0;
int right= n-1;
int tar=8;
while(left<=right){
    int mid=(left+right)/2;
    if(arr[mid]==tar){
        System.out.println(mid);
    }
    else if(arr[mid]<tar){
        left=mid+1;
    }
    else
        right=mid-1;
}
    System.out.println(left);
}
}


