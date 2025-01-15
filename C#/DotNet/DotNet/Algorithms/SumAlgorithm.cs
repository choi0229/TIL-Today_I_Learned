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