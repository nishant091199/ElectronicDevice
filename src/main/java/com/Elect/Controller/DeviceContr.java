package com.Elect.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Elect.Entity.Device;
import com.Elect.Services.DeviceService;

@RestController
public class DeviceContr {
@Autowired
	private DeviceService service;
@PostMapping("/addDevice")
public Device addDevice(@RequestBody Device device) {
	return service.saveDevice(device);
}
@PostMapping("/addDevices")
public List<Device> addDevices(@RequestBody List<Device> devices) {
	return service.saveDevices(devices);
}
@GetMapping("/devices")
public List<Device> findAllDevices(){
	return service.getDevices();
}
@GetMapping("/device/{id}")
public Device findDeviceById(@PathVariable int id) {
	return service.getDeviceById(id);
}
@GetMapping("/device/{name}")
public Device findDeviceByName(@PathVariable String name) {
	return service.getDeviceByName(name);
}
@PutMapping("/updateDevice")
public Device updateDevice(@RequestBody Device device) {
	return service.updateDevice(device);
}
@DeleteMapping("delete/{id}")
public String deleteDevice(@PathVariable int id) {
	return service.deleteDevice(id);
}
}
