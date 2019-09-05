package jp.ac.hal;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());

		// リクエストパラメータ取得
		String id = request.getParameter("id");
		String name = request.getParameter("name");

		// ServletからJSPへのデータを渡す
		// ->アトリビュートを用いる
		// setAttribute(第一引数・JSPで引っこ抜くときの名前, 第二引数・受け渡すデータ)
		// idをJSPにセット
		request.setAttribute("new_id", "ths"+id);

		// nameをJSPにセット
		request.setAttribute("new_name", name+"様");
		
		





		request.getRequestDispatcher("WEB-INF/MyView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		//response.getWriter().append("post");
	}

}
