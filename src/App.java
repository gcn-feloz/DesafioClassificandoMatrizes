import java.util.*;

public class App {
    public static void main(String args[]) {

        ArrayList<Integer> numsList = new ArrayList<Integer>(); // Armazena números classificados.

        Scanner input = new Scanner(System.in);
        int ii, i, x;
        int N = input.nextInt();
        int[] nums = new int[N];

        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        // TODO: mova todos os inteiros pares para o inicio do array, seguido por todos
        // os números ímpares

        for (i = 0; i < N; i++) {
            System.out.println("Verificando Pares: " + nums[i] + " " + nums[i] % 2);

            if (nums[i] % 2 == 0) {
                x = nums[i];
                System.out.println(x);
                System.out.println(nums[i]);

                for (ii = 0; ii<N; ii++) {
                    System.out.println("entrou no segundo FOR: " + nums[ii]);
                    if (nums[ii] % 2 == 1) {
                        nums[i] = nums[ii];
                        nums[ii] = x;
                        System.out.println("trocando...");
                        break;
                    }
                }

            }

        }
        System.out.println("Nova sequencia:");
        for (i = 0; i < N; i++) {
            System.out.println(nums[i]);
        }

        // for (i = 0; i < N; i++) {
        // System.out.println("Verificando Impares: " + nums[i] + " " + nums[i] % 2);
        // if (nums[i] % 2 == 1) {
        // numsList.add(nums[i]);
        // System.out.println("Adicionando " + nums[i] + " na lista: " +
        // numsList.get(numsList.size() - 1));
        // }
        // }
        // for (i = 0; i < numsList.size(); i++) {
        // System.out.println(numsList.get(i));
        // }

    }
}