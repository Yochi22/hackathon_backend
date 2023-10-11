public class Agenda {
    Set<Contacto> contactos = new Hash<Contacto>(10);

    Contacto contacto1 = new Contacto("luisa Castaño", "3194970214");
    Contacto contacto1 = new Contacto("Diego Alvarado", "3208643214");

    //guía
    public void agregarContacto(Contacto contacto1, Contact contacto2) {
        this.contactos.add(contacto1);
        this.contactos.add(contacto2);
    }
}
