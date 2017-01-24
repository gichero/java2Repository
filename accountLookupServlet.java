import Business.Account;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/accountLookupServlet"})
public class accountLookupServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            //out.println("<!DOCTYPE html>");
           // out.println("<html>");
           // out.println("<head>");
           // out.println("<title>Servlet accountLookupServlet</title>");            
           // out.println("</head>");
            //out.println("<body>");
            //out.println("<h1>Servlet accountLookupServlet at " + request.getContextPath() + "</h1>");
           // out.println("</body>");
            //out.println("</html>");
            try{
               String AcctNo = request.getParameter("ac");
               String CustID = request.getParameter("id");
               String Type = request.getParameter("ty");
               String Balance = request.getParameter("bl");
               
               Account a1 = new Account();
               System.out.println(AcctNo);
               a1.selectDB(AcctNo);
               String cid = a1.getCustID();
               System.out.println(cid);
               String typ = a1.getType();
               System.out.println(typ);
               double bal = a1.getBalance();
               System.out.println(bal);
               a1.display();
               
               System.out.println("ac= "+AcctNo);
               System.out.println("id= "+CustID);
               System.out.println("ty= "+Type);
               System.out.println("bl= "+Balance);
                                          
            }
            
            catch(Exception ex){
            System.out.println(ex);
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
