package logs;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zhucerizhi{

	public static void rizhi(String a) throws FileNotFoundException

	{
		
		FileOutputStream out = new FileOutputStream("C:\\rizhi.txt",true);
		   SimpleDateFormat df = new SimpleDateFormat("yyyy��MM��-dd�� HH:mm:ss");//�������ڸ�ʽ
	          String time = df.format(new Date());// new Date()Ϊ��ȡ��ǰϵͳʱ��
	          String xie = time+"   "+a+"�û�ע��ɹ�\r\n";
		

		// ���ַ���ת���ֽ�����

		byte b[] = xie.getBytes();

		try

		{

			// ��byte����д�뵽�ļ�֮��

			out.write(b);

		}

		catch (IOException e1)

		{

			e1.printStackTrace();

		}

		try

		{

			out.close();

		}

		catch (IOException e2)

		{

			e2.printStackTrace();

		}

		// ����Ϊ���ļ�����

		InputStream in = null;

		try

		{

			in = new FileInputStream("C:\\rizhi.txt");

		}

		catch (FileNotFoundException e3)

		{

			e3.printStackTrace();

		}

		// ����һ���ռ����ڽ����ļ�������������

		byte b1[] = new byte[1024];

		int i = 0;

		try

		{

			// ��b1�����ô��ݵ�read()����֮�У�ͬʱ�˷������ض������ݵĸ���

			i = in.read(b1);

		}

		catch (IOException e4)

		{

			e4.printStackTrace();

		}

		try

		{

			in.close();

		}

		catch (IOException e5)

		{

			e5.printStackTrace();

		}

		// ��byte����ת��Ϊ�ַ������


	}

}