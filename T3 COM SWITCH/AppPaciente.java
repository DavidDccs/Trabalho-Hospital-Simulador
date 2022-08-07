import java.util.*;
import java.math.*;
/**
 * Simulador de um arquivo de hospital com diagnósticos, convênios e dados dos pacientes.
 *
 * @author David Campos e Rodrigo Binsfeld
 * @version V3
 */
public class AppPaciente
{
    public static Scanner in = new Scanner (System.in);
    public static void main (String [] args){
    long cpf = cpf(); // cpf gerado com numero aleatorio de 11 digitos
    long cpf1 = cpf ();// cpf gerado com numero aleatorio de 11 digitos
    long cpf2 = cpf();// cpf gerado com numero aleatorio de 11 digitos 
    String nome = nome();
    String nome1 = "Valdirene";
    String nome2 = "Jocelino";
    long telefone = telefone();
    String convenio = convenio();
    String diagnostico = diagnostico();
    String diagnostico1 = "Zica";
    String diagnostico2 ="Dengue";
    int numeroConsultas = numeroConsultas();
    int numeroConsultas1 = 2;
    int numeroConsultas2 = 3;
    Paciente um = new Paciente(nome1,cpf1, 51999887710L, "ESTRELA", diagnostico1, numeroConsultas1);
    Paciente dois = new Paciente(nome2,cpf2, 51966226710L, "HELP class", diagnostico2, numeroConsultas2 );
    Paciente tres = new Paciente (nome, cpf, telefone, convenio, diagnostico, numeroConsultas);
    System.out.println("\f");
    while(true){
    int escolha=menu();
    if (escolha ==0){System.out.println("\fVocê fechou o programa, adeus :)"); break;}
        switch(escolha){
        case 1: System.out.println("\f Dados dos pacientes:" +"\n" + um +"\n" + dois +"\n" + tres +"\n"); break;
            
        case 2:
        System.out.println("\f Insira aqui o nome do paciente que deseja alterar o diagnóstico");
        String alterarNome = in.next();
        alterarNome=alterarNome.toUpperCase();
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        nome = nome.toUpperCase();
        if(nome1.equals(alterarNome)){ System.out.println("\f Você está alterando o diagnóstico de Valdirene, insira o novo diagnóstico"); diagnostico1 = diagnostico(); um.setDiagnostico(diagnostico1);}
        else if (nome2.equals(alterarNome)) {System.out.println("\f Você está alterando o diagnóstico de Jocelino, insira o novo diagnóstico"); diagnostico2 = diagnostico(); dois.setDiagnostico(diagnostico2);}
        else if(nome.equals(alterarNome)){System.out.println("\f Você está alterando o diagnóstico de " + nome +", insira o novo diagnóstico"); diagnostico = diagnostico(); tres.setDiagnostico(diagnostico);}
        else{System.out.println("Nome não encontrado\n\n\n");}
        break;
                
        
        case 3:
            
        int numeroTotal = numeroConsultas+numeroConsultas1+numeroConsultas2;
        int preco = numeroTotal * 150;
        
        System.out.println("\fO total a receber pela consulta de todos os pacientes é de " + preco +"$" + "\n\n\n");
        
        
        break;
        
        case 4:
        int count1=0;
        int count2=0;
        int count3=0;
        nome1 = nome1.toUpperCase();
        nome2 = nome2.toUpperCase();
        nome = nome.toUpperCase();
        for(int i1 = 0 ; i1<nome.length() ; i1 ++){ char ch = nome.charAt(i1); if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){count1 ++;}}
        for(int i2 = 0 ; i2<nome1.length() ; i2 ++){ char ch = nome1.charAt(i2); if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){count2 ++;}}
        for(int i3 = 0 ; i3<nome2.length() ; i3 ++){ char ch = nome2.charAt(i3); if (ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){count3 ++;}}
        if(count1 > count2 && count1>count3){System.out.println("\fO nome com mais vogais é " + nome + "\n\n\n"); }
        else if(count2 > count1 && count2>count3){System.out.println("\fO nome com mais vogais é " + nome1 + "\n\n\n"); }
        else if(count3 > count1 && count3>count2){System.out.println("\fO nome com mais vogais é " + nome2 +"\n\n\n"); }
        else{System.out.println("\f Não há nome com mais vogal, é possivel que todos possuam a mesma quantidade de vogais ou dois possuam a mesma quantidade\n\n\n");}
        break;
        
        case 5:
        int contadorCovid = 0;
        int contadorZica = 0;
        int contadorChikungunya = 0;
        int contadorDengue = 0;
        int contadorOutro = 0;
        
        if(diagnostico1.equals("Covid") ) {contadorCovid++;}if (diagnostico2.equals("Covid")) {contadorCovid++;}if(diagnostico.equals("Covid")) {contadorCovid++;}
        if(diagnostico1.equals("Zica")) {contadorZica++;}if(diagnostico2.equals("Zica")) {contadorZica++;}if (diagnostico.equals("Zica")) {contadorZica++;}
        if(diagnostico1.equals("Chikungunya")) {contadorChikungunya++;}if(diagnostico2.equals("Chikungunya")){contadorChikungunya++;}if(diagnostico.equals("Chikungunya")){contadorChikungunya++;}
        if(diagnostico1.equals("Dengue")) {contadorDengue++;}if(diagnostico2.equals("Dengue")){contadorDengue++;}if (diagnostico.equals("Dengue")){contadorDengue++;}
        if(diagnostico1.equals("Outro")) {contadorOutro++;}if(diagnostico2.equals("Outro")){contadorOutro++;}if(diagnostico.equals("Outro")){contadorOutro++;}
        
        System.out.println("\fPessoas com covid:" + contadorCovid + " Porcentagem:" + (contadorCovid/3.*100) + "%" + "\nPessoas com Zica:" + contadorZica + " Porcentagem:" + (contadorZica/3.*100) + "%"+ "\nPessoas com Chikungunya:" + contadorChikungunya + " Porcentagem:" + (contadorChikungunya/3.*100) + "%" + "\nPessoas com Dengue:" + contadorDengue + " Porcentagem:" + (contadorDengue/3.*100) + "%" + "\nPessoas com outras doenças:" +contadorOutro + " Porcentagem:" + (contadorOutro/3.*100) + "%\n\n\n\n");

        break;
        
        case 6: dois.setConvenio("HEAVEN SAÚDE"); System.out.println("\f O convênio de " +nome2 +" foi trocado!\n\n\n"); break;
        
        
        
        default: System.out.println("\fEscolha uma opção valida!\n\n\n"); break;
    
    }
}
}
public static int menu() {
System.out.println("O que deseja fazer?");
System.out.println("1- Conferir os dados dos pacientes \n2-Alterar o diagnóstico de algum paciente \n3-Sabero valor total das consultas de todos os paciêntes \n4-Escrever o nome do paciente que possui mais vogais \n5-Saber as estatísticas da quantidade de paciente com cada doença \n6- Trocar convênio do segundo paciente para HEAVEN SAÚDE \n0-Fechar o programa");
int menu = in.nextInt();

return menu;
}

   public static long cpf ()
    {Random rnd = new Random();
     long cpf = (long) (10000000000L + rnd.nextFloat() * 99999999999L);
     return cpf;
    }
    public static String nome()
    {
        System.out.println("\fInsira aqui o primeiro nome do paciente:");
        String nome = in.next();
        return nome;
    }
    public static long telefone()
    {
        System.out.println("\fInsira aqui o telefone do paciente COM DDD(Estado/Cidade) e tudo junto:");
        long telefone = 0;
        return telefone;
    }
    public static String convenio()
    {
        System.out.println("\fInsira aqui o convenio do paciente:");
        String convenio = in.next();
        return convenio;
    }
    public static String diagnostico (){
        System.out.println("\fEscolha o diagnóstico do paciente");
        System.out.println("1- Covid 2- Zica 3- Chikungunya 4- Dengue 5- Outro");
        String diagnostico = "";
        int escolha = 0;
        escolha = in.nextInt();
        switch(escolha){
        case 1: diagnostico = "Covid"; break;
        case 2: diagnostico = "Zica"; break;
        case 3: diagnostico = "Chikungunya"; break;
        case 4: diagnostico = "Dengue"; break;
        case 5: diagnostico = "Outro"; break;
        }
        return diagnostico;
    }
    public static int numeroConsultas(){
        System.out.println("\fInsira aqui o número de consultas do paciente:");
        int numeroConsultas = in.nextInt();
        return numeroConsultas;
    }
} 
