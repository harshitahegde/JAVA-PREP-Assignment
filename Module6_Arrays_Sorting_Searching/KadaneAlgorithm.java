public class KadaneAlgorithm {

    public static void main(String[] args) {

        int numbers[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int current = 0;
        int best = numbers[0];

        for(int value : numbers) {

            current = current + value;

            if(current > best) {
                best = current;
            }

            if(current < 0) {
                current = 0;
            }
        }

        System.out.println("Largest subarray sum is: " + best);
    }
}