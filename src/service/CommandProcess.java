package service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandProcess {
	public String requestPro (HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException;
	//표준화, 문서화처리를 위해 서블릿을 만든다
}

