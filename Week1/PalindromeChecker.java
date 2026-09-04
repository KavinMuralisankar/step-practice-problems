public class PalindromeChecker {
    static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left++) != text.charAt(right--)) return false;
        }
        return true;
    }

    static boolean isPalindromeRecursive(String text) {
        return isPalindromeRecursive(text, 0, text.length() - 1);
    }

    static boolean isPalindromeRecursive(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return isPalindromeRecursive(text, left + 1, right - 1);
    }

    static boolean isPalindromeArrayReversal(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            char temp = chars[i]; chars[i] = chars[j]; chars[j] = temp;
        }
        return text.equals(new String(chars));
    }

    public static void main(String[] args) {
        String text = "madam";
        System.out.println("Iterative: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array Reversal: " + (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome"));
    }
}
