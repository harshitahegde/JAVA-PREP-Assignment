public class SearchRotatedSortedArray {

    public static void main(String[] args){

        int arr[]={4,5,6,7,0,1,2};
        int key=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==key){
                System.out.println("Found at index "+i);
                return;
            }
        }

        System.out.println("Not found");
    }
}