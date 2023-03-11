package f290_tp2_poo_overview.domain;

import java.time.LocalDate;
import java.util.Random;

public class Pediatra extends Medico implements ContratoVacina{

    public Pediatra(String nome, String email,
            String telefone, Long matricula, 
            LocalDate dataAdmissao, Integer crm) {
        super(nome, email, telefone, matricula, dataAdmissao, crm);
    }

    @Override
    public String getInformacao() {
        return String.format("""
                             Nome: %s
                             E-Mail: %s
                             Tel%s
                             Matricula:%s
                             Admissao: %s
                             CRM: %s
                             
                             """, 
                getNome(), 
                getEmail(), 
                getTelefone(), 
                getMatricula(),
                getDataAdmissao(),
                getCrm()
        );
    }

    @Override
    public void executarProcediemento(Paciente paciente)  throws Exception{
        System.out.printf("Atendendo %s...", paciente.getNome());
        System.out.println("Medindo a temperatura...");
        Thread.sleep(3000);
        System.out.printf("Temperatura %s graus.\n", new Random().nextInt(40));
        vacinar(paciente);
        Thread.sleep(3000);
        System.out.printf("Finalizou o atendimento de %s.\n", paciente.getNome());
        System.out.println("=)");
    }

    @Override
    public void vacinar(Paciente paciente) {
        System.out.printf("Aplicada a vacina em %s...", paciente.getNome());
        System.out.println("=)");
    }
    
}
