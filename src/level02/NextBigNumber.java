package level02;

public class NextBigNumber {
    public int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        long a = s.chars().filter(c->c=='1').count();
        int m =n;
        int k = 2;

        while(true){
            if(m%2==0){
                n=n+1;
                m=n;
            }else{
                m=n+k;
            }
            String ss = Integer.toBinaryString(m);
            long b = ss.chars().filter(c->c=='1').count();
            k = k*2;
            if(a==b){
                break;
            }
        }
        answer = m;
        return answer;
    }

    public static void main(String[] args) {
        NextBigNumber nbn = new NextBigNumber();
        System.out.println(nbn.solution(78));
        System.out.println(nbn.solution(15));
    }
}
