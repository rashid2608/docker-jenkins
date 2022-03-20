package multiplication.book.application.user;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<user, Long> {

    Optional<user> findByAlias(final String alias);

}
