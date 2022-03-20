package multiplication.book.application.challenge;

import multiplication.book.application.user.user;

import javax.persistence.*;



import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChallengeAttempt {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    private user user;
    private int factorA;
    private int factorB;
    private int resultAttempt;
    private boolean correct;
}


