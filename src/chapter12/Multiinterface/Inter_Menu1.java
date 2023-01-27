package chapter12.Multiinterface;

public interface Inter_Menu1 {

	abstract String jajang();
	abstract String jjambbong ();

	default void show() {
		System.out.println("맛집~~");
	}
}
