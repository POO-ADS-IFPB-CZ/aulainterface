import java.io.Serializable;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class App {

    public static void main(String[] args) {

        Pessoa pessoas[] = {
            new Pessoa("João",
                    LocalDate.of(2000,10,3)),
            new Pessoa("Maria",
                    LocalDate.of(1998, 3, 21)),
            new Pessoa("Ana",
                    LocalDate.of(1999,4,1))
        };
        Arrays.sort(pessoas);
        System.out.println(Arrays.toString(pessoas));

        OrdenadorNascimento ordenadorNascimento
                = new OrdenadorNascimento();
        Arrays.sort(pessoas, ordenadorNascimento);
        System.out.println(Arrays.toString(pessoas));
    }

    static class OrdenadorNascimento implements Comparator<Pessoa> {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return p1.getNascimento()
                    .compareTo(p2.getNascimento());
        }
    }

}
