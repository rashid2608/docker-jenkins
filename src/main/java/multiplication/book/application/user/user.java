package multiplication.book.application.user;


import lombok.*;

import javax.persistence.*;

/**
 * Stores information to identify the user.
 */
@Entity
@Data
@AllArgsConstructor 
@NoArgsConstructor
public class user {

    @Id
    @GeneratedValue
    private Long id;
    private String alias;

    public user(final String userAlias) {
        this(null, userAlias);
    }
}