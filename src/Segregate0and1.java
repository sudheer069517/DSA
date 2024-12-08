import java.util.Arrays;

public class Segregate0and1 {

    //Geeks for geeks - Segregate 0s and 1s with O(N) time complexity
    void segregate0and1(int[] arr){

        int length = arr.length;
        int index = 0;
        int ridx = length-1;

        while(index <= ridx){
            if(arr[index] == 1){
                if(arr[ridx] == 1){
                    ridx--;
                }else{
                    int temp = arr[ridx];
                    arr[ridx] = 1;
                    arr[index] = temp;
                    ridx--;
                    index++;
                }
            }else {
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Segregate0and1 segregate0and1 = new Segregate0and1();
        segregate0and1.segregate0and1(new int[]{0, 0, 0, 1, 0});
        //segregate0and1.segregate0and1(new int[]{1, 1, 1, 1}, 4);
    }
}
