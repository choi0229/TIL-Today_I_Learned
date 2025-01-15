using System;

// 배열의 평균값
/*
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]                 5.5
[89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]    94.0
*/
public class Lv0_1
{
    public double solution(int[] numbers)
    {
        double answer = 0;
        int count = numbers.Length;
        for (int i = 0; i < numbers.Length; i++)
        {
            answer += numbers[i];
        }
        answer /= (double)count;
        return answer;
    }
}


// 짝수 홀수 개수
/*
[1, 2, 3, 4, 5] [2, 3]
[1, 3, 5, 7]    [0, 4]
*/
public class Lv0_2
{
    public int[] solution(int[] num_list)
    {
        int[] answer = new int[2];

        for (int i = 0; i < num_list.Length; i++)
        {
            if (num_list[i] % 2 == 0)
            {
                answer[0]++;
            }
            else
            {
                answer[1]++;
            }
        }
        return answer;
    }
}

