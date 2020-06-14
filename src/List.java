/**
 * Interface que define o comportamento de uma lista linear.
 */
public interface List<E> {
	/**
	 * Informa a quantidade de elementos armazenados na lista.
	 * @return A quantidade de elementos armazenados na lista.
	 */
	public int numElements();
	
	/**
	 * Informa se a lista est� vazia.
	 * @return Verdadeiro se a lista estiver vazia,
	 * 			falso caso contr�rio.
	 */
	public boolean isEmpty();
	
	/**
	 * Informa se a lista est� cheia.
	 * @return Verdadeiro se a lista estiver cheia,
	 * 			falso caso contr�rio.
	 */
	public boolean isFull();
	
	/**
	 * Insere um novo elemento na posi��o indicada.
	 * @param element O elemento a ser inserido
	 * @param pos A posi��o onde o elemento ser� inserido
	 * 				(iniciando em 0)
	 */
	public void insert(E element, int pos);
	
	/**
	 * Remove o elemento da posi��o indicada.
	 * @param pos A posi��o de onde o elemento ser� removido
	 * 				(iniciando em 0)
	 * @return O elemento removido
	 */
	public E remove(int pos);
	
	/**
	 * Retorna o elemento da posi��o indicada, sem remov�-lo.
	 * @param pos A posi��o do elemento
	 * @return O elemento
	 */
	public E get(int pos);
	
	/**
	 * Localiza a primeira ocorr�ncia do elemento indicado na lista.
	 * @param element O elemento a ser localizado
	 * @return A posi��o da primeira ocorr�ncia do elemento,
	 * 			ou -1 se ele n�o for encontrado.
	 */
	public int search(E element);
}