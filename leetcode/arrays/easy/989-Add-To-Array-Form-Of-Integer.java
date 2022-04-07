class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                list.add((num[i] + k) % 10);
                k = (num[i] + k) / 10;
                i--;
            } else {
                list.add(k % 10);
                k = k / 10;
            }
        }
        Collections.reverse(list);
        return list;
    }
}