package practice02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Sungjuk class 
public class Sungjuk {

	// ���� �б� �޼ҵ�
	private void file2read() throws IOException {
		
		// ���Ͽ��� �޾ƿ��� ������ ������ �ľ��ϱ� ���� ����.
		int iter;
		// ���Ͽ��� ���� �ҷ��ö� ������ ��ȯ�� ���� ���� ����.
		int iScore; 
		// ���Ͽ��� ���� �ҷ� ������ ���� ���ڿ� ����.
		String sOut;

		// ���� ���� ���� ���� �� ���� �̸� ����.
		File file = new File("test1.txt");
		
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
            grade(iScore);
            
            //���� �����͸� ���� ����.
            iter++;
        }
        
        // ������ �� �о������ bufferedreader, filereader�� ����.        
        bReader.close();  
	}

	// ���Ͽ� �����ϴ� �޼ҵ�.
	private void file2write(String strIn) throws IOException {
		
		// ���� ���� ���� ���� �� ���� �̸� ����.
		File file = new File("test1.txt");
		
		// ���Ͽ� �����ϱ� ���� ��ü ����.
        FileWriter writer = null;		

        // ���Ͽ� �����ϱ� ���� ��ü�� ���� ��ġ ���� ���� ������ ����.
        writer = new FileWriter(file, false);
        
		// �Է� ���� �����Ϳ� �ٹٲ� ���ڸ� �߰��Ͽ� ���ۿ� ����. 
		writer.write(strIn);
		
		// ���۸� ���� ���Ͽ� ����.
	    writer.flush();

	    // ���� �ݱ�.
		writer.close();
		System.out.println("���ϴݱ�");
	}
	
	// ������ �������� �����ؼ� console â�� ǥ���ϴ� �޼ҵ�.
	private void grade(int iIn) {
		// ������ �´� ���ǹ��� ����.
        if ( iIn > 90) {
			System.out.println("������ A�Դϴ�.");
		}
		else if (iIn > 80) {
			System.out.println("������ B�Դϴ�");
		}
		else if (iIn > 70) {
			System.out.println("������ C�Դϴ�");
		}
		else if (iIn > 60) {
			System.out.println("������ D�Դϴ�.");
		}
		else {
			System.out.println("������ F�Դϴ�.");
		}
	}
	
	// ������ �Է¹޴� �޼ҵ�
	private String inSungjuk() {
		// �ý��ۿ� �Է��� �ϱ� ���� ���� ����.
		Scanner input = new Scanner(System.in);
		
		// �Է� ���� Ƚ��
		int iter = 1;
		// ���Ͽ� �����ϱ� ���� ���ڿ� ����
		String sIn = "";
				
		// ������ �Է� �ޱ� ���� �ݺ���.
		while (iter < 6) {
			// ���� �Է��� ���° ���� �˷��ֱ� ���� ��¹�.
			System.out.printf("�����Է� %d : ", iter);
			// �Էµ� �����͸� ���ڿ��� ������.
			sIn += input.nextLine() + "\r\n";
			// �Է� ���� �����Ϳ� �ٹٲ� ���ڸ� �߰��Ͽ� ���ۿ� ����.

	        // ���� ������ �ްų� while���� ���������� ���� ���� �� ����.
	        iter++;	        
		}
		
		// ���Ͽ��� �о�� ��� �����͸� return
		return sIn;
	}
	
	// �ܼ�â�� ������ �Է� �� ����ϴ� �޼ҵ�, �ܺ� ���� ����.
	public void print2console() {
		
		// ���� �Է��� �ȳ��� ���� ���.		
		System.out.println("���� 5�� �Է�");
		
		// ���� �Է�.
		String sIn = inSungjuk();
		
		try {
			//���� ����.
			file2write(sIn);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file2write error!!");
		}
		
		try {
			// ���� �б�
			file2read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("file2read error!!");
		}
		
	}
}