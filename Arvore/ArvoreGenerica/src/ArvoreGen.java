import java.util.ArrayList;
import java.util.Iterator;

public class ArvoreGen {

    private No raiz;
	private int tamanho;
	
	public ArvoreGen(Object elem) {
		raiz = new No(null, elem);
		tamanho = 1;
	}

   
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public No getRaiz() {
		return this.raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}
	
	////////////////////////////////////////
	public int size() {
		ArrayList<No> nodes = new ArrayList<No>();
	    preOrderNodes(raiz, nodes);
	    return nodes.size();
	}
	
	public int tamanho() {
		return this.getTamanho();
	}
    
    public boolean isEmpty() {
		return false;
	}
	/////////////////////////////////////////

	
	

	public Iterator<Object> elements() {
	    ArrayList<Object> elems = new ArrayList<Object>();
	    preOrderElements(raiz, elems);
	    return elems.iterator();
	}

	private void preOrderElements(No node, ArrayList<Object> elems) {
	    elems.add(node.getElemento());

	    Iterator<No> it = node.Filho();
	    while (it.hasNext()) {
	        preOrderElements(it.next(), elems);
	    }
	}
	
	public Iterator<No> nos() {
	    ArrayList<No> nodes = new ArrayList<No>();
	    preOrderNodes(raiz, nodes);
	    return nodes.iterator();
	}
    //////////////////////////////////////////////////////
	private void preOrderNodes(No node, ArrayList<No> nodes) {
	    nodes.add(node);

	    Iterator<No> it = node.Filho();
	    while (it.hasNext()) {
	        preOrderNodes(it.next(), nodes);
	    }
	}
	public void preOrder(No node) {
		System.out.println(node.getElemento());
		Iterator<No> it = node.Filho();
		while(it.hasNext()) {
			preOrder(it.next());
		}
	}
	///////////////////////////////////////////////////
	
	public No raiz() {
		return this.getRaiz();
	}
	
	public No parent(No no) {
		return no.getPai();
	}
	
	public Iterator<No> Filho(No v)
	{
		return v.Filho();
	}
	
	public boolean isInternal(No no) {
		return no.FilhoNumber() > 0;
	}
	
	public boolean isExternal(No no) {
		return no.FilhoNumber() == 0;
	}
	
	public boolean israiz(No no) {
		return no == raiz;
	}
	
	public void addFilho(No no, Object element){
		No novo = new No(no, element);
		no.addFilho(novo);
		tamanho++;
	}
	public void addNo(Object element, No father) {
		No newNode = new No(father, element);
		newNode.getPai().addFilho(newNode);
	}
	
	///////////////////////////////////////////////////////////////////
	public No searchNode(No node, Object elem) {
		if(node.getElemento().equals(elem)) {
			return node;
		}
		
		Iterator<No> it = node.Filho();
		while(it.hasNext()) {
			No result = searchNode(it.next(), elem);
			if(result != null) {
				return result;
			}
		}
		
		return null;

	}
	public Object remove(No no){
		No pai = no.getPai();
		if (pai != null || isExternal(no))
			pai.removeFilho(no);
		else
			System.out.println("A remoção não foi bem sucedida!");
		Object o = no.getElemento();
		tamanho--;
		return o;
	}
	////////////////////////////////////////////////////////////
	public void swapElements(No v, No w)
	{
		Object temp = v.getElemento();
		v.setElemento(w.getElemento());
		w.setElemento(temp);
	}
    
    //////////////////////////////////////////////////////////
	public int altura(No no) {
    if (no == null) {
        return -1;
    }

    int alturaMaxima = -1;
    Iterator<No> it = no.Filho();

    while (it.hasNext()) {
        int alturaFilho = altura(it.next());
        alturaMaxima = Math.max(alturaMaxima, alturaFilho);
    }

    return alturaMaxima + 1;
    
    }
    

	public int profundidade(No node)
	{
		int profundidade = depth(node);
		return profundidade;
	}
	
	public int depth(No no) {
		if(israiz(no)) {
			return 0;
		} else {
			return 1+depth(no.getPai());
		}
	}


    ///////////////////////////////////////////////////////
	
	public Object replace(No no, Object o) {
		Object temp = no.getElemento();
		no.setElemento(o);
		return temp;
	}
	
	
	
}