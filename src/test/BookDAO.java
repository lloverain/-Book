package test;

import java.util.List;

public interface BookDAO {
	//图书is
	List<BookDO> getBooksByIsbn(String isbn);
	//图书名title
	List<BookDO> listBooksByTitle(String title);
	//种类查id  返回图书列表
	List<BookDO> listBooksByCagtegoryId(int id);
	//全部
	List<BookDO> listBook();
	//作者
	List<BookDO> listAuthor(String author);
	//ISDN
}
