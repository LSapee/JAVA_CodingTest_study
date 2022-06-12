package JPCrank;

import java.util.*;

public class Num46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//test
        int n = sc.nextInt();

        String[] s = new String[n];
        int price[] = new int[n];
        for(int i=0; i<n; ++i){
            s[i] = sc.next();
        }
        int m = sc.nextInt();
        for(int i =0; i<m; ++i){
            String p = sc.next();
            int pri = sc.nextInt();
            for(int j=0; j<n; ++j){
                if(s[j].equals(p)){
                    price[j] += pri;
                }
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for(int i =0; i<n; ++i){
            map.put(s[i],price[i]);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for(Map.Entry<String, Integer> entry :entryList){
            System.out.println(entry.getKey());
        }
    }

}

