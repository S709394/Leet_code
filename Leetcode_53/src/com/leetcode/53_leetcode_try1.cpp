//CPP version 
// PS: have not tested
int maxProfit(vector<int>& prices) {
  int res =0;
  for (int i=1 ;i<prices.size(); i++){
    //version 1
    if(prices[i]>prices[i-1])
    {
      res+= prices [i] - prices[i-1];
    }
  }
  return res;
}
