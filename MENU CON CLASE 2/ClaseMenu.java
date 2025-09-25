class ClaseMenu {
    private String tipo;
    private String receta;
    private String tamano;

    public ClaseMenu(String tipo, String receta, String tamano){
        this.tipo = tipo;
        this.receta = receta;
        this.tamano = tamano;
    }

    public void setTipo(String tipo){
        if( tipo != null){
        this.tipo = tipo;
        }
    }

    public void setReceta(String receta){
        if(receta != null){
        this.receta = receta;
        }
    }

    public String getTipo(){
        return tipo;
    }

    public String getReceta(){
        return receta;
    }

    public void setTamano(String tamano){
        if(tamano != null){
        this.tamano = tamano;
        }
    }

    public String getTamano(){
        return tamano;
    }
    
    public String toString(){
        return tipo + receta + tamano;
    }
}
