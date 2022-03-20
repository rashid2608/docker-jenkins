package multiplication.book.application.challenge;

import lombok.*;

import javax.validation.constraints.*;

/*
 * Attempt coming from user
 */


@Value
public class ChallengeAttemptDTO {
	
	   @Min(1) @Max(99)
	   int factorA, factorB;
	   
	   @NotBlank
	    String userAlias;
	   
	   @Positive(message = "are you mad?? how can it be negative")
	    int guess;

}
