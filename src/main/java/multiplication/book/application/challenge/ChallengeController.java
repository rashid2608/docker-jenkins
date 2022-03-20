package multiplication.book.application.challenge;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
/**
 * This class implements a REST API to get random challenges
 */
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/challenges")
public class ChallengeController {

	@Autowired
    private final ChallengeGeneratorService challengeGeneratorService;

    @GetMapping(value = "/random")
    challenge getRandomChallenge() {
        challenge challenge = challengeGeneratorService.randomChallenge();
        log.info("Generating a random challenge: {}", challenge);
        return challenge;  
        
    }
}
