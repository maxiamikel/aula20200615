package aula20200615;

public class App {

	public static void main(String[] args) {
		Endereco endereco1 = new Endereco("Rua Hulda Humming Campos Sales","1024-B","Casa1","vila Bosque","Maringa","PR");
		Endereco endereco2 = new Endereco("Rua Hulda Humming Campos Sales","24-B","Apartamento 1457","vila Bosque","Maringa","PR");
		
		Aluno aluno1 = new Aluno(1200,"Hector Victor","de Oliveira Sanchaz",1990);
		Aluno aluno2 = new Aluno(1241,"Amikel ","Maxi Celestin",1989);
		//aluno2.setEnderecos(endereco2);
		//aluno1.setEnderecos(endereco1);
		aluno1.setEnderecoPrincipal(endereco2);
		
		
		Coordenador coordenador1 = new Coordenador("Jean Baptiste","Jules",1988);
		
		Professor professor1 = new Professor("Atrhur","Azavadski",1980);
		Professor professor2 = new Professor("Alexandre","Moreno",1980);
		
 
		Turma turma2 = new Turma("T-54478","Turma integral");
		Turma turma1 = new Turma("T-5424","Turma de verão");
		turma1.setAlunos(aluno1);
		turma1.setAlunos(aluno2);
		turma1.setLider(aluno2);
		
		
		Curso ads = new Curso("231-800","Analisis e Desenvolvimento de Sistemas");
		ads.setTurma(turma1);
		ads.setTurma(turma2);
		ads.setCoordenador(coordenador1);
		
		
		System.out.println("Curso: " +ads.getCodigoCurso());
		System.out.println("Descicão do cuero: "+ ads.getDescricao());
		System.out.println("Coordenador: "+ ads.getCoordenador().prinmeiroNome +" "+ ads.getCoordenador().getSobreNume());
		System.out.println("Quantidade de turma: "+ ads.getTurmas().size());
		for(Turma turma:ads.turmas) {
			int i=0;
			System.out.println("Codigo Turma 1: " +ads.getTurmas().get(i).getCodigoTurma());
			System.out.println("Nome Turma 1: " +ads.getTurmas().get(i).getDescricao());
			i+=1;
		}
		

	}

}

