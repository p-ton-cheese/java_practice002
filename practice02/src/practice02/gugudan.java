package practice02;

public class gugudan {

	void print2console() {
		// �������� ǥ���ϱ� ���� ������ ���� 2�� ����
		int iter1, iter2;
		
		System.out.println("");
		System.out.println("������");
		System.out.println("");
		
		// �������� ���η� ǥ��
		// 1�� ���� 2~9�ܱ��� ǥ���ϱ� ���� for�� 
		for (iter1 = 2; iter1 < 10; iter1++) {
			// 2�� ���� ��� 1~9���� ǥ���ϱ� ���� for��
			for (iter2 = 1; iter2 < 10; iter2++) {
				// X * X = X �� console�� ǥ�� �ϱ� ���� print. 
				System.out.printf("%2d X %2d = %2d\t", iter1, iter2, iter1*iter2);				
			}
			// �ٹٲ��� �ϱ� ���� println.
			System.out.println("");
		}
		
		// ����� �Ʒ��� ����.
		// 2*1=2 2*2=4 .... 2*9=18
		// 3��
		// ...
		// 9��
		
		System.out.println("");
		System.out.println("");
	}
}
