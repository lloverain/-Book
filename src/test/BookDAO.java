package test;

import java.util.List;

public interface BookDAO {
	//ͼ��is
	List<BookDO> getBooksByIsbn(String isbn);
	//ͼ����title
	List<BookDO> listBooksByTitle(String title);
	//�����id  ����ͼ���б�
	List<BookDO> listBooksByCagtegoryId(int id);
	//ȫ��
	List<BookDO> listBook();
	//����
	List<BookDO> listAuthor(String author);
	//ISDN
}
