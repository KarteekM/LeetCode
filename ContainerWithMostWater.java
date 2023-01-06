public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int maxArea = 0;

        if(height.length < 2){
            return maxArea;
        }

        int left = 0;
        int right = height.length-1;
        while(left < right ){
            int area = (right - left) * (Math.min(height[left], height[right]));
            maxArea = Math.max(maxArea,area);
            if(height[left] < height[right]){
                left++;
            }
            else if(height[left] > height[right]){
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return  maxArea;
    }
}
