package multiplication.book.application.challenge;


import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class ChallengeGeneratorServiceImpl implements ChallengeGeneratorService {
	
	
	
	private final Random random;

    ChallengeGeneratorServiceImpl() {
        this.random = new Random();
    }

    protected ChallengeGeneratorServiceImpl(final Random random) {
        this.random = random;
    }
	
	
    private final static int MINIMUM_FACTOR = 11;
    private final static int MAXIMUM_FACTOR = 100;

    // ...

    private int next() {
        return random.nextInt(MAXIMUM_FACTOR - MINIMUM_FACTOR) +  MINIMUM_FACTOR;
    }

	@Override
	public challenge randomChallenge() {
		// TODO Auto-generated method stub
		//return null;
		return new challenge(next(), next());
	}

}
