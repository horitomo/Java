package jp.ac.hal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login_
 */
@WebServlet("/Login_")
public class Login_ extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("WEB-INF/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url =
				"jdbc:mysql://localhost:3306/jv32";
			String dbUser = "root";
			String dbPassword = "";
			String sql = "SELECT * FROM kadai01_users WHERE id = ?"; //?がプレースホルダ(仮置き場)


			String id = request.getParameter("id");
			String password = request.getParameter("password");

			try {
				Class.forName("com.mysql.jdbc.Driver");
				try(
						Connection con = DriverManager.getConnection(url,dbUser,dbPassword);
						PreparedStatement s = con.prepareStatement(sql)

					){
						//プリペアードステートメントの利点
						//1.SQLインジェクション対策
						//2.大量更新の高速化
						//[利用指針]
						//・SQL文にユーザの入力値を用いる
						//・大量に更新する


						//プレースホルダの値設定
						s.setString(1, id);

						try(ResultSet rs = s.executeQuery()){
							//DB内のpasswordの取得
							String r=rs.getString(2);
							//DB内のパスワードとUserの打ち込んだPasswordの比較
							if(r == password) {
								//Memberにとぶ
								response.sendRedirect("Member");
							}else {
								//ログイン画面にとぶ
								response.sendRedirect("Login_");
								//エラー表示(メッセージSESSIONを作る)

							}
						}

					} catch (SQLException e) {
						// TODO 自動生成された catch ブロック
						e.printStackTrace();
					}

			} catch (ClassNotFoundException e1) {
				// TODO 自動生成された catch ブロック
				e1.printStackTrace();
			}

	}

}
