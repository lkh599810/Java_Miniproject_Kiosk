package 햄버거프로젝트;

import java.util.ArrayList;
import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		
		ArrayList<Food> 장바구니= new ArrayList<>();
		Scanner 입력= new Scanner(System.in);
		
		
		
		while(true) {
		
			System.out.println("==============Menu==============");
			
			System.out.println("1. Burgers 2. Drink 3. Side");
			
			System.out.println("메뉴를 골라주세요");
			
			int menuchoose=입력.nextInt();
		
			
			if(!(menuchoose==1||menuchoose==2||menuchoose==3)) {
				
				System.out.println("다시 입력해주세요");
				continue;
			}else {//코드 시작
				
				if(menuchoose==1) {
					System.out.println("1. 불고기버거 2. 치즈버거 3. 새우버거");
					System.out.println("버거를 골라주세요");
					int foodchoose=입력.nextInt();
					
					if(!(foodchoose==1||foodchoose==2||foodchoose==3)) {
						System.out.println("다시 입력해주세요");
						continue;
					
					}else { 
						
						System.out.println("몇 개 고르시겠습니까?");
						
						
						if(foodchoose==1) {
							
								int 갯수=입력.nextInt();
								햄버거 temp =  new 햄버거("불고기버거",5000,갯수);
								System.out.println("불고기버거 "+갯수+"  개를 장바구니에 담았습니다.");
								System.out.println("=================장바구니================="); //if 문을 걸 필요가없음.
							
								int count = 0;
								int 인덱스 = -1;
								for(int i=0; i<장바구니.size(); i++) {
									if(장바구니.get(i).get제품명().equals("불고기버거")) {			
										count = 1 ;
										인덱스 = i;
									}
								}
								
								if( count == 0 ) {   장바구니.add(temp);}
								if( count == 1 ) {  장바구니.get(인덱스).set수량( 장바구니.get(인덱스).get수량() + 갯수  ); }
								int total = 0;
								
								for(int i=0; i<장바구니.size(); i++) {
					
											System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
											System.out.println();
											total=  (장바구니.get(i).get가격()*장바구니.get(i).get수량())+total ;
								}
								System.out.println("총 가격 : " + total);
								System.out.println();
								
						
						}
						else if(foodchoose==2) {
							
								int 갯수=입력.nextInt();
								햄버거 temp=new 햄버거("치즈버거",5500,갯수);
								System.out.println("치즈버거 "+갯수+"  개를 장바구니에 담았습니다.");
							
								System.out.println("=================장바구니=================");
								
								
								String 검색="없음";
								int 인덱스=-1;
								for(int i=0; i<장바구니.size(); i++) {
									
									if(장바구니.get(i).get제품명().equals("치즈버거")) {
										검색="있음";
										인덱스=i;
									}
								}

								
								if(검색.equals("없음")) {장바구니.add(temp);}
								if(검색.equals("있음")) {장바구니.get(인덱스).set수량( 장바구니.get(인덱스).get수량() + 갯수  ); }
								
								int total = 0;
								
								for(int i=0; i<장바구니.size(); i++) {//장바구니출력
									System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
									System.out.println();
									total=  (장바구니.get(i).get가격()*장바구니.get(i).get수량())+total ;
								}
								System.out.println("총 가격 : " + total);
								System.out.println();
						}
						else if(foodchoose==3) {
							
							int 갯수=입력.nextInt();
							
							햄버거 temp=new 햄버거("새우버거", 6000, 갯수);
							System.out.println("새우버거 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							
							String 검색="없음";
							int 인덱스=-1;
							//장바구니 돌려서 새우버거 있으면 갯수올려주고, 없으면 바로넣기
							
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).equals("새우버거")) {
									검색="있음";
									인덱스=i;
								}
								
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량( 장바구니.get(인덱스).get수량() + 갯수  ); }
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							System.out.println("총 가격: "+total); 
							System.out.println();
							
						}//3번 끝
						
						
						
					}
					
				}//햄버거 끝!
				
				
				
				
				
				
				
				
				
				else if(menuchoose==2) {
					System.out.println("1. 사이다 2. 콜라 3. 환타");
					System.out.println("음료를 골라주세요");
					int foodchoose=입력.nextInt();
					
					if(!(foodchoose==1||foodchoose==2||foodchoose==3)) {
						
						System.out.println("다시 입력해주세요");
						continue;
					}
					else {
						
						if(foodchoose==1) {
							int 갯수;
							System.out.println("몇 개 고르시겠습니까?");
							갯수=입력.nextInt();
							
							음료 temp=new 음료("사이다",1500,갯수);
							
							System.out.println("사이다 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							String 검색="없음";
							int 인덱스= -1;
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).get제품명().equals("사이다")) {
									
									검색="있음";
									인덱스=i;
								}
								
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량(장바구니.get(인덱스).get수량() + 갯수);}
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							
							System.out.println("총 가격: "+total); 
							System.out.println();
							
							
							
						}//1번끝
						
						else if(foodchoose==2) {
							
							int 갯수;
							System.out.println("몇 개 고르시겠습니까?");
							갯수=입력.nextInt();
							
							음료 temp=new 음료("콜라",1500,갯수);
							
							System.out.println("콜라 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							String 검색="없음";
							int 인덱스= -1;
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).get제품명().equals("콜라")) {
									
									검색="있음";
									인덱스=i;
								}
								
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량(장바구니.get(인덱스).get수량() + 갯수);}
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							
							System.out.println("총 가격: "+total); 
							System.out.println();
							
							
						}
						else if(foodchoose==3) {
							
							int 갯수;
							System.out.println("몇 개 고르시겠습니까?");
							갯수=입력.nextInt();
							
							음료 temp=new 음료("환타",1500,갯수);
							
							System.out.println("환타 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							String 검색="없음";
							int 인덱스= -1;
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).get제품명().equals("환타")) {
									
									검색="있음";
									인덱스=i;
								}
								
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량(장바구니.get(인덱스).get수량() + 갯수);}
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							
							System.out.println("총 가격: "+total); 
							System.out.println();
							
						}
						
					}
					
					
				}//음료 끝!
				else if(menuchoose==3) {
					System.out.println("1.감자튀김  2.치킨너겟  3.아이스크림");
					System.out.println("사이드를 골라주세요");	
					int foodchoose=입력.nextInt();
					
					if(!(foodchoose==1||foodchoose==2||foodchoose==3)) {
						
						System.out.println("다시 입력해주세요");
						continue;
					}
					else {
						
						if(foodchoose==1) {
							int 갯수;
							System.out.println("몇 개 고르시겠습니까?");
							갯수=입력.nextInt();
							
							음료 temp=new 음료("감자튀김",3000,갯수);
							
							System.out.println("감자튀김 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							String 검색="없음";
							int 인덱스= -1;
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).get제품명().equals("감자튀김")) {
									
									검색="있음";
									인덱스=i;
								}
								
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량(장바구니.get(인덱스).get수량() + 갯수);}
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							
							System.out.println("총 가격: "+total); 
							System.out.println();
							
							
							
						}//1번끝
				
						else if(foodchoose==2) {
							int 갯수;
							System.out.println("몇 개 고르시겠습니까?");
							갯수=입력.nextInt();
							
							음료 temp=new 음료("치킨너겟",2000,갯수);
							
							System.out.println("치킨너겟 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							String 검색="없음";
							int 인덱스= -1;
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).get제품명().equals("치킨너겟")) {
									
									검색="있음";
									인덱스=i;
								}
								      
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량(장바구니.get(인덱스).get수량() + 갯수);}
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							
							System.out.println("총 가격: "+total); 
							System.out.println();
							
							
							
						}//2번끝
						
						else if(foodchoose==3) {
							int 갯수;
							System.out.println("몇 개 고르시겠습니까?");
							갯수=입력.nextInt();
							
							음료 temp=new 음료("아이스크림",2000,갯수);
							
							System.out.println("아이스크림 "+갯수+"  개를 장바구니에 담았습니다.");
							
							System.out.println("=================장바구니=================");
							
							String 검색="없음";
							int 인덱스= -1;
							for(int i=0; i<장바구니.size(); i++) {
								
								if(장바구니.get(i).get제품명().equals("아이스크림")) {
									
									검색="있음";
									인덱스=i;
								}
								
							}
							
							if(검색.equals("없음")) {장바구니.add(temp);}
							if(검색.equals("있음")) {장바구니.get(인덱스).set수량(장바구니.get(인덱스).get수량() + 갯수);}
							int total=0;
							
							for(int i=0; i<장바구니.size(); i++) {//장바구니출력
								System.out.println("제품: "+장바구니.get(i).get제품명()+"  가격: "+(장바구니.get(i).get가격()*장바구니.get(i).get수량())+"  수량: "+장바구니.get(i).get수량());
								System.out.println();
								total=(장바구니.get(i).get가격()*장바구니.get(i).get수량())+total;
							}
							
							System.out.println("총 가격: "+total); 
							System.out.println();
							
							
							
						}//3번끝
					
					
						
					
					
					}
				
				}//사이드 메뉴 끝
				
				
				
				}//메뉴 끝
			
			}//while 끝
		}
	}
