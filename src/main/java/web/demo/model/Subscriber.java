package web.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="T_Subs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subscriber {
    Integer id;
    @Id
    String mail;

    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "newsletter_id")
    private Event newsletter_sub ;
}
