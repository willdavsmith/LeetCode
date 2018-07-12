public class CountingBits {
   public static int[] countBits(int num) {
      int[] nums = new int[num+1];
      for (int i=0; i<=num; i++) {
         String binInt = Integer.toBinaryString(i);
         int ones = 0;
         for (int j=0; j<binInt.length(); j++) {
            if (binInt.charAt(j) == '1') {
               ones++;
            }
         }
         nums[i] = ones;
      }
      return nums;
   }
}
