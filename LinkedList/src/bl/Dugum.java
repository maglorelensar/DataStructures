/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

import bagliliste.Human;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Dugum {
    public Human deger;
    public Dugum sonraki;

    public Dugum(Human h) {
        this.deger=h;
        this.sonraki=null;        
    }

    public Dugum() {
    }
    public Human getDeger() {
        return deger;
    }

    public void setDeger(Human deger) {
        this.deger = deger;
    }

    public Dugum getSonraki() {
        return sonraki;
    }

    public void setSonraki(Dugum sonraki) {
        this.sonraki = sonraki;
    }

    @Override
    public String toString() {
        return "Dugum{" + "deger=" + deger + ", sonraki=" + sonraki + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.deger);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dugum other = (Dugum) obj;
        if (!Objects.equals(this.deger, other.deger)) {
            return false;
        }
        if (!Objects.equals(this.sonraki, other.sonraki)) {
            return false;
        }
        return true;
    }


    
}

    

   
