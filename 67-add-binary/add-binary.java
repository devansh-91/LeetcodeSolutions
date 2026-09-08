class Solution {

    public String addBinary(String a, String b) {
        StringBuilder c = new StringBuilder();
        int carry = 0;
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        while (l1 >= 0 || l2 >= 0) {
            int n1 = 0;
            int n2 = 0;
            if (l1 >= 0) {
                n1 = a.charAt(l1) - '0';
            }
            if (l2 >= 0) {
                n2 = b.charAt(l2) - '0';
            }
            int n = n1 + n2 + carry;
            c.append(n % 2);
            carry = n / 2;
            l1--;
            l2--;
        }
        if (carry == 1) {
            c.append(1);
        }
        return c.reverse().toString();
    }
}