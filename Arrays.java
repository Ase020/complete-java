public class Arrays {
    public static void main(String[] args){
        int[] nums = {12,34,67,98};
        nums[1] = 6; // 6
//      OR
        int[] nums2 = new int[4];
        nums2[0] = 1;
        nums2[1] = 23;
        nums2[2] = 568;
        nums2[3] = 1000;

        for (int i = 0; i < nums2.length; i++) {
//            System.out.println(nums2[i]);
        }

        int[][] nums3 = new int[3][4];
        Math.random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums3[i][j] = (int)(Math.random() * 100);
//                System.out.print(nums3[i][j] + " ");
            }
//            System.out.println();
        }

        for (int[] n: nums3){
            for (int m:n){
//                System.out.println(m + " ");
            }
//            System.out.println();
        }

    }
}
