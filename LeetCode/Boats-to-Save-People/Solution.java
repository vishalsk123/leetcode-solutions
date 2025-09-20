class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int a=people.length;
        int l=0;
        int r=a-1;
        int c=0;
        for(l=0;l<=r;){
            if(people[l]+people[r]<=limit){
                l++;
                r--;
            }
            else{
                r--;
            }
            c++;
        }
        return c;
    }
}