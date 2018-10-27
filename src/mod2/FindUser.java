package mod2;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import impl.BookDAOImpl;
import javafx.scene.chart.PieChart.Data;
import test.BookDO;

/**
 * Servlet implementation class findUser
 */
@WebServlet("/page/FindUser")
public class FindUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String leixing = request.getParameter("leixing");
		if(leixing.equals("denglu")) {
			dologin(request, response);
		}
		if(leixing.equals("zhuce")) {
			zhuce(request, response);
		}
		if (leixing.equals("sousuo")) {

			sousuo(request, response);
		
		}
		
	}
	
	private void dologin (HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		String name = request.getParameter("userName");
		String password = request.getParameter("userPwd");
		int c = test.Panduan.dologin(name, password);
		if(c==1) {
			session.setAttribute("a", name);
			response.sendRedirect("welcome.jsp");
			logs.Login.rizhi(name);
		}else {
			response.sendRedirect("denglu.jsp");
		}
	}
	
	private void zhuce(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String zhanghu = request.getParameter("zh");
		String xingming = request.getParameter("xm");
		String mima = request.getParameter("mm");
		String dianhua = request.getParameter("dh");
		String youxiang = request.getParameter("em");
		String dizhi = request.getParameter("dz");
		boolean a = test.Zhuce.zhuce(zhanghu, mima, dianhua, youxiang, dizhi, xingming);
		if(a==true) {
			response.getWriter().append("<script type='text/javascript'>alert('注册成功！')</script>");
			response.setHeader("Refresh", "0;denglu.jsp");
			logs.Zhucerizhi.rizhi(zhanghu);
		}else {
//			response.setHeader("content-type", "text/html;charset=utf-8");
//		response.setCharacterEncoding("UTF-8");
			response.getWriter().append("<script type='text/javascript'>alert('账户已存在')</script>");
			response.setHeader("Refresh", "0;zhuce.jsp");
		
		}
	}
	
	private void sousuo(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		String name = request.getParameter("neirong");
		List<BookDO> data;
		List<BookDO> datas;
		List<BookDO> datass;
		BookDO book;
		BookDAOImpl bookDAOImpl = new BookDAOImpl();
		data = bookDAOImpl.listBooksByTitle(name);
		if (data.size()!=0) {
			for(int i = 0;i<data.size();i++) {
				book = data.get(i);
				if (book.getTitle()!=null) {
			
				response.getWriter().append("<html><title>搜索结果</title><body><center>书名:"+book.getTitle()+"<br />作者："+book.getAuthor()+"<br />ISBN:"+book.getIsbn()+"<br /><br /><br /></center></body></html>");
				}else {
				
				}
				
			}
		}else{
			BookDAOImpl bookDAOImpl1 = new BookDAOImpl();
			datas = bookDAOImpl1.listAuthor(name);
			if (datas.size()!=0) {
		
				for(int i = 0;i<datas.size();i++) {
					book = datas.get(i);
				
					response.getWriter().append("<html><title>搜索结果</title><body><center>书名:"+book.getTitle()+"<br />作者："+book.getAuthor()+"<br />ISBN:"+book.getIsbn()+"<br /><br /><br /></center></body></html>");
					
				}
				}else {
//					response.getWriter().append("<script type='text/javascript'>alert('书不存在！')</script>");
//					response.setHeader("Refresh", "0;index.jsp");
					BookDAOImpl bookDAOImpl2 = new BookDAOImpl();
					datass = bookDAOImpl2.getBooksByIsbn(name);
					if (datass.size()!=0) {
					
						for(int i = 0;i<datass.size();i++) {
							book = datass.get(i);
							response.getWriter().append("<html><title>搜索结果</title><body><center>书名:"+book.getTitle()+"<br />作者："+book.getAuthor()+"<br />ISBN:"+book.getIsbn()+"<br /><br /><br /></center></body></html>");
						}
						}else {
					
							response.getWriter().append("<script type='text/javascript'>alert('书不存在！')</script>");
							response.setHeader("Refresh", "0;index.jsp");
						}
					
				}
		}
	
	}
}
