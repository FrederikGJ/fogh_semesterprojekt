package dat.backend.control;

import dat.backend.model.entities.config.ApplicationStart;
import dat.backend.model.entities.persistence.ConnectionPool;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "viewinventory", urlPatterns = {"/viewiinventory"})

public class ViewInventory extends HttpServlet {
    private ConnectionPool connectionPool;

    @Override
    public void init() throws ServletException {
        this.connectionPool = ApplicationStart.getConnectionPool();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        // You shouldn't end up here with a GET-request, thus you get sent back to frontpage
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}








