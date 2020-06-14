
public class Exercicios {

	/**
	 * 1. Em uma classe qualquer, implemente o método chamado convertToInt, que recebe uma lista
	 * simplesmente encadeada que armazena apenas números inteiros positivos (objetos do tipo Integer).
	 * Este método deve, ao receber esta lista como parâmetro, retornar o número representado pela lista.
	 * Ex.: para a lista mostrada abaixo, este método deve retornar o número inteiro 4101.
	 * 
	 * 								first node -> 4 -> 1 -> 0 -> 1
	 */
	
	public Integer convertToInt(SinglyLinkedList<Integer> lista) {
		int tamanho = lista.numElements();
		String aux = "";
		for(int i = 0; i < tamanho; i++) {
			aux += lista.get(i);
		}
		return Integer.parseInt(aux);
	}
	
	
	/**
	 * 2. Implemente, em uma classe qualquer, um método recursivo que soma todos os elementos contidos em
	 * uma lista simplesmente encadeada de inteiros recebida por parâmetro.
	 */
	
	public Integer somaInteiros(SinglyLinkedList<Integer> lista) {
		if(lista.isEmpty()) {
			 throw new UnderflowException();
		} else {
			return somaInt(lista, 0, 0);
		}
	}
	
	private Integer somaInt(SinglyLinkedList<Integer> lista, int soma, int posicao) {
		if(lista.numElements() == (posicao + 1)) {
			return soma + lista.get(posicao);
		} else {
			int aux = soma + lista.get(posicao);
			posicao++;
			return somaInt(lista, aux, posicao);
		}
	}
	
	
	/**
	 * 4. Implemente, em uma classe qualquer, um método que recebe uma lista simplesmente encadeada de
	 * double e retorna uma pilha estática (objeto StaticStack) com todos os elementos negativos da lista
	 * recebida por parâmetro.
	 */
	
	public StaticStack<Double> pilhaDeElementosNegativos(SinglyLinkedList<Double> lista) {
		StaticStack<Double> aux = new StaticStack<Double>(lista.numElements());
		for(int i = 0; i < lista.numElements(); i++) {
			if(lista.get(i) < 0) {
				aux.push(lista.get(i));
			}
		}
		return aux;
	}
	
}
