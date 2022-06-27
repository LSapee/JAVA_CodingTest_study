package silver;

import java.util.*;

public class Num7785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<String> set = new HashSet<>();
        for(int i=0; i<n; ++i){
            String name = sc.next();
            String commute = sc.next();
            if(commute.equals("enter")){
                set.add(name);
            }else{
                set.remove(name);
            }
        }
        List<String> array = new ArrayList<String>(set);
        Collections.sort(array);
        ListIterator<String> s = array.listIterator(array.size());

        while(s.hasPrevious()){
            System.out.println(s.previous());
        }
    }
}
