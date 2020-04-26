package cafe;

public class CafeInfor {
	
	String title;
	String name;
	String memo;
	
		

	
	CafeInfor(String title, String name, String memo){
		
		this.title=title;
		this.name=name;
		this.memo=memo;	
	}
	
	//게시판1
	public void showInfor(){
		
		System.out.println("제목: "+this.title);
		System.out.println("글쓴이: "+this.name);
		System.out.println("글내용: "+this.memo);
		
	}
	public void showTitle(){
		System.out.println(" 제목: "+this.title);
	}
	//게시판1
		public void showInfor2(){
			
			System.out.println("제목: "+this.title);
			System.out.println("글쓴이: "+this.name);
			System.out.println("글내용: "+this.memo);
			
		}
		public void showTitle2(){
			System.out.println(" 제목: "+this.title);
		}
		//게시판3
		public void showInfor3(){
			
			System.out.println("제목: "+this.title);
			System.out.println("글쓴이: "+this.name);
			System.out.println("글내용: "+this.memo);
			
		}
		public void showTitle3(){
			System.out.println(" 제목: "+this.title);
		}
		//게시판4
		public void showInfor4(){
			
			System.out.println("제목: "+this.title);
			System.out.println("글쓴이: "+this.name);
			System.out.println("글내용: "+this.memo);
			
		}
		public void showTitle4(){
			System.out.println(" 제목: "+this.title);
		}

	
	//title 속성값과 전달받은 문자열을 비교해서결과반환
		boolean checkTitle(String title) {
			
			return this.title.equals(title);
		}
	
	

}
