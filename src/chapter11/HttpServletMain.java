package chapter11;

public class HttpServletMain {
	public static void main(String[] args) {
		//내 방법
		HttpServlet obj1 = new LoginService();
		obj1.service();
		HttpServlet obj2 = new FileDownloadService();
		obj2.service();
		
		//선생님 방법
		method(new LoginService());
		method(new FileDownloadService());
	}
	

	//메소드명 method(static)
	public static void method(HttpServlet http) {
		http.service();
		
	}
}
