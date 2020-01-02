package 数组中的重复数字;

/**
 * Created by cheney on 2020/1/2.
 */
public class RepeatNum {

    private static int[] array = new int[]{9,8,8,6,5,4,3,2,1,0};

    public static void main(String[] args) {
        System.out.println(existSameNum(array));
    }
    //理解
    //因为长度为N 且数字在N-1内， 所以给数字排序,发现一个数字同时出现在两个位置，说明存在重复
    public static boolean existSameNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    System.out.println("存在重复数字");
                    return true;
                }
                int temp = array[i];
                array[i] = array[array[i]];
                array[temp] = temp;
            }
        }
        return false;
    }


}
