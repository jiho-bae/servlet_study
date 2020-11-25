package sec03.ex01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init method call");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("id : " + user_id);
		System.out.println("password : " + user_pw);
	}

	public void destroy() {
		System.out.println("destroy method call");
	}
}