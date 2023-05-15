package dat.backend.control;

import dat.backend.model.entities.Orders;
import dat.backend.model.entities.User;
import dat.backend.model.exceptions.DatabaseException;
import dat.backend.model.persistence.ConnectionPool;
import dat.backend.model.persistence.OrdersFacade;
import dat.backend.model.persistence.OrdersMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "MakeNewRequest", value = "/MakeNewRequest")
public class MakeNewRequest extends HttpServlet {
    private ConnectionPool connectionPool;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session = request.getSession();
        request.getRequestDispatcher("WEB-INF/orderNewCarport.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session = request.getSession();

        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));


        request.setAttribute("length", length);
        request.setAttribute("width", width);
        request.getRequestDispatcher("WEB-INF/confirmCarport.jsp").forward(request, response); // Giver kunderne mulighed for at shoppe videre

    }
}
