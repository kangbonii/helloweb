package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GugudanServlet
 */
@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tmpdan = request.getParameter("dan");
		System.out.println(tmpdan);
		
		int dan = Integer.parseInt(tmpdan);
		
		System.out.println("gugu출력");
		
		PrintWriter out = response.getWriter();
		out.println("<table border='1'>");
		for(int i=1; i<=9; i++) {
		out.println("	<tr>");
		out.println("		<td>"+dan+"</td>");
		out.println("		<td>"+i+"</td>");
		out.println("		<td>"+dan*i+"</td>");
		out.println("	</tr>");
		}
		out.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
