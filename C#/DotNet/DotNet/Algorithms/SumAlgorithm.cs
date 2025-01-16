using System;

class SumAlgorithm
{

    static void Main()
    {
        // input : n명의 국어 점수
        int[] scores = { 100, 75, 50, 37, 90, 95 };
        int sum = 0;

        // process : 합계 알고리즘
        for (int i = 0; i < scores.Length; i++)
        {
            if (scores[i] >= 80)
            {
                sum += scores[i];
            }
        }

        // output
        Console.WriteLine($"{scores.Length}명의 점수 중 80점 이상의 총점 : {sum}");

    }
}

// 등차수열
class ArithmeticSequence
{
    static void Main2()
    {
        var sum = 0;

        for(int i = 1; i <= 20; i++)
        {
            if(i % 2 != 0)
            {
                sum += i;
            }
        }

        Console.WriteLine($"1부터 20까지의 홀수의 합 : ${sum}");

    }
}