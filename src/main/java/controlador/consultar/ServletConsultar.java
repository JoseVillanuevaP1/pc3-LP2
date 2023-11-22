/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador.consultar;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tienda.modelo.bean.Articulo;
import tienda.modelo.bean.PedidoDetalle;
import tienda.modelo.dao.ConsultasDao;

@WebServlet(name = "ServletConsultar", urlPatterns = {"/ServletConsultar", "/consultar",
    "/consulta1", "/consulta2", "/consulta3", "/consulta4", "/consulta5","/consulta6","/consulta7","/consulta8",
    "/consulta9","/consulta10","/consulta11","/consulta12"})
public class ServletConsultar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            String path = request.getServletPath();
            if (path.equals("/consultar")) {
                request.getRequestDispatcher("/WEB-INF/Consultas.jsp").forward(request, response);
            }

            if (path.equals("/consulta1")) {
                
                String categoria = request.getParameter("categoria");
                int id = ConsultasDao.getIdCategoria(categoria);
                List<Articulo> articulos = null;
                if (id != 0) {
                    articulos = ConsultasDao.getArtByCategoria(id);
                }
                request.setAttribute("articulos", articulos);
                request.getRequestDispatcher("/WEB-INF/Consulta1.jsp").forward(request, response);
                
            }
            
            if (path.equals("/consulta2")) {
                String empleado = request.getParameter("empleado");
                int id = ConsultasDao.getIdEmpleado(empleado);
                List<PedidoDetalle> pedidos = null;
                if (id != 0) {
                    pedidos = ConsultasDao.getPedidosByEmpleado(id);
                }
                request.setAttribute("pedidos", pedidos);
                request.getRequestDispatcher("/WEB-INF/Consulta2.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta3")) {
                
                String f_inicial = request.getParameter("fecha_inicial");
                String f_final = request.getParameter("fecha_final");
                List<PedidoDetalle> pedidos = ConsultasDao.getPedidosByDate(f_inicial, f_final);
                request.setAttribute("pedidos", pedidos);
                request.getRequestDispatcher("/WEB-INF/Consulta3.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta4")) {
                
                String empleado = request.getParameter("empleado");
                int id = ConsultasDao.getIdEmpleado(empleado);
                List<Articulo> articulos = null;
                if (id != 0) {
                    articulos = ConsultasDao.getArtByEmpleado(id);
                }
                request.setAttribute("articulos", articulos);
                request.getRequestDispatcher("/WEB-INF/Consulta4.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta5")) {
                Articulo articulo = ConsultasDao.getMaxPrecio();
                request.setAttribute("articulo", articulo);
                request.getRequestDispatcher("/WEB-INF/Consulta5.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta6")) {
                request.getRequestDispatcher("/WEB-INF/Consulta6.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta7")) {
                request.getRequestDispatcher("/WEB-INF/Consulta7.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta8")) {
                request.getRequestDispatcher("/WEB-INF/Consulta8.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta9")) {
                request.getRequestDispatcher("/WEB-INF/Consulta9.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta10")) {
                request.getRequestDispatcher("/WEB-INF/Consulta10.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta11")) {
                request.getRequestDispatcher("/WEB-INF/Consulta11.jsp").forward(request, response);
            }
            
            if (path.equals("/consulta12")) {
                request.getRequestDispatcher("/WEB-INF/Consulta12.jsp").forward(request, response);
            }
 
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
