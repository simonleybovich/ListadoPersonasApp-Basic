public class Persona {

    private int id;
    private String nombre;
    private String tel;
    private String email;
    private static int numeroPersonas = 0;

    //constructor sin parametros
    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    //contructor con parametros
    public Persona(String nombre, String tel, String email){
        //aca llamo al constructor vacio de manera explicita
        //en caso de sacarlo se llama igualmente de manera implicita
        this();
        this.nombre = nombre;
        this.tel = tel;
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan Perez", "1123232323", "juan@mail.com");
        System.out.println(persona1);
    }
}
