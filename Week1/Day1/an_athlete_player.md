# 구름톤 챌린지 1주차 학습일기

# 운동 중독 플레이어

![https://velog.velcdn.com/images/mini99/post/42504783-86a1-42ba-9f33-6fa9e9f406ef/image.png](https://velog.velcdn.com/images/mini99/post/42504783-86a1-42ba-9f33-6fa9e9f406ef/image.png)

![https://velog.velcdn.com/images/mini99/post/ade3fd63-24ee-4b19-aae1-2a6581615754/image.png](https://velog.velcdn.com/images/mini99/post/ade3fd63-24ee-4b19-aae1-2a6581615754/image.png)

![https://velog.velcdn.com/images/mini99/post/a4b0ee73-3aae-4643-a37d-366d094f896f/image.png](https://velog.velcdn.com/images/mini99/post/a4b0ee73-3aae-4643-a37d-366d094f896f/image.png)

```
import java.io.*;
class Main {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String input = br.readLine();

      String [] inputs = input.split(" ");

      double rm = Double.parseDouble(inputs[0]) * (1+ (Double.parseDouble(inputs[1])/30));
      System.out.println((int) Math.round(Math.floor(rm)));
   }
}

```

배운 점 : Scanner함수만을 사용해왔지만 Scanner가 아닌 다른 함수도 값을 받아올수 있다는 것을 알게 되었다. 또한 잘 사용하지 않고 있던 기본기를 더욱 강화 할 수있는 계기가 되었다.

느낀점 : 코딩의 세계는 다양하며 코딩에서 정답은 없다는 것을 알게 되었다.

어려웠던 점 : 문제를 잘못 이해하여 전체값에서 소수점을 버리는 것이 아닌 반복횟수를 30으로 나눈 후 소수점을 버려 어려움을 느꼈다