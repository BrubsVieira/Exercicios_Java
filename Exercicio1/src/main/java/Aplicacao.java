
public class Aplicacao {
	
	public static <K, V> void main(String[] args) {
		
		Map<Integer,String> m = new Map<Integer, String>();
		
		m.put(1,"A");
		m.put(2,"B");
		m.put(3,"C");
		m.put(4,"D");
		m.put(1,"F");
		
		System.out.println(m.get(1));
		System.out.println(m.get(2));
		System.out.println(m.get(3));
		System.out.println(m.get(4));
		System.out.println(m.get(5));
		
		m.clear();
		System.out.println("Limpeza efetuada "+m.get(3));
		
	}
}
