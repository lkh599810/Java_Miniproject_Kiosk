package �ܹ���������Ʈ;

import java.util.ArrayList;
import java.util.Scanner;

public class home {

	public static void main(String[] args) {
		
		ArrayList<Food> ��ٱ���= new ArrayList<>();
		Scanner �Է�= new Scanner(System.in);
		
		
		
		while(true) {
		
			System.out.println("==============Menu==============");
			
			System.out.println("1. Burgers 2. Drink 3. Side");
			
			System.out.println("�޴��� ����ּ���");
			
			int menuchoose=�Է�.nextInt();
		
			
			if(!(menuchoose==1||menuchoose==2||menuchoose==3)) {
				
				System.out.println("�ٽ� �Է����ּ���");
				continue;
			}else {//�ڵ� ����
				
				if(menuchoose==1) {
					System.out.println("1. �Ұ����� 2. ġ����� 3. �������");
					System.out.println("���Ÿ� ����ּ���");
					int foodchoose=�Է�.nextInt();
					
					if(!(foodchoose==1||foodchoose==2||foodchoose==3)) {
						System.out.println("�ٽ� �Է����ּ���");
						continue;
					
					}else { 
						
						System.out.println("�� �� ���ðڽ��ϱ�?");
						
						
						if(foodchoose==1) {
							
								int ����=�Է�.nextInt();
								�ܹ��� temp =  new �ܹ���("�Ұ�����",5000,����);
								System.out.println("�Ұ����� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
								System.out.println("=================��ٱ���================="); //if ���� �� �ʿ䰡����.
							
								int count = 0;
								int �ε��� = -1;
								for(int i=0; i<��ٱ���.size(); i++) {
									if(��ٱ���.get(i).get��ǰ��().equals("�Ұ�����")) {			
										count = 1 ;
										�ε��� = i;
									}
								}
								
								if( count == 0 ) {   ��ٱ���.add(temp);}
								if( count == 1 ) {  ��ٱ���.get(�ε���).set����( ��ٱ���.get(�ε���).get����() + ����  ); }
								int total = 0;
								
								for(int i=0; i<��ٱ���.size(); i++) {
					
											System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
											System.out.println();
											total=  (��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total ;
								}
								System.out.println("�� ���� : " + total);
								System.out.println();
								
						
						}
						else if(foodchoose==2) {
							
								int ����=�Է�.nextInt();
								�ܹ��� temp=new �ܹ���("ġ�����",5500,����);
								System.out.println("ġ����� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
								System.out.println("=================��ٱ���=================");
								
								
								String �˻�="����";
								int �ε���=-1;
								for(int i=0; i<��ٱ���.size(); i++) {
									
									if(��ٱ���.get(i).get��ǰ��().equals("ġ�����")) {
										�˻�="����";
										�ε���=i;
									}
								}

								
								if(�˻�.equals("����")) {��ٱ���.add(temp);}
								if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����( ��ٱ���.get(�ε���).get����() + ����  ); }
								
								int total = 0;
								
								for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
									System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
									System.out.println();
									total=  (��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total ;
								}
								System.out.println("�� ���� : " + total);
								System.out.println();
						}
						else if(foodchoose==3) {
							
							int ����=�Է�.nextInt();
							
							�ܹ��� temp=new �ܹ���("�������", 6000, ����);
							System.out.println("������� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							
							String �˻�="����";
							int �ε���=-1;
							//��ٱ��� ������ ������� ������ �����÷��ְ�, ������ �ٷγֱ�
							
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).equals("�������")) {
									�˻�="����";
									�ε���=i;
								}
								
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����( ��ٱ���.get(�ε���).get����() + ����  ); }
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							System.out.println("�� ����: "+total); 
							System.out.println();
							
						}//3�� ��
						
						
						
					}
					
				}//�ܹ��� ��!
				
				
				
				
				
				
				
				
				
				else if(menuchoose==2) {
					System.out.println("1. ���̴� 2. �ݶ� 3. ȯŸ");
					System.out.println("���Ḧ ����ּ���");
					int foodchoose=�Է�.nextInt();
					
					if(!(foodchoose==1||foodchoose==2||foodchoose==3)) {
						
						System.out.println("�ٽ� �Է����ּ���");
						continue;
					}
					else {
						
						if(foodchoose==1) {
							int ����;
							System.out.println("�� �� ���ðڽ��ϱ�?");
							����=�Է�.nextInt();
							
							���� temp=new ����("���̴�",1500,����);
							
							System.out.println("���̴� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							String �˻�="����";
							int �ε���= -1;
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).get��ǰ��().equals("���̴�")) {
									
									�˻�="����";
									�ε���=i;
								}
								
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����(��ٱ���.get(�ε���).get����() + ����);}
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							
							System.out.println("�� ����: "+total); 
							System.out.println();
							
							
							
						}//1����
						
						else if(foodchoose==2) {
							
							int ����;
							System.out.println("�� �� ���ðڽ��ϱ�?");
							����=�Է�.nextInt();
							
							���� temp=new ����("�ݶ�",1500,����);
							
							System.out.println("�ݶ� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							String �˻�="����";
							int �ε���= -1;
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).get��ǰ��().equals("�ݶ�")) {
									
									�˻�="����";
									�ε���=i;
								}
								
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����(��ٱ���.get(�ε���).get����() + ����);}
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							
							System.out.println("�� ����: "+total); 
							System.out.println();
							
							
						}
						else if(foodchoose==3) {
							
							int ����;
							System.out.println("�� �� ���ðڽ��ϱ�?");
							����=�Է�.nextInt();
							
							���� temp=new ����("ȯŸ",1500,����);
							
							System.out.println("ȯŸ "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							String �˻�="����";
							int �ε���= -1;
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).get��ǰ��().equals("ȯŸ")) {
									
									�˻�="����";
									�ε���=i;
								}
								
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����(��ٱ���.get(�ε���).get����() + ����);}
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							
							System.out.println("�� ����: "+total); 
							System.out.println();
							
						}
						
					}
					
					
				}//���� ��!
				else if(menuchoose==3) {
					System.out.println("1.����Ƣ��  2.ġŲ�ʰ�  3.���̽�ũ��");
					System.out.println("���̵带 ����ּ���");	
					int foodchoose=�Է�.nextInt();
					
					if(!(foodchoose==1||foodchoose==2||foodchoose==3)) {
						
						System.out.println("�ٽ� �Է����ּ���");
						continue;
					}
					else {
						
						if(foodchoose==1) {
							int ����;
							System.out.println("�� �� ���ðڽ��ϱ�?");
							����=�Է�.nextInt();
							
							���� temp=new ����("����Ƣ��",3000,����);
							
							System.out.println("����Ƣ�� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							String �˻�="����";
							int �ε���= -1;
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).get��ǰ��().equals("����Ƣ��")) {
									
									�˻�="����";
									�ε���=i;
								}
								
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����(��ٱ���.get(�ε���).get����() + ����);}
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							
							System.out.println("�� ����: "+total); 
							System.out.println();
							
							
							
						}//1����
				
						else if(foodchoose==2) {
							int ����;
							System.out.println("�� �� ���ðڽ��ϱ�?");
							����=�Է�.nextInt();
							
							���� temp=new ����("ġŲ�ʰ�",2000,����);
							
							System.out.println("ġŲ�ʰ� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							String �˻�="����";
							int �ε���= -1;
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).get��ǰ��().equals("ġŲ�ʰ�")) {
									
									�˻�="����";
									�ε���=i;
								}
								      
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����(��ٱ���.get(�ε���).get����() + ����);}
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							
							System.out.println("�� ����: "+total); 
							System.out.println();
							
							
							
						}//2����
						
						else if(foodchoose==3) {
							int ����;
							System.out.println("�� �� ���ðڽ��ϱ�?");
							����=�Է�.nextInt();
							
							���� temp=new ����("���̽�ũ��",2000,����);
							
							System.out.println("���̽�ũ�� "+����+"  ���� ��ٱ��Ͽ� ��ҽ��ϴ�.");
							
							System.out.println("=================��ٱ���=================");
							
							String �˻�="����";
							int �ε���= -1;
							for(int i=0; i<��ٱ���.size(); i++) {
								
								if(��ٱ���.get(i).get��ǰ��().equals("���̽�ũ��")) {
									
									�˻�="����";
									�ε���=i;
								}
								
							}
							
							if(�˻�.equals("����")) {��ٱ���.add(temp);}
							if(�˻�.equals("����")) {��ٱ���.get(�ε���).set����(��ٱ���.get(�ε���).get����() + ����);}
							int total=0;
							
							for(int i=0; i<��ٱ���.size(); i++) {//��ٱ������
								System.out.println("��ǰ: "+��ٱ���.get(i).get��ǰ��()+"  ����: "+(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+"  ����: "+��ٱ���.get(i).get����());
								System.out.println();
								total=(��ٱ���.get(i).get����()*��ٱ���.get(i).get����())+total;
							}
							
							System.out.println("�� ����: "+total); 
							System.out.println();
							
							
							
						}//3����
					
					
						
					
					
					}
				
				}//���̵� �޴� ��
				
				
				
				}//�޴� ��
			
			}//while ��
		}
	}
