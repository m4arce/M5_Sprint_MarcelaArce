package cl.jee.abpro.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.jee.abpro.implementacion.MySqlCapacitacionDAO;
import cl.jee.abpro.interfaces.ICapacitacion;
import cl.jee.abpro.model.Capacitacion;

/**
 * Servlet implementation class ServletListarCapacitaciones
 */
@WebServlet("/ListarCapacitacionesServlet")
public class ListarCapacitacionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListarCapacitacionesServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ICapacitacion capa1 = new MySqlCapacitacionDAO();
		List<Capacitacion> capa = capa1.readAll();
		request.setAttribute("capa", capa);
		getServletContext().getRequestDispatcher("/listaCapacitacion.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		ICapacitacion capa1 = new MySqlCapacitacionDAO();
		Capacitacion pepito = new Capacitacion(request.getParameter("nombreCurso"),
				request.getParameter("nombreDocente"), request.getParameter("fechaInicio"),
				request.getParameter("fechaTermino"), request.getParameter("precio"));

		capa1.create(pepito);

		request.setAttribute("capa", pepito);

		System.out.println(pepito.getNombreCurso());
		System.out.println(pepito.getNombreDocente());
		System.out.println(pepito.getFechaInicio());
		System.out.println(pepito.getFechaTermino());
		System.out.println(pepito.getPrecio());

		getServletContext().getRequestDispatcher("/nuevaCapacitacion.jsp").forward(request, response);

	}

}
