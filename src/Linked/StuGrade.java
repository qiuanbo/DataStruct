package Linked;
import java.io.*;
public class StuGrade {
    public static void main(String[] args) throws IOException {
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		int num;
		String name;
		int score;
		
		System.out.println("������5��ѧ�����ݣ�");
		LinkedList list = new LinkedList();
		for(int i=1;i<6;i++) {
			System.out.println("������ѧ�ţ�");
			num = Integer.parseInt(buf.readLine());
			System.out.println("������������");
			name = buf.readLine();
			System.out.println("������ɼ���");
			score = Integer.parseInt(buf.readLine());
			list.insert(num,name,score);
			System.out.println("-----------");
		}
		System.out.println("ѧ���ɼ�");
		System.out.println("ѧ�������ɼ�==========");
		list.print();
	}
}
