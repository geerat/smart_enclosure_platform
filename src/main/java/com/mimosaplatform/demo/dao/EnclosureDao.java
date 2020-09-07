package com.mimosaplatform.demo.dao;

import com.mimosaplatform.demo.models.Enclosure;
import org.springframework.data.repository.CrudRepository;

public interface EnclosureDao extends CrudRepository<Enclosure, String> {
}
