package ex;

import java.net.*;
public class NetworkTest1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		URL url = new URL("https://www.google.com/search?q=java&rlz=1C1OKWM_koKR876KR876&oq=java&aqs=chrome..69i57j0j69i59l2j0j69i60l3.788j0j7&sourceid=chrome&ie=UTF-8");
				System.out.println("url.getAuthority():"+ url.getAuthority());
				//System.out.println("url.getContent():"+ url.getContent());
				System.out.println("url.getDefaultPort():"+ url.getDefaultPort());
				System.out.println("url.getPort():"+ url.getPort());
				System.out.println("url.getFile():"+ url.getFile());
				System.out.println("url.getHost():"+ url.getHost());
				System.out.println("url.getPath():"+ url.getPath());
				System.out.println("url.getProtocol():"+ url.getProtocol());
				System.out.println("url.getQuery():"+ url.getQuery());
				System.out.println("url.getRef():"+ url.getRef());
				System.out.println("url.getUserInfo():"+ url.getUserInfo());
				System.out.println("url.toExternalForm():"+ url.toExternalForm());
				System.out.println("url.toURI():"+ url.toURI());

	}

}
