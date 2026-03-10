public class DifferenceArrayRangeUpdate {

    public static void main(String[] args) {

        int arr[] = {10,20,30,40,50};
        int n = arr.length;

        int diff[] = new int[n];

        diff[0] = arr[0];

        for(int i=1;i<n;i++)
            diff[i] = arr[i] - arr[i-1];

        int l=1,r=3,val=5;

        diff[l] += val;

        if(r+1 < n)
            diff[r+1] -= val;

        arr[0] = diff[0];

        for(int i=1;i<n;i++)
            arr[i] = arr[i-1] + diff[i];

        for(int x : arr)
            System.out.print(x+" ");
    }
}