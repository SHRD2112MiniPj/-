package �̴�������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �������� {

	public static void main(String[] args) {

		int[] a = { 94, 114, 105, 101, 110, 100 }; // Friend
//		int[] b = { 82, 105, 118, 97, 108 }; // Rival
//		int[] c = { 76, 111, 118, 101 }; // Love
//		int[] d = { 76, 97, 98, 111, 114 }; // Labor
//		int[] e = { 77, 111, 110, 101, 121 }; // Money

		// int count = 0; //������ Ʋ��Ƚ��

//		String[] ���� = { "Labor", "Rival", "Love", "Friend", "Money" };

		getRandom(a);
		getQ("Friend");
//		getRandom(b);
//		getQ("Rival");
//		getRandom(c);
//		getQ("Love");
//
//		getRandom(d);
//		getQ("Friend");
//		getRandom(e);
//		getQ("Money");

	}

	public static void getRandom(int[] array) {

		Random random = new Random();
		int[] array1 = new int[array.length];
		int x = 0;

		for (int i = 0; i < array1.length; i++) {
			x = random.nextInt(array1.length);

			array1[i] = array[x];

			for (int j = 0; j < i; j++) {
				if (array1[i] == array1[j]) {
					i--;
				}
			}
		}
		for (int j = 0; j < array1.length; j++) {
			System.out.print(array1[j] + " ");
		}

	}

	public static void getQ(String right) {

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("�ƽ�Ű�ڵ带 �˻��Ͽ� �� �ѹ��� �ص��Ͻÿ�");
		String Q = sc.next();
		if (Q.equals(right)) {
			System.out.println("�����!");
			System.out.println("��Ʈ�� ȹ�� �߽��ϴ�");

		} else {

			System.out.println("�����̴�");
			System.out.println("��Ʈ�� ȹ������ ���ߴ�...");

		}

	}

}
