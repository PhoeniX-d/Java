package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BinaryStreamDemo1
 */
@WebServlet("/video")
public class BinaryStreamDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("video/mp4");
		ServletOutputStream os = response.getOutputStream();
		String path = getServletContext().getRealPath("frame.mp4");
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		byte[] b = new byte[(int) f.length()];
		fis.read(b); // Reading image and placing it in byte array
		os.write(b);
		fis.close();
		os.flush();
		os.close();
	}
}
