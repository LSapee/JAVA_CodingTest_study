package level02;

public class JCase {
    public String solution(String s){
        String answer ="";
        s = s.toLowerCase();
        String ss[] = s.split("");
        StringBuilder sb = new StringBuilder();
        sb.append(ss[0].toUpperCase());
        for(int i=1; i<ss.length; ++i){
            if(ss[i-1].equals(" ") && !ss[i].equals(" ")){
                sb.append(ss[i].toUpperCase());
            }else{
                sb.append(ss[i]);
            }
        }
        answer = sb.toString();
        return  answer;
    }

    public static void main(String[] args) {
        JCase jc = new JCase();
        System.out.println(jc.solution("3people   unFollowed me"));
        System.out.println(jc.solution("for the last week"));
    }
}
