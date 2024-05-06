package com.iback.bookservice.command.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookResponsitory extends JpaRepository<Book,String> {
}
