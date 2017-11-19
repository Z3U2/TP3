// Using Date Class from TP2
public class Produit implements Comparable<Produit>,Cloneable {
    private String code;
    private Date dt;

    public void setCode(String code) {
        this.code = code;
    }

    public void setDt(Date dt) {
        this.dt = dt;
    }

    public Produit(String code, Date dt){
        this.code = code;
        this.dt = dt;
    }

    public Produit(Date dt){
        this(null,dt);
    }

    public Produit(){

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj instanceof Produit) {
            if (((Produit) obj).code.equals(this.code)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Produit " + code + " dont la date de fin de validité est " + dt;
    }

    public int compareTo(Produit produit){
        return code.compareTo(produit.code);
    }

    public int compareDate(Produit produit){
        return dt.compareTo(produit.dt);
    }

    public boolean isOlder(Produit produit){
        return dt.compareTo(produit.dt)<0;
    }

    public Produit clone() throws CloneNotSupportedException{
        return new Produit(this.code,this.dt.clone());
    }

}
