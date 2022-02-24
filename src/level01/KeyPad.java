package level01;

public class KeyPad {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for(int i =0; i<numbers.length; i++){
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){
                answer += "L";
                left = numbers[i];
            }else if(numbers[i] == 3||numbers[i] == 6||numbers[i] == 9){
                answer += "R";
                right = numbers[i];
            }else{
                if(numbers[i] == 0){
                    numbers[i] = 11;
                }
                if(numbers[i] == right) {
                    answer += "R";
                }else if(numbers[i] == left){
                    answer += "L";
                }else{
                    int l = Math.abs(numbers[i]-left)/3 + Math.abs(numbers[i]-left)%3;
                    int r = Math.abs(numbers[i]-right)/3 + Math.abs(numbers[i]-right)%3;
                    if(l>r){
                        answer += "R";
                        right = numbers[i];
                    }else if(r>l){
                        answer += "L";
                        left = numbers[i];
                    }else{
                        if(hand.equals("right")){
                            answer +="R";
                            right = numbers[i];
                        }else if(hand.equals("left")){
                            answer +="L";
                            left = numbers[i];
                        }
                    }
                }

            }
        }

        return answer;
    }

    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();

        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";

        String result = keyPad.solution(numbers, hand);

        System.out.println(result);

    }
}
