package f290_tp2_poo_overview.domain;

import java.time.LocalDate;
import java.util.List;

public class Programador extends Funcionario {
    
    private List<String> stack;

    public Programador(String nome, String email, 
            String telefone, Long matricula,
            LocalDate dataAdmissao, List<String> stack) {
        super(nome, email, telefone, matricula, dataAdmissao);
        this.stack = stack;
    }

    public List<String> getStack() {
        return stack;
    }

    public void setStack(List<String> stack) {
        this.stack = stack;
    }
    
    @Override
    public String getInformacao() {
        return String.format("Nome: %s\nE-Mail: %s\nTel%s\nMatricula:%s\nAdmissao: %s\nStack: [ %s ]\n\n", 
                getNome(), 
                getEmail(), 
                getTelefone(), 
                getMatricula(),
                getDataAdmissao(),
                getStack()
        );
    }
    
}
