package bootdockersql.proj.service;

import bootdockersql.proj.model.User;
import bootdockersql.proj.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User save(User user) {
        return repository.save(user);
    }

    public User get(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
