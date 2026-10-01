#include <iostream>
#include <string>
#include <cmath>
using namespace std;

int main() {
    int n, tipo, ejes, hora, camiones = 0;
    string placa, placaMayor = "";
    double tarifa = 0, total = 0, tarifaMayor = 0;

    cout << "Cantidad de vehiculos: ";
    cin >> n;
    while (n <= 0) {
        cout << "Ingrese una cantidad mayor que cero: ";
        cin >> n;
    }
    for (int i = 1; i <= n; i++) {
        cout << "Vehiculo " << i << endl;
        cout << "Placa sin espacios (5 a 8 caracteres): ";
        cin >> placa;
        while (placa.length() < 5 || placa.length() > 8) {
            cout << "Placa invalida. Ingrese nuevamente: ";
            cin >> placa;
        }
        cout << "Tipo: 1 Moto, 2 Automovil, 3 Camion: ";
        cin >> tipo;
        while (tipo < 1 || tipo > 3) {
            cout << "Tipo invalido. Ingrese de 1 a 3: ";
            cin >> tipo;
        }
        cout << "Numero de ejes: ";
        cin >> ejes;
        while (ejes < 2 || (tipo != 3 && ejes != 2)) {
            cout << "Moto/auto: 2; camion: 2 o mas: ";
            cin >> ejes;
        }
        cout << "Hora de paso (0 a 23): ";
        cin >> hora;
        while (hora < 0 || hora > 23) {
            cout << "Hora invalida. Ingrese de 0 a 23: ";
            cin >> hora;
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
        cout << "Placa: " << placa << " | Hora: " << hora << endl;
        cout << "Tarifa: $" << tarifa << endl;
    }
    total = round(total * 100.0) / 100.0;
    cout << "Total recaudado: $" << total << endl;
    cout << "Camiones con mas de 4 ejes: " << camiones << endl;
    cout << "Placa con tarifa mas alta: " << placaMayor << endl;
    cout << "Tarifa mas alta: $" << tarifaMayor << endl;
    return 0;
}