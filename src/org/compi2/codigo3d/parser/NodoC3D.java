package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String ev = "";
    private String ef = "";

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public String getCad(){
        return cad;
    }
    public String getEV(){
        return ev;
    }
    public String getEF(){
        return ef;
    }
    public void concatEV(String etiqueta){
        ev = ev + ":\n"+etiqueta;
    }
    public  void concatEF(String etiqueta){
        ef = ef + ":\n"+etiqueta;
    }

    public void setEV(String ev) {
        this.ev = ev;
    }

    public void setEF(String ef) {
        this.ef = ef;
    } 
}
