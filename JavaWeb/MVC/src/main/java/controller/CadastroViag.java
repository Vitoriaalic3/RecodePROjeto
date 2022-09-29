package controller;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.Viagem;


@WebServlet("/CadastroViag")
public class CadastroViag extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
			
		String destino=request.getParameter("destino");
		String data=request.getParameter("data");
		String hora=request.getParameter("hora");
		int id=Integer.parseInt(request.getParameter("id"));
	
		
		Viagem via= new Viagem();
		via.setDestino(destino);
		via.setData(data);
		via.setHora(hora);
		via.setId(id);
		
		
		request.setAttribute("Viagem", via);
		RequestDispatcher rd= request.getRequestDispatcher("salvarviagem.jsp");
		rd.forward(request, response);
		
		

		
		
	}



	}

