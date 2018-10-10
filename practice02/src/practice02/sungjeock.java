package practice02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sungjeock {

	void print2console() throws IOException {
		// ���� �Է��� �ȳ��� ���� ���.		
		System.out.println("���� 5�� �Է�");
		
		// �ý��ۿ� �Է��� �ϱ� ���� ���� ����.
		Scanner input = new Scanner(System.in);
		
		// �Է� ���� Ƚ��
		int iter = 1;
		// ���Ͽ��� ���� �ҷ��ö� ������ ��ȯ�� ���� ���� ����.
		int iScore; 
		// ���Ͽ� �����ϱ� ���� ���ڿ� ����
		String sIn;
		// ���Ͽ��� ���� �ҷ� ������ ���� ���ڿ� ����.
		String sOut;
		
		// ���� ���� ���� ���� �� ���� �̸� ����.
		File file = new File("test.txt");
		
		// ���Ͽ� �����ϱ� ���� ��ü ����.
        FileWriter writer = null;		

        // ���Ͽ� �����ϱ� ���� ��ü�� ���� ��ġ ���� ���� ������ ����.
        writer = new FileWriter(file, false);
        
        // ������ �Է� �ޱ� ���� �ݺ���.
		while (iter < 6) {
			// ���� �Է��� ���° ���� �˷��ֱ� ���� ��¹�.
			System.out.printf("�����Է� %d : ", iter);
			// �Էµ� �����͸� ���ڿ��� ������.
			sIn = input.nextLine();
			// �Է� ���� �����Ϳ� �ٹٲ� ���ڸ� �߰��Ͽ� ���ۿ� ����. 
			writer.write(sIn +"\r\n");
			// ���۸� ���� ���Ͽ� ����.
	        writer.flush();
	        	        
	        // ���� ������ �ްų� while���� ���������� ���� ���� �� ����.
	        iter++;	        
		}
		
		System.out.println("���ϴݱ�");
		writer.close();
		
		// ���Ͽ��� ���� �о���� ���� ��ü ����.
		BufferedReader bReader = null;
		
		System.out.println("\n ���� ���� ���� ");
		// ���� ��ü�� �����б� ��ü���� �����Ѱ��� �ٽ� ���ۿ��� �о�ü� �ֵ��� �Ҵ�.
        bReader = new BufferedReader(new FileReader(file));
        
        // ���Ͽ��� �о�� ���� ���� �ľ�.
        iter = 1;
        
        // ���Ͽ��� ���̻� �о�� �� ���� ������ �ݺ�, 1�� ���ξ� �о��.
        while((sOut = bReader.readLine()) != null) {
        	// ���ۿ��� �о�� ���ڿ��� console�� ���.
            System.out.printf("%s : ", sOut);
            
            // ������ ���ڷ� ��ȯ.
            iScore = Integer.parseInt(sOut);
            
            System.out.printf("���Ͽ��� �о�� %d��° ", iter);
            
            // ������ �´� ���ǹ��� ����.
            if ( iScore > 90) {
    			System.out.println("������ A�Դϴ�.");
    		}
    		else if (iScore > 80) {
    			System.out.println("������ B�Դϴ�");
    		}
    		else if (iScore > 70) {
    			System.out.println("������ C�Դϴ�");
    		}
    		else if (iScore > 60) {
    			System.out.println("������ D�Դϴ�.");
    		}
    		else {
    			System.out.println("������ F�Դϴ�.");
    		}
            
            //���� �����͸� ���� ����.
            iter++;
        }
        
        // ������ �� �о������ bufferedreader, filereader�� ����.        
        bReader.close();   
	}
}
