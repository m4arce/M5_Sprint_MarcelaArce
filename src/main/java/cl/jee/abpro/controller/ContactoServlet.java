package cl.jee.abpro.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.jee.abpro.implementacion.MySqlContactoDAO;
import cl.jee.abpro.interfaces.IContacto;
import cl.jee.abpro.model.Contacto;


/**
 * Servlet implementation class ServletContacto
 */
@WebServlet("/ContactoServlet")
public class ContactoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		getServletContext().getRequestDispatcher("/contacto.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		IContacto ctc = new MySqlContactoDAO();
		Contacto contact = new Contacto(request.getParameter("usuario"), request.getParameter("email"), request.getParameter("mensaje"));

		ctc.create(contact);

		request.setAttribute("contact", contact);
		

		System.out.println("Estimado: " + contact.getUsuario());
		System.out.println("Lo contactaremos a este email: " + contact.getEmail());
		System.out.println("Por el siguiente mensaje: " + contact.getMensaje());		

		getServletContext().getRequestDispatcher("/envioContacto.jsp").forward(request, response);
	}

}
