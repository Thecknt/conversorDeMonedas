import service.ServiceCoin;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ServiceCoin service = new ServiceCoin();
        Scanner input = new Scanner(System.in);
        int option = 0;
        while (option != 9) {
            System.out.println("""
                    *********************************************************************
                    *             Bienvenidos al conversor de Monedas                   *
                    *-------------------------------------------------------------------*
                    *   Seleccione el tipo de moneda que quiera comparar con el USD.    *
                    *  1) Convertir Pesos Argentinos a => USD                           *
                    *  2) Convertir USD a => Pesos Argentinos                           *
                    *  3) USD a => Real Brasileño                                       *
                    *  4) Real Brasileño a => USD                                       *
                    *  5) USD a => Peso Colombiano                                      *
                    *  6) Peso Colombiano a => USD                                      *
                    *  7) Peso Argentino a => Real Brasilero                            *
                    *  8) Peso Argentino a => Euros                                     *
                    *  9) Salir => Exit                                                 *
                    *********************************************************************
                    """);
            option = input.nextInt();
            String base_code;
            String target_code;
            Double conversion_result;

            switch (option) {
                case 1:
                    System.out.println("Ud eligio convertir pesos Argentinos a USD");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "USD";
                    base_code = "ARS";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 2:
                    System.out.println("Ud eligio convertir USD a pesos Argentinos");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "ARS";
                    base_code = "USD";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 3:
                    System.out.println("Ud eligio convertir USD a Reales");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "BRL";
                    base_code = "USD";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 4:
                    System.out.println("Ud eligio convertir Reales a USD");
                    System.out.println("Ingrese el monto que desea convertir");
                    conversion_result = input.nextDouble();
                    target_code = "USD";
                    base_code = "BRL";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 5:
                    System.out.println("Ud eligio convertir USD a pesos Colombianos");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "COP";
                    base_code = "USD";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 6:
                    System.out.println("Ud eligio convertir pesos Colombianos a USD");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "USD";
                    base_code = "COP";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 7:
                    System.out.println("Ud eligio convertir pesos Argentinos a Real");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "BRL";
                    base_code = "ARS";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 8:
                    System.out.println("Ud eligio convertir pesos Argentinos a EUR");
                    System.out.println("Ingrese el monto que desea convertir: ");
                    conversion_result = input.nextDouble();
                    target_code = "EUR";
                    base_code = "ARS";
                    service.getResponse(base_code, target_code, conversion_result);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar Nuestro gestor de monedas" +
                            "\nSaliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente");
                    break;
            }
        }
        input.close();
    }
}