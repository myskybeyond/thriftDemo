package com.thrift.service.impl;
import org.apache.thrift.TException;

import com.thrift.service.HelloWorldService.Iface;;

public class HelloWorldServiceImpl implements Iface{

	@Override
	public String sayHello(String username) throws TException {
		// TODO Auto-generated method stub
		return "Hi,"+ username + "!welcome diaoyou wo.";
	}

}
