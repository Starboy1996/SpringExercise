package com.example.JPADesign.Repos;

import com.example.JPADesign.Models.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Long> {

    List<Address> findByCounty(String county);

    Address findByState(String state);
}
