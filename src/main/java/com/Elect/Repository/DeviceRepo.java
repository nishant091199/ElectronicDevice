package com.Elect.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Elect.Entity.Device;

public interface DeviceRepo extends JpaRepository<Device,Integer> {

	Optional<Device> findByName(String name);

}
