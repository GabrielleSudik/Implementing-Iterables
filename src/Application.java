//using iteration over classes
//you created your own class UrlLibrary
//much of what is different about iterating classes
//as opposed to standard objects
//takes place in the syntax of the class itself

public class Application {

	public static void main(String[] args) {
		
		UrlLibrary urlLibrary1 = new UrlLibrary();
		
		for(String url: urlLibrary1){
			System.out.println(url);
		}
	}
}
