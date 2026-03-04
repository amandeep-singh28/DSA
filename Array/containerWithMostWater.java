public class containerWithMostWater {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while (left < right) {
            if (arr[left] < arr[right] || arr[left] == arr[right]) {
                int newArea = arr[left] * (right - left);
                left++;
                if (newArea > maxArea) maxArea = newArea;
            } else {
                int newArea = arr[right] * (right - left);
                right--;
                if (newArea > maxArea) maxArea = newArea;
            }
        }
        return maxArea;
    }
}
