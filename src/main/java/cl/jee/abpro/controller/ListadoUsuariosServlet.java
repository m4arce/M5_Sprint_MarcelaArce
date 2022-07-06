package cl.jee.abpro.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import cl.jee.abpro.implementacion.MySqlUsuariosDAO;
import cl.jee.abpro.interfaces.IUsuarios;
import cl.jee.abpro.model.Usuario;

/**
 * Servlet implementation class ListadoUsuarios
 */
@WebServlet("/ListadoUsuariosServlet")
public class ListadoUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IUsuarios us = new MySqlUsuariosDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListadoUsuariosServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		
		List<Usuario> user = us.read();
		request.setAttribute("user", user);		

		getServletContext().getRequestDispatcher("/listaUsuarios.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Usuario user = new Usuario(request.getParameter("usuario"), request.getParameter("password"), request.getParameter("tipo"));
		

		us.create(user);

		request.setAttribute("users", user);
		
		
		System.out.println(user.getUsuario());
		System.out.println(user.getPassword());
		System.out.println(user.getTipo());		

		getServletContext().getRequestDispatcher("/nuevoUsuario.jsp").forward(request, response);
	}

}
