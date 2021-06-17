package 햄버거프로젝트;

public class Food {

	private String 제품명;
	private int 가격;
	private int 수량;
	
	public Food() {
		// TODO Auto-generated constructor stub
	}
	
	public Food(String 제품명, int 가격, int 수량) {
		
		super();
		this.제품명=제품명;
		this.가격=가격;
		this.수량=수량;
		
	}
	
	

	public String get제품명() {
		return 제품명;
	}

	public void set제품명(String 제품명) {
		this.제품명 = 제품명;
	}

	public int get가격() {
		return 가격;
	}

	public void set가격(int 가격) {
		this.가격 = 가격;
	}
	
	public int get수량() {
		return 수량;
	}
	public void set수량(int 수량) {
		this.수량=수량;
	}
	

	
	
	
	
}
