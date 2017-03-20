
package lampada;

public class Lampada {
    boolean ligada;
    
    public Lampada(){
        ligada = false;
    }
    
    public void acender(){
        ligada = true;
    }
    
    public void apagar(){
        ligada = false;
    }
}
