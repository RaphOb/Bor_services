package com.devoteam.presales.testspringsecu;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.*;


import java.util.List;
import com.devoteam.presales.testspringsecu.UsersDevo;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;

public interface UsersRepo extends JpaRepository<UsersDevo, Long> {

}

