
public class TestaExercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Exercicios e = new Exercicios();
		
		SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
		lista.insertLast(1);
		lista.insertLast(2);
		lista.insertLast(3);
		lista.insertLast(4);
		lista.insertLast(5);
		lista.insertLast(6);
		lista.insertLast(7);
		lista.insertLast(8);
		
		
		SinglyLinkedList<Integer> aux = lista.split(10);
		System.out.println(aux);
		System.out.println(lista);
		int x = 0;
		
		
	}

}
