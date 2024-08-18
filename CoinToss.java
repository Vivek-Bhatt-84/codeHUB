public class CoinToss {
    public static void coinToss(int n, String res,int c) {
        
        if (n <= 0) {

            System.out.println(res);
            return;
        }
         
        if (c < 1) {   
            coinToss(n-1, res + "H",c+1);
        }
        coinToss(n - 1, res + "T",0);            
        
    }

    public static void main(String[] args) {
        int n = 3;
        coinToss(n, "",0);
    }
}
