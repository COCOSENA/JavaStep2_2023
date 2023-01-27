package chapter17.arraylist;

import java.util.ArrayList;

class Shape {

	void draw() {
		System.out.println("draw Shape");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("draw Circle");
	}

	void circle() {
		System.out.println("원모양 입니다.");
	}
}

	class Rectangle extends Shape {

		@Override
		void draw() {
			System.out.println("draw Rectangle");
		}

		void Rectangle() {
			System.out.println("사각형 입니다.");
		}
	}
		class Triangle extends Shape {
			@Override
			void draw() {
				System.out.println("draw Triangle");
			}

			void Triangle() {
				System.out.println("삼각형 입니다.");
			}
		}

public class ShapeTest {

	//shape와 shape 를 상속받은 모든 클래스 타입이 사용하는 ArrayList
		ArrayList<Shape> sList = new ArrayList<Shape>(); //shape라는 타입설정
	
		public static void main(String[] args) {
			
			ShapeTest sTest = new ShapeTest(); //객체만드는것 
			
			System.out.println("=====업캐스팅 =====");
			sTest.addShape(); //Shape sc=new Circle 
			System.out.println("=====다운캐스팅 =====");
			sTest.testCating();
			
	}

		public void addShape() {
			sList.add(new Circle()); //클래스가 들어감. Circle s = new Circle();
			sList.add(new Triangle()); //형변환 안해도 되니까 업캐스팅(하위 클래스->상위클래스)
			sList.add(new Rectangle()); //자동형변환 됨 
			
			
			for(Shape s:sList) {
				s.draw();
			}
		}
		
		public void testCating() {

			for(int i=0; i <sList.size(); i++) {
				Shape s=sList.get(i); //일단 부모(Shape) 타입으로 가져옴
				
				if(s instanceof Circle) {
					Circle c=(Circle)s; // 다운캐스팅
					c.circle();
				}else if(s instanceof Triangle) {
					Triangle c=(Triangle)s; // 다운캐스팅
					c.Triangle();
				}else if(s instanceof Rectangle) {
					Rectangle c=(Rectangle)s; // 다운캐스팅
					c.Rectangle();
				}else {
					System.out.println("지원되지 않는 타입니다.");
				}
		
					
				}//if
			}//for
		}
		
