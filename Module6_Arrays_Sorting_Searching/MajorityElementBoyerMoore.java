public class MajorityElementBoyerMoore {

    public static void main(String[] args) {

        int arr[] = {2,2,1,1,2,2,2};

        int candidate = 0;
        int count = 0;

        for(int x : arr){

            if(count==0)
                candidate = x;

            if(x==candidate)
                count++;
            else
                count--;
        }

        System.out.println("Majority element = "+candidate);
    }
}