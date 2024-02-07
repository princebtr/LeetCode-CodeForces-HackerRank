package leetcode;

public class Candy {
    public int candy(int[] ratings) {

        int n = ratings.length;
        int[] candy = new int[n];
        Arrays.fill(candy,1);
        int sum = 0;

        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] + 1;
            }
        }

        for(int j=n-2;j>=0;j--){
            if(ratings[j] > ratings[j+1]){
                candy[j] = Math.max(candy[j], candy[j + 1] + 1);
            }
        }

        for(int k=0;k<n;k++){
            sum += candy[k];
        }

        return sum ;
    }
}
