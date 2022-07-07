package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class power {

    String state;
    int energy;


    public power( String state,int energy) {
        this.state=state;
        this.energy=energy;
    }
}
public class Num19637 {
    static ArrayList<power> al = new ArrayList<>();
    static int n,m;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());

        // 각 상태을 측정할 전투력을 입력받아 리스트에 저장
        for(int i=0;i<n;i++) {
            st=new StringTokenizer(br.readLine()," ");
            String s=st.nextToken();
            int e=Integer.parseInt(st.nextToken());

            al.add(new power(s,e));
        }

        // 전투력을 입력받아 어떤 상태인지 출력
        for(int i=0;i<m;i++) {
            st=new StringTokenizer(br.readLine()," ");
            int e=Integer.parseInt(st.nextToken());

            sb.append(bS(e)).append("\n");
        }

        System.out.println(sb);
    }
    static String bS(int state){
        int s = 0;
        int end = al.size()-1;

        while(s<=end){
            int mid =(s+end)/2;

            if(state<=al.get(mid).energy)end=mid-1;
            else s=mid+1;
        }
        return al.get(end+1).state;
    }
}
/* 출처: https://subin-programming.tistory.com/241
개인적으로 틀렸던 부분 Scanner =>StringBuiler부분 StringBuiler 공부 부족
ArrayList로 사용하지 않고 배열 2개로 풀고 있었던점 배열로도 해보고 되면 다시 수정예정
* */