package silver;

import java.util.*;

public class Num14713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        String a = sc.nextLine();
        String answer ="";
        ArrayList<Queue> al = new ArrayList<>();
        for(int i=0; i<n; ++i){
            a = sc.nextLine();
            String k[] = a.split(" ");
            Queue<String> q = new LinkedList<>();
            for(int j =k.length-1; j>=0; --j){
                q.add(k[j]);
            }
            al.add(q);
            System.out.println(a);
        }
        String s= sc.nextLine();
        String ss[] = s.split(" ");
        ArrayList<String> al2 = new ArrayList<>(Arrays.asList(ss));

        int count=0;
        while(al2.size()>0){
            for(int i=0; i<al.size(); ++i){
                if(al2.get(al2.size()-1).equals(al.get(i).peek())){
                    al2.remove(al2.size()-1);
                    al.get(i).poll();
                    count=0;
                    i=i-1;
                    if(al2.size()==0){
                        break;
                    }
                }else {
                    ++count;
                }
                if(count>=n){
                    break;
                }
            }
            if(count>=n){
                break;
            }
        }
        if(count>=n){
            System.out.println("Impossible");
        }else{
            System.out.println("Possible");
        }
    }
}
