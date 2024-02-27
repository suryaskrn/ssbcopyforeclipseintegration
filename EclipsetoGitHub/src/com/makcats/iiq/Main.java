package com.makcats.iiq;

import sailpoint.api.SailPointContext;
import sailpoint.api.SailPointFactory;
import sailpoint.object.Identity;
import sailpoint.spring.SpringStarter;
import sailpoint.tools.GeneralException;

public class Main {
	public static void main(String args[]) throws GeneralException {
		
		SpringStarter starter = new SpringStarter("iiqBeans");
		starter.start();
		
		SailPointContext context = SailPointFactory.createContext();
		Identity identity = context.getObject(Identity.class, "spadmin");
		
		String displayName = identity.getDisplayName();
		
		System.out.println("Identity Details "+ identity.getFirstname() + "======" + identity.getLastname());
		System.out.println("Identity DisplayName:  "+ displayName);
		
		starter.close();				
	}
}