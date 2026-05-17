import java.util.Scanner;

public class ClaseEstudiante {

    private String nombre;
    private int matricula;
    private int edad;
    private String carrera;

    public ClaseEstudiante(){
        
    }

    public ClaseEstudiante(String nombre, int matricula, int edad, String carrera){

        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.carrera = carrera;
    }

    public String getNombre(){

        return nombre;

    }

    public int  getMatricula(){

        return matricula;
    }

    public int getEdad(){

        return edad;
    }

    public String getCarrera(){
         
        return carrera;
    }

    public void setNombre(String nombre){

        this.nombre = nombre;
    }

    public void setMatricula(int matricula){

        this.matricula = matricula;
    }

    public void setEdad(int edad){

        this.edad = edad;
    }

    public void setCarrera(String carrera){

        this.carrera = carrera;
    }

    public void RegistroEstudiante(Scanner scanner){
        //este metodo debe ser modificado en el menu para admitir mas de un estudiante

        scanner.nextLine();

        System.out.print("Digite el nombre: ");
        this.nombre = scanner.nextLine();
        
        System.out.print("Digite la matricula: ");
        this.matricula = scanner.nextInt();

        System.out.print("Digite la edad: ");
        this.edad = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Digite la carrera: ");
        this.carrera = scanner.nextLine();
    }

    public void MostrarEstudiante(){
        //este metodo se bede modificar el en menu para admitir mas de un estudiante

        System.out.println("\nNombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        
    }

}
