package FAQs;

public class TrappingRainwater {
    public int trap(int[] height) {

        int n = height.length;

        int total = 0;

        int leftMax = 0, rightMax = 0;

        int left = 0, right = n - 1;

        while (left < right) {

            if (height[left] <= height[right]) {

                if (leftMax > height[left]) {

                    total += leftMax - height[left];

                }
                else{
                    leftMax = height[left];
                }

                left = left + 1;
            }
            else
            {

                if (rightMax > height[right]) {

                    total += rightMax - height[right];

                }
                else{
                    rightMax = height[right];
                }

                right = right - 1;
            }
        }

        return total;
    }
}