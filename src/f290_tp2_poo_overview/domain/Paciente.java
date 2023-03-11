package f290_tp2_poo_overview.domain;

class Paciente extends Pessoa{

    public Paciente(String nome, String email, String telefone) {
        super(nome, email, telefone);
    }

    @Override
    public String getInformacao() {
        return String.format("Paciente[ Nome: %s, email: %s, tel: %s ]\n", 
            getNome(),getEmail(), getTelefone()
        );
    }
    
}
