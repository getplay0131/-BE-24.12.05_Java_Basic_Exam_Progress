//프로그래머스 = 옷가게 할인 받기
//내 답은 안되고 퍼온건 되네...?

package pack_241106_Exams;

public class pro_Ex10_self1 {
  public static void main(String[] args) {
      class Solution {
          public int solution(int price) {
              int answer = 0;
              if (price >= 500000) {
                  answer = (int)(price*0.8);
              } else if(price >= 300000){
                  answer = (int)(price*0.9);
              } else if (price >= 100000){
                  answer = (int)(price*0.95);
              } else {
                  answer = price;
              }
              return answer;
          }
      }

  }
}
