package Baekjoon.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 주유소
public class Baekjoon_13305 {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        int[] len = new int[n - 1];
        int[] cost = new int[n];

        StringTokenizer st = new StringTokenizer(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        for (int i = 0; i < n - 1; i++) {
            len[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(st2.nextToken());
        }

        long result = 0;
        int minPrice = cost[0];  // 첫 번째 도시의 가격으로 초기화

        for (int i = 0; i < n - 1; i++) {
            if (cost[i] < minPrice) {
                minPrice = cost[i];  // 더 저렴한 가격 발견 시 갱신
            }
            result += (long) minPrice * len[i];  // 최소 가격으로 거리만큼 비용 누적
        }

        System.out.print(result);
    }
}
