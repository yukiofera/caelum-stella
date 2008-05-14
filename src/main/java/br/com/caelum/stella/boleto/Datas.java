package br.com.caelum.stella.boleto;

import java.util.Calendar;

public class Datas {
	private Calendar documento;
	private Calendar processamento;
	private Calendar vencimento;

	private Datas() {
	}

	/**
	 * Cria novas datas<br/> Data do documento padrão: data atual<br/> Data do
	 * processamento padrão: data atual
	 * 
	 */
	public static Datas newDatas() {
		return new Datas().comDocumento(Calendar.getInstance())
				.comProcessamento(Calendar.getInstance());
	}

	/**
	 * Devolve a data do documento do boleto. (data de geração do boleto)<br/>
	 * Valor padrão: data de criação do boleto
	 * 
	 * @return
	 */
	public Calendar getDocumento() {
		return this.documento;
	}

	/**
	 * Associa uma data do documento.<br/> Valor padrão: data atual
	 * 
	 * @param documento
	 */
	public Datas comDocumento(Calendar documento) {
		this.documento = documento;
		return this;
	}

	/**
	 * Devolve a data de processamento do boleto. (data de geração do boleto)<br/>
	 * Valor padrão: data de criação do boleto
	 * 
	 * @return
	 */
	public Calendar getProcessamento() {
		return this.processamento;
	}

	/**
	 * Associa uma data do processamento.<br/> Valor padrão: data atual
	 * 
	 * @param processamento
	 */
	public Datas comProcessamento(Calendar processamento) {
		this.processamento = processamento;
		return this;
	}

	public Calendar getVencimento() {
		return this.vencimento;
	}

	public Datas comVencimento(Calendar vencimento) {
		this.vencimento = vencimento;
		return this;
	}

	/**
	 * Devolve um Calendar, dado dia, mês e ano
	 * 
	 * @param dia
	 * @param mes
	 * @param ano
	 * @return
	 */
	public static Calendar dataPara(int dia, int mes, int ano) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DAY_OF_MONTH, dia);
		c.set(Calendar.MONTH, mes - 1);
		c.set(Calendar.YEAR, ano);
		return c;
	}
}
