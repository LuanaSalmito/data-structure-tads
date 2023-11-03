import java.util.ArrayList;
import java.util.Iterator;

public class No {

    private No Pai;
    private Object Elemento;
	private ArrayList<No> Filho = new ArrayList<No>();
	
	public No(No Pai, Object Elemento){
		this.Pai = Pai;
		this.Elemento = Elemento;
	}
	
	public No getPai() {
		return this.Pai;
	}
	public void setPai(No Pai) {
		this.Pai = Pai;
	}
	public Object getElemento(){
		return this.Elemento;
	}
	public void setElemento(Object Elemento){
		this.Elemento = Elemento;
	}
	
	
	public void addFilho(No o){
		Filho.add(o);
	}
	
	public void removeFilho(No o){
		Filho.remove(o);
	}
	
	public Iterator<No> Filho(){
		return Filho.iterator();
	}
	public int FilhoNumber(){
		return Filho.size();
	}

    
}
