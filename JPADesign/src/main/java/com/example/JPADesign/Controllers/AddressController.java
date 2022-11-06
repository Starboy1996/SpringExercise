package com.example.JPADesign.Controllers;

import com.example.JPADesign.Models.Address;
import com.example.JPADesign.Repos.AddressRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class AddressController {
    @Resource
    AddressRepository addressRepo;

    @GetMapping("/Addresses")
    public Iterable<Address> getAllAddresses() {return addressRepo.findAll();}


}
