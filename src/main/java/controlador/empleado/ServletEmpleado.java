package controlador.empleado;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tienda.modelo.bean.Empleado;
import tienda.modelo.dao.EmpleadoDAO;

@WebServlet(name = "ServletEmpleado", urlPatterns = {"/ServletEmpleado", "/listarEmpleados"})
public class ServletEmpleado extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            String path = request.getServletPath();
            if (path.equals("/listarEmpleados")) {
                ArrayList<Empleado> empleados = EmpleadoDAO.getEmpleados();
                request.getSession().setAttribute("empleados", empleados);
                request.getRequestDispatcher("/WEB-INF/Empleados.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

}
