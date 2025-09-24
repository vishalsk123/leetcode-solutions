int maxProfit(int* prices, int pricesSize) {
    int p=0;
    int max=0;
    int min=prices[0];
    if(pricesSize==0) return 0;
    for(int i=1;i<pricesSize;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        else if(prices[i]-min>max){
            max=prices[i]-min;
        }
    }
    return max;
}