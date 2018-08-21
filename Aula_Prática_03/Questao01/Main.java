public class Main{
	public static void main(String[] args){
		
		Prova prova1Aluno1 = new Prova(4.0,2.5);
		Prova prova2Aluno1 = new Prova(1.0,7.0);
		Aluno aluno1 = new Aluno(prova1Aluno1, prova2Aluno1);

		Prova prova1Aluno2 = new Prova(6.5,3.5);
		Prova prova2Aluno2 = new Prova(0.0,3.0);
		Aluno aluno2 = new Aluno(prova1Aluno2, prova2Aluno2);

		Prova prova1Aluno3 = new Prova(5.0,4.0);
		Prova prova2Aluno3 = new Prova(6.0,1.5);
		Aluno aluno3 = new Aluno(prova1Aluno3, prova2Aluno3);

		Turma turma = new Turma(aluno1, aluno2, aluno3);

		System.out.println("Media aluno 1: " + aluno1.calcularMedia());
		System.out.println("Media aluno 2: " + aluno2.calcularMedia());
		System.out.println("Media aluno 3: " + aluno3.calcularMedia());
		
		System.out.println("Media geral da turma: " + turma.calcularMedia());
	}
}
