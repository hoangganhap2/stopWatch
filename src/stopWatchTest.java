public class stopWatchTest {
    public static void main(String[] args) {
        int arr[] = new int[100000];
        for ( int i = 0; i <100000 ; i++) {
            for ( int j = 0; j < 100000; j++){
                arr[i] = (int) (Math.random()*100000);
            }
        }
        stopWatch stop_Watch = new stopWatch();
        stop_Watch.start();
        for ( int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        stop_Watch.end();
        System.out.println(stop_Watch.getElapsedTime());
    }
}
