package Tasks;

public class Task18_ReverseaString {
    public static void main(String[] args) {
        String originalString = "Karthick Udayakumar";
        char[] chars = originalString.toCharArray();
        int left = 0, right = originalString.length() - 1;
        while(left < right)
        {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right --;
        }

        String reversed = new String(chars);
        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + reversed);
    }
}
