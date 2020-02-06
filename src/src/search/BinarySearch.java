package src.search;

/**
 * 二分查找，查找的接口统一定义成search方法，需要传入一个int[]的数组,返回该值出现的第一个下标的值
 * 思想是每次找中间的值，大了找左边数组，小了找右边数组
 *
 * @author goodtime
 * @create 2020-02-06 12:43 下午
 */
public class BinarySearch {
    public static int search(int[] array, int target) {
        //这里用循环实现，也可以用递归
        int low = 0;
        int high = array.length - 1;
        int middle = (low + high) / 2;
        while (low <= high) {
            if (array[middle] < target) {
                low = middle + 1;
                middle = (low + high) / 2;
            } else if (array[middle] > target) {
                high = middle - 1;
                middle = (low + high) / 2;
            } else {
                while (--middle >= 0 && array[middle] == target) {//用循环，返回有序数组中目标值的第一次出现
                    //注意middle<0的边界情况
                }
                return middle + 1;
            }
        }
        return -1;
    }

}
