class ValidPalindrome {
    // Using lowercase two-pointers approach
    public boolean isPalindrome(String s) {
        if (s == null) return false; // Handle null case
        
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // Normalize string

        int i = 0;
        int j = s.length() - 1;

        while (i < j) { // Use i < j instead of i <= j for better efficiency
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

 class Main {
    public static void main(String[] args) {
        ValidPalindrome solution = new ValidPalindrome();
        
        // Test cases
        String[] tests = {
            "A man, a plan, a canal: Panama",
            "race a car",
            " ",
            "madam",
            "No lemon, no melon"
        };
        
        for (int i = 0; i < tests.length; i++) {
            System.out.println("Test " + (i + 1) + ": " + solution.isPalindrome(tests[i]));
        }
    }
}