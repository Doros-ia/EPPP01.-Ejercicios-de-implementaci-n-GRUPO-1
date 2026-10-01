import java.util.Scanner;

public class SmartToll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tipo, ejes, hora, camiones = 0;
        String placa, placaMayor = "";
        double tarifa = 0, total = 0, tarifaMayor = 0;

        System.out.print("Cantidad de vehiculos: ");
        n = scanner.nextInt();
        while (n <= 0) {
            System.out.print("Ingrese una cantidad mayor que cero: ");
            n = scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Vehiculo " + i);
            System.out.print("Placa sin espacios (5 a 8 caracteres): ");
            placa = scanner.next();
            while (placa.length() < 5 || placa.length() > 8) {
                System.out.print("Placa invalida. Ingrese nuevamente: ");
                placa = scanner.next();
            }
            System.out.print("Tipo: 1 Moto, 2 Automovil, 3 Camion: ");
            tipo = scanner.nextInt();
            while (tipo < 1 || tipo > 3) {
                System.out.print("Tipo invalido. Ingrese de 1 a 3: ");
                tipo = scanner.nextInt();
            }
            System.out.print("Numero de ejes: ");
            ejes = scanner.nextInt();
            while (ejes < 2 || (tipo != 3 && ejes != 2)) {
                System.out.print("Moto/auto: 2; camion: 2 o mas: ");
                ejes = scanner.nextInt();
            }
            System.out.print("Hora de paso (0 a 23): ");
            hora = scanner.nextInt();
            while (hora < 0 || hora > 23) {
                System.out.print("Hora invalida. Ingrese de 0 a 23: ");
                hora = scanner.nextInt();
            }
            switch (tipo) {
                case 1:
                    tarifa = 0.20;
                    break;
                case 2:
                    tarifa = 1.00;
                    break;
                case 3:
                    if (ejes >= 6) {
                        tarifa = 6.00;
                    } else {
                        tarifa = ejes;
                    }
                    break;
            }
            total = total + tarifa;
            if (tipo == 3 && ejes > 4) {
                camiones++;
            }
            if (tarifa > tarifaMayor) {
                tarifaMayor = tarifa;
                placaMayor = placa;
            }
            System.out.println("Placa: " + placa + " | Hora: " + hora);
            System.out.println("Tarifa: $" + tarifa);
        }
        total = Math.round(total * 100.0) / 100.0;
        System.out.println("Total recaudado: $" + total);
        System.out.println("Camiones con mas de 4 ejes: " + camiones);
        System.out.println("Placa con tarifa mas alta: " + placaMayor);
        System.out.println("Tarifa mas alta: $" + tarifaMayor);
        scanner.close();
    }
}
