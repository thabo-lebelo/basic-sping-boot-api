package com.thabolebelo.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@RunWith(SpringRunner.class)
public class TeamRepositoryIntegrationTest {

    //@Autowired
    //private TestEntityManager entityManager;

    //@Autowired
    //private TeamRepository teamRepository;

    @Test
    public void whenFindByName_returnEmployee() {
        //given this details
        //Team touch = new Team((long) 5,"Thabo", "Lebelo", "Developer");

        //entityManager.persist(touch);
        //entityManager.flush();

        //when this occurs
        //Team found = teamRepository.findByFirstName(touch.getFirstName());

        //then
        //assertThat(found.getFirstName()).isEqualTo(touch.getFirstName());

    }

}
