package bronze;

public class ASdsad {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int all =5;
        int n =1;
        int r = -1;
        int b = 0;
        int t =1;

        for(int i=5; i>0;i--){
            for(int j =0; j<all; j++){
                r += t;
                a[b][r] = n;
                n++;
            }
            all--;
            for(int j=0; j<all; j++){
                b += t;
                a[b][r] = n;
                n++;
            }
            t = t*(-1);
        }

        for(int i =0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.printf("%02d ",a[i][j] );
            }
            System.out.println("mac tests");
        }

    }
}
