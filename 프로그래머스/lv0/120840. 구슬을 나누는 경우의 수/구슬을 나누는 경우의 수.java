import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        int bs = balls - share;
        if(bs == 0)
            return 1;
        BigInteger bigBalls = new BigInteger(String.valueOf(balls));
		BigInteger bigShare = new BigInteger(String.valueOf(share));
		BigInteger bigBs = new BigInteger(String.valueOf(bs));
		for(int i = bs - 1; i > 0; i--)
			bigBs = bigBs.multiply(BigInteger.valueOf(i));
		for(int i = balls - 1; i > 0; i--)
			bigBalls = bigBalls.multiply(BigInteger.valueOf(i));
		for(int i = share - 1; i > 0; i--)
			bigShare = bigShare.multiply(BigInteger.valueOf(i));
		
		return bigBalls.divide(bigBs.multiply(bigShare)).intValue();
    }
}