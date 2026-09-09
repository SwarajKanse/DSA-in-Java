class Solution {
  public void printX(int X, int N) {
    for (int i = 0; i < N-1; i++) 
        System.out.print(X + " ");
    if(N>=1)
        System.out.println(X);
  }
}
