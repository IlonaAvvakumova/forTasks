package tasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class LeetCode_349 {

    static public int[] intersection(int[] nums1, int[] nums2) {
        //First decision
//        Integer[] boxedArray = IntStream.of(nums1).boxed().toArray(Integer[]::new);
//        Integer[] boxedArray2 = IntStream.of(nums2).boxed().toArray(Integer[]::new);
//        Set<Integer> mySet = new HashSet(Arrays.asList(boxedArray));
//        Set<Integer> mySet2 = new HashSet(Arrays.asList(boxedArray2));
//        mySet.retainAll(mySet2);
//        int[] array = mySet.stream().mapToInt(Integer::intValue).toArray();
//  return array;
        //Second decision
        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums1)
                .forEach(set::add);
        return Arrays.stream(nums2)
                .filter(set::contains)
                .distinct()
                .toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] union = intersection(nums1, nums2);
        for (int un : union) {
            System.out.println(un);
        }
    }
}
