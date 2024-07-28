package au08;

public class Livro implements Publicacao{
    public String titulo;
    public String autor;
    public int totPaginas;
    public int pagAtual;
    public boolean aberto;
    public Pessoa leitor;
	
	public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void avancarPagina() {
		this.pagAtual++;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}
    
	@Override
	public void folhear(int p) {
		this.pagAtual = p;
	}
    
	@Override
	public void voltarPagina() {
		this.pagAtual--;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	public void detalhes() {
		System.out.println("livro " + getTitulo() +
							"\n autor " + getAutor() +
							"\n paginas " + getTotPaginas() +
							"\n leitor " + getLeitor() +
							"\n Aberto " + isAberto() +
							"\n pag atual " + getPagAtual());
	}
    
}
