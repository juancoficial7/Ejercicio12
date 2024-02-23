
package ejercicio12;


public class Ejercicio12 {

    
    public static void main(String[] args) {
        double horas_trabajadas, valor_hora;
        double retencion;
        double salario_bruto, salario_neto;
        horas_trabajadas = 48;
        valor_hora = 5000;
        salario_bruto = horas_trabajadas * valor_hora;
        retencion = salario_bruto * 0.125;
        salario_neto = salario_bruto - retencion;
        System.out.println("Horas trabajadas: " + horas_trabajadas);
        System.out.println("Valor hora: " + valor_hora);
        System.out.println("Retencion: " + retencion);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
        
                
    }
    
}
