package surabhsukla;
class example<T>
{
	T i;
	public void add(T i1) {i=i1;}
	public T get() {return (i);}
}
public class genericlass {

	public static void main(String[] args) {
	example<Integer> m1= new example<Integer>();
	example<String> m2= new example<String>();
	Integer k = new Integer(5);
	m1.add(k);
	m2.add("santosh");
	System.out.println("m1=" + m1.get() +"\n "+ "m2=" + m2.get());

	}

}
