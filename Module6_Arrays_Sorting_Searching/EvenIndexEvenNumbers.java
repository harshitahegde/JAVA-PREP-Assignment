public class EvenIndexEvenNumbers {

    public static void main(String[] args) {

        int arr[] = {3,6,12,1,5,8};

        for(int i=0;i<arr.length;i+=2){

            if(arr[i]%2!=0){

                for(int j=1;j<arr.length;j+=2){

                    if(arr[j]%2==0){

                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }
        }

        for(int x:arr)
            System.out.print(x+" ");
    }
}