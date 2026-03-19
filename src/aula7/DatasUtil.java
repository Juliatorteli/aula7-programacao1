package aula7;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DatasUtil {

    public static String dataPorExtenso() {

        LocalDateTime agora = LocalDateTime.now();

        String diaSemana = agora.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-BR"));

        int dia = agora.getDayOfMonth();

        String mes = agora.getMonth()
                .getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt-BR"));

        int ano = agora.getYear();
        int hora = agora.getHour();
        int minuto = agora.getMinute();

        return "Hoje é " + diaSemana + ", dia " + dia + " de " + mes + " de " + ano +
               " e agora são " + hora + " horas e " + minuto + " minutos.";
    }
}