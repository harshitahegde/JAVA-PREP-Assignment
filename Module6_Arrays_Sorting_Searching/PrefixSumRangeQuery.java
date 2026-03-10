public class PrefixSumRangeQuery {

    public static void main(String[] args) {

        int data[] = {3, 5, 7, 9, 11};

        int prefix[] = new int[data.length];

        prefix[0] = data[0];

        for(int i = 1; i < data.length; i++) {
            prefix[i] = prefix[i-1] + data[i];
        }

        int left = 1;
        int right = 3;

        int result = prefix[right] - prefix[left-1];

        System.out.println("Sum between index " + left + " and " + right + " = " + result);
    }
}