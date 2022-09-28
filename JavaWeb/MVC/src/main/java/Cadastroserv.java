

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cadastroserv
 */
@WebServlet("/Cadastroserv")
public class Cadastroserv extends HttpServlet {
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
		
		String nome=request.getParameter("nome");
		String email=request.getParameter("email");
		String cpf=request.getParameter("cpf");
		String cep=request.getParameter("cep");
		String endereco=request.getParameter("endereco");
		
		Cliente cli= new Cliente();
		cli.setNome(nome);
		cli.setEmail(email);
		cli.setCpf(cpf);
		cli.setCep(cep);
		cli.setEndereco(endereco);
		
		request.setAttribute("Cliente", cli);
		RequestDispatcher rd= request.getRequestDispatcher("salvarcliente.jsp");
		rd.forward(request, response);
		
		

		
		
	}



	}


