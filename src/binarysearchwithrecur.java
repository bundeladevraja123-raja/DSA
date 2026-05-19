

public class binarysearchwithrecur {
    static void main(String[] args) {
int []arr={1,2,3,4,5,7};
int target=3;
        System.out.println(Bs(arr,target,0, arr.length-1));
    }
    static int Bs(int []arr,int target,int s,int e){

        if(s>e){
            return -1;
        }
        int m=(s+e)/2;

        if(target==arr[m]){
            return m;
        }
if(target<arr[m]){
    Bs(arr,target,s,m-1);
}
return Bs(arr,target,m+1,e);

    }
}
