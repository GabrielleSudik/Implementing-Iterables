import java.util.Iterator;
import java.util.LinkedList;


public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();
	
	public UrlLibrary(){
		urls.add("www.google.com");
		urls.add("www.gmail.com");
		urls.add("www.weather.com");
		}

	//added unimplemented method, with your own code of course
	public Iterator<String> iterator() {
		return urls.iterator();
	}
}
