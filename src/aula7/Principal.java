package aula7;

import java.time.LocalDate;
import java.time.Period;

public class Principal {

    public static void main(String[] args) {

        contaTempo(4, 1, 2027);

        System.out.println(DatasUtil.dataPorExtenso());
    }

    public static void contaTempo(int dia, int mes, int ano) {

        LocalDate hoje = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);

        Period periodo = Period.between(hoje, dataFutura);

        int anos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.println("Faltam " + anos + " ano(s), "
                + meses + " mês(es) e "
                + dias + " dia(s) para essa data em " + ano + ".");
    }
}