public class TanqueDeAgua {
    double capacidadMaximaLitros;
    double nivelActualLitros;

    public TanqueDeAgua(double capacidadMaximaLitros, double nivelActualLitros) {
        if (nivelActualLitros < capacidadMaximaLitros) {
            this.nivelActualLitros = nivelActualLitros;
        }else{
            nivelActualLitros = capacidadMaximaLitros;
        }

        this.capacidadMaximaLitros = capacidadMaximaLitros;

    }

    public void llenar(double litros){

        if(nivelActualLitros > capacidadMaximaLitros){
            nivelActualLitros = capacidadMaximaLitros;
        }else{
            nivelActualLitros += litros;
            System.out.println("Litros llenados: "+ nivelActualLitros+"L");
        }
    }

    public void consumir(double litros){
        if(nivelActualLitros <= 0){
            System.out.println("No hay agua en el tanque!");
        }else{
            nivelActualLitros -= litros;
            System.out.println("Litros consumidos: "+ nivelActualLitros+"L");
        }
    }

    public void mostrar(){
        System.out.println("Capacidad maxima litros: " + capacidadMaximaLitros+"L");
        System.out.println("Nivel actual: " + nivelActualLitros+"L");
    }
}
