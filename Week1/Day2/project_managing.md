# 구름톤 1주차 학습 일기 2일차

# 프로젝트 매니징

![https://velog.velcdn.com/images/mini99/post/c973fc6b-2715-4cff-8f27-080a7491bd8d/image.png](https://velog.velcdn.com/images/mini99/post/c973fc6b-2715-4cff-8f27-080a7491bd8d/image.png)

![https://velog.velcdn.com/images/mini99/post/2482656c-09af-4add-a238-f1b4cd4a2166/image.png](https://velog.velcdn.com/images/mini99/post/2482656c-09af-4add-a238-f1b4cd4a2166/image.png)

![https://velog.velcdn.com/images/mini99/post/b6d6d2bf-18b6-4df7-a629-f1085135883d/image.png](https://velog.velcdn.com/images/mini99/post/b6d6d2bf-18b6-4df7-a629-f1085135883d/image.png)

코드

```
import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		String [] timess = br.readLine().split(" ");
		int [] times = new int[2];
		times[0] = Integer.parseInt(timess[0]);
		times[1] = Integer.parseInt(timess[1]);
		int time = (times[0]*60)+times[1];
		for(int i=0; i<Integer.parseInt(input); i++){

			int a = Integer.parseInt(br.readLine());

			time +=a;

			  // if(a<=60){
			  // times[1] = times[1]+a;
			  // if(times[1]>=60){
			  // times[0]=times[0]+1;
			  // times[1]=times[1]-60;
			  // if(times[0]>=24){
			  // times[0]=times[0]-24;
			  // }
			  // }
			  // }else{
			  // times[0]=times[0]+(a/60);
			  // times[1] = times[1]+(a%60);
			  // if(times[1]>=60){
			  // times[0]=times[0]+1;
			  // times[1]=times[1]-60;
			  // if(times[0]>=24){
			  // times[0]=times[0]-24;
			  // }
			  // }
			  // }

		}
		times[0]=time/60;
		times[1]=time%60;
		if(times[0]>24){
			times[0]=times[0]%24;
		}
		System.out.println(times[0]+" "+times[1]);
	}
}

```

블로그에 배운 점, 느낀 점, 어려웠던 점 등 학습 일기 작성하기

배운점 : Scanner와 다르게 BufferedReader br = new BufferedReader(new InputStreamReader([System.in](http://system.in/)));을 사용하면 br.readLine()만 사용하면 다음 들어오는 입력값을 받아 쓸 수 있다는 사실을 알게 되었다.

느낀 점 : 중간에 주석 처리한 코드가 처음 구상했던 코드이다 하지만 더 간단하고 쉽게 코딩을 할 수 있는 방법이 있어 그 방법대로 하고 코딩을 할 때 조금 더 생각하고 코딩을 하면 간결하게 짤 수 있게 되었다.

어려웠던 점 : br.readLine()을 사용하기 위해서는 다시 br을 선언해줘야 한다는 틀에 박혀 새로 변수를 선언해주어 가져와서 사용해 테스트에서 값이 들어오지 않았다. 한번 선언 해놓으면 그럴 필요없이 br.readLine()만 사용하면 된다는 사실을 알게 되고 코드를 간결하게 짤수 있게 되었다