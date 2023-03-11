package f290_tp2_poo_overview;

import f290_tp2_poo_overview.domain.Pessoa;

public class F290_tp2_poo_overview {

    public static void main(String[] args) {
        var p1 = new Pessoa("Enzo Gabriel", "enzo@me.com", "99999-8888");
        System.out.println(p1.getInformacao());
    }
    
}
