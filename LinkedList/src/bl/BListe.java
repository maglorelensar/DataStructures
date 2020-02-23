/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author LENOVO
 */
public class BListe {
    private Dugum ilk;
    private Dugum son;
    private int elemanSayisi;

    public BListe() {
        this.ilk=null;
        this.son=null;
        this.elemanSayisi=0;
    }
      public void basaEkle(Dugum n){
        n.sonraki=ilk;
        ilk=n;
        if(this.elemanSayisi==0){
            son=n; 
        }
          this.elemanSayisi++;
    }
    
    public void SonaEkle(Dugum n){
        if(this.elemanSayisi==0){
            this.basaEkle(n);
        }else{
        son.sonraki=n;
        son=n;}
        this.elemanSayisi++;
    }
    public Dugum arayaEkle(Dugum n){
        if(this.elemanSayisi ==0){
            this.basaEkle(n);
        }else{
            if(ilk.deger.age > n.deger.age){
                this.basaEkle(n);
            }
            Dugum tmp=ilk;
            while(tmp.sonraki !=null && tmp.sonraki.deger.age<n.deger.age){
                tmp=tmp.sonraki;
        if(tmp==son){
            son=n;
        }//if(d.sonraki=null){
       // son=d}
        n.sonraki=tmp.sonraki;
        tmp.sonraki=n;
        //if(d.sonraki=null){
        // son=d}
        this.elemanSayisi++;
       
        }} 
        return n;
    }
    public Dugum bastanSil(){
        if(this.elemanSayisi==0){
            return null;
        }
        Dugum tmp=ilk;
        ilk=ilk.sonraki;
        this.elemanSayisi--;
        return tmp;
    }
    public Dugum sondanSil(){
        if(this.elemanSayisi==0){
            return null;
        }//bastansil();
        if(ilk==son){
            //bastansil();
            Dugum tmp=ilk;
            ilk=null;
            son=null;
            this.elemanSayisi--;
            return tmp;//return this.bastansil();
        }
        Dugum tmp=ilk;
        while(tmp.sonraki != son){
            tmp=tmp.sonraki;
        }
        Dugum ret= tmp.sonraki;
        //tmp.sonraki=null;
        son=tmp;
        son.sonraki=null;
        return ret;
    }
    public Dugum aradanSil(Dugum n){
          if(this.elemanSayisi==0){
            return null;
          }if(elemanSayisi==1){
              ilk=null;
              son=null;
              elemanSayisi--;
          }
          if(this.ilk.equals(n)){
              return bastanSil();
          }
          Dugum tmp=ilk;
          while(tmp.sonraki !=null&&tmp.sonraki.equals(n)){
              tmp=tmp.sonraki;
          }
          if(tmp.sonraki == null){
              return null;
          }
        
     Dugum silinecek=tmp.sonraki;
          tmp.sonraki=tmp.sonraki.sonraki;
         this.elemanSayisi--;
        return silinecek;}
        
  
public void print(){
    Dugum tmp=ilk;
    while(tmp != null){
        System.out.print(tmp.deger);
        tmp=tmp.sonraki;
    }
    System.out.println(" ");
}
    
    public Dugum getIlk() {
        return ilk;
    }

    public void setIlk(Dugum ilk) {
        this.ilk = ilk;
    }

    public Dugum getSon() {
        return son;
    }

    public void setSon(Dugum son) {
        this.son = son;
    }

    public int getElemanSayisi() {
        return elemanSayisi;
    }

    public void setElemanSayisi(int elemanSayisi) {
        this.elemanSayisi = elemanSayisi;
    }
    
}
