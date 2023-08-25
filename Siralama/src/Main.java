import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* 7 8 5 2 6 4 9 0 3 1
           7 5 2 6 4 8 0 3 1 9
           5 2 6 4 7 0 3 1 8 9
           2 5 4 6 0 3 1 7 8 9
           2 4 5 0 3 1 6 7 8 9
           2 4 0 3 1 5 6 7 8 9
           2 0 3 1 4 5 6 7 8 9
           0 2 1 3 4 5 6 7 8 9
           0 1 2 3 4 5 6 7 8 9
            */
        int[] array = {7,8,5,2,6,4,9,3,1,10,15,14,12,11,13,0};
        int tmp;
        int sayac=1;
        int i=0;
        for(; i < (array.length)- 1 ;){
            if (array[i] > array[i + 1]){
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                //i--;
            }
            i++;
            if(i==(array.length)- 1 && sayac!=(array.length)-1){
                i=0;
                sayac++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}