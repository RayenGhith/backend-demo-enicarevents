package web.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Newsletter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Newsletter {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    String description;

    @OneToMany(mappedBy = "newsletter_sub", cascade = CascadeType.ALL)
    private List<User> subs;
}
