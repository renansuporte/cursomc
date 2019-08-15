package br.com.cursos.cursomc.domain.enuns;

public enum TipoCliente {
	PESSOA_FISICA(1, "Pessoa fisíca"), PESSOA_JURIDICA(2, "Pessoa juridíca");

	private int cod;
	private String descricao;

	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if (codigo.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("O código informado não é valido para o enum " + codigo);
	}
}
