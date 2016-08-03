package nowcoder;

import java.util.Scanner;

/**
 * 该程序用来判断一个数是否为素数，若是则直接输出；反之则将该数输出为若干个素数相乘的格式。 如 89 则直接输出 89 如 20 则输出 20 = 2 x
 * 2 x 5
 *
 */

public class Prime {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		primeFactor(scanner);

	}

	private static void primeFactor(Scanner scanner) {

		int prime[] = new int[2000]; // 储存素数因子
		int index = 0;

		// 循环读取
		while (scanner.hasNextInt()) {

			int n = scanner.nextInt();
			// 输入 -1 则退出循环读取结束程序
			if (n == -1) {
				
				break;
				
			} else if (n == 1) {

				System.out.println("请输入大于1的数");

			} else if (isPrime(n)) {

				System.out.println(n);

			} else {

				int input = n;

				for (int i = 2; i <= Math.sqrt(n); i++) {

					if (n % i == 0) {
						prime[index++] = i;
						n = n / i;
						i = 1;
					}

					if (isPrime(n)) {
						prime[index++] = n;
						break;
					}

				}

				// 开始输出
				System.out.print(input + " = ");

				for (int i = 0; i < index; i++) {

					if (i == index - 1) {
						System.out.println(prime[i]);
					} else {
						System.out.print(prime[i] + " x ");
					}

				}
			}

			index = 0;

		}

	}

	// 判断一个数是不是素数
	private static boolean isPrime(int n) {

		if (n <= 3 && n != 1) {
			return true;
		} else if (n == 1) {
			return false;
		} else {

			for (int i = 2; i <= Math.sqrt(n); i++) {

				if (n % i == 0) {
					return false;
				}

			}
			return true;
		}

	}

}
