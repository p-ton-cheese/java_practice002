package practice02;

public class Diamond {
	
	public void print2console() {
		// ���̾Ƹ�� ����� ���� ���� ����.
		int iter3, iter4, iter5, iter6;
		
		System.out.println("");
		System.out.println("���̾Ƹ�� ���");
		System.out.println("");
		
		// *ǥ�÷� ���̾� ��� ��� �����.
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		//  *******
		//   *****
		//    ***
		//     *
		
		// ����� ǥ���ϱ� ���ؼ� � ����� ��������� ���� ��� �ʿ�.
		// �� ������ *�� �������� ���� ���� �Ͽ� ���ʿ� * �� �߰��� ������ �κ��� ����.
		// ��� ������ ���� ������ �������� ��, �Ʒ��� ����.
		
		// 1�� �ٹٲ��� ���� for�� - 5��° �ٱ��� ǥ��
		for (iter3 = 0; iter3 < 5; iter3++) {
			// 2�� ������ ������ ǥ���ϱ� ���� for�� - ������ ������ 4 ~ 0 ���� ����. 
			for (iter4 = 4 - iter3; iter4 > 0; iter4--) {
				System.out.printf(" ");
			}
			// 2�� * ����� ǥ���ϱ� ���� for�� - ���� *�� ������ 1 ~ 5 �� ����.
			for (iter5 = iter3; iter5 >= 0; iter5--) {
				System.out.printf("*");
			}
			// 2�� * ����� ǥ���ϱ� ���� for��. - ���� *�� ������ 0 ~ 4 �� ����.
			for (iter6 = 0; iter6 < iter3; iter6++) {
				System.out.printf("*");
			}
			// �ٹٲ�.
			System.out.println("");
		}
		
		// 1�� �ٹٲ��� ���� for��. - 6 ~ 9��° �ٱ��� ǥ��
		for(iter3 = 1; iter3 < 5; iter3++) {
			// 2�� ������ ������ ǥ���ϱ� ���� for��. ������ ������ 1 ~ 4���� ����
			for (iter4 = 0; iter4 < iter3; iter4++) {
				System.out.printf(" ");
			}
			// 2�� * ����� ǥ���ϱ� ���� for��. - ���� *�� ������ 4 ~ 1�� ����.
			for (iter5 = 5; iter5 > iter3; iter5--) {
				System.out.printf("*");
			}
			// 2�� * ����� ǥ���ϱ� ���� for��. - ���� *�� ������ 3 ~ 0 ���� ����.
			for (iter6 = 4; iter6 > iter3; iter6--) {
				System.out.printf("*");
			}
			// �ٹٲ�.
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
	}
}
