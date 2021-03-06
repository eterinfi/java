package servlet.demo;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookies
 */
@WebServlet("/com/runoob/test/GetCookies")
public class GetCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCookies() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
    	Cookie cookie = null;
    	Cookie[] cookies = null;
    	
    	// 获取与该域相关的 Cookie 的数组
    	cookies = request.getCookies();
         
        // 设置响应内容类型
        response.setContentType("text/html;charset=UTF-8");
    
        PrintWriter out = response.getWriter();
        String title = "读取 Cookie 实例";
        String docType = "<!DOCTYPE html>\n";
        out.println(docType + "<html>\n" +
                              "<head><title>" + title +
                              "</title></head>\n" +
                              "<body bgcolor=\"#f0f0f0\">\n" );
        if (cookies != null) {
            out.println("<h2>查找 Cookie 名称和值</h2>");
            for (int i = 0; i < cookies.length; i++){
                cookie = cookies[i];
                if((cookie.getName()).compareTo("name") == 0 ){
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    out.print("已删除的 cookie：" + cookie.getName() + "<br/>");
                }
                out.print("参数名称：" + cookie.getName() + "，");
                out.print("参数值：" + new String(URLDecoder.decode(cookie.getValue(), "utf-8").getBytes("ISO8859-1"), "UTF-8") + " <br/>");
            }
        } else
            out.println("<h2>没有发现 Cookie</h2>");
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}