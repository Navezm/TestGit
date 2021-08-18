package be.digitalcity.formation.devant;


import lombok.Data;

@Data
public class Personne {

    public long id;
    public String first_name;
    public String last_name;
    public String email;
    public String gender;

    public Personne(long id, String first_name, String last_name, String email, String gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
    }
}
