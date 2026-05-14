package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LinkServlet")

public class LinkServlet extends HttpServlet  {
	
	// GETメソッドのリクエスト受信時に実行されるメソッド
	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		

		// リクエストのエンコード設定
        request.setCharacterEncoding("UTF-8");

		
		// JSPからのリクエストデータ取得
		String name = request.getParameter("name");
		
        // レスポンスのコンテンツタイプ設定
        response.setContentType("text/html; charset=UTF-8");
        
        //表示したい文章に書き換える
        String message = "Servletからデータを受信しました：" + name + "さん、こんにちは!"; 
       
        //リクエストスコープにデータを保存
        request.setAttribute("message", message);
        
        //fowardして返す
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
		}
	
	
}