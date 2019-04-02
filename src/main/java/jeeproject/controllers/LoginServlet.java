package jeeproject.controllers;

import com.sun.org.apache.xerces.internal.util.URI;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jeeproject.domain.model.LoginBean;
import jeeproject.domain.model.LoginDAO;

import org.codehaus.jackson.map.ObjectMapper;
import java.net.URL;
import org.apache.commons.io.IOUtils;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/JSP/login.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        System.out.println("IN LOGIN SERVLET");
        String userName = request.getParameter("textLogin");
        String password = request.getParameter("textPassword");
        LoginBean user = new LoginBean(0, userName, password);
        ObjectMapper mapper = new ObjectMapper();
        String userJSON = mapper.writeValueAsString(user);
        System.out.println(userJSON);
        String query_url = "http://localhost:30384/jeeproject/login";
           try {
           URL url = new URL(query_url);
           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
           conn.setConnectTimeout(5000);
           conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
           conn.setDoOutput(true);
           conn.setDoInput(true);
           conn.setRequestMethod("POST");
           OutputStream os = conn.getOutputStream();
           os.write(userJSON.getBytes("UTF-8"));
           os.close(); 
           // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
           String result = IOUtils.toString(in, "UTF-8");
           System.out.println(result);
           in.close();
           conn.disconnect();
           } catch (Exception e) {
   			System.out.println(e);
            }
    }
}