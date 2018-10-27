package logs;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Zhucerizhi{

	public static void rizhi(String a) throws FileNotFoundException

	{
		
		FileOutputStream out = new FileOutputStream("C:\\rizhi.txt",true);
		   SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月-dd日 HH:mm:ss");//设置日期格式
	          String time = df.format(new Date());// new Date()为获取当前系统时间
	          String xie = time+"   "+a+"用户注册成功\r\n";
		

		// 将字符串转成字节数组

		byte b[] = xie.getBytes();

		try

		{

			// 将byte数组写入到文件之中

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

		// 以下为读文件操作

		InputStream in = null;

		try

		{

			in = new FileInputStream("C:\\rizhi.txt");

		}

		catch (FileNotFoundException e3)

		{

			e3.printStackTrace();

		}

		// 开辟一个空间用于接收文件读进来的数据

		byte b1[] = new byte[1024];

		int i = 0;

		try

		{

			// 将b1的引用传递到read()方法之中，同时此方法返回读入数据的个数

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

		// 将byte数组转换为字符串输出


	}

}