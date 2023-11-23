import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

class Recv
{
    private String lhs;
    private String rhs;
    private String error;
    private String icc;
    public Recv()
    {
    }
    public String getLhs()
    {
        return lhs;
    }
    public String getRhs()
    {
        return rhs;
    }
}
public class Convert extends HttpServlet{


    protected void ProcessRequest(HttpServletRequest httpServletRequest,
                                  HttpServletResponse httpServletResponse)

        throws ServletException, IOException {
        String query = "";
        String amount = "";


    }
}
