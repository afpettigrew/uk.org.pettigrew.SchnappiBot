package uk.org.pettigrew.SchnappiBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class SchnappiBot
{
	public static void main(String[] args) throws LoginException
	{
		JDABuilder jda = JDABuilder.createDefault("OTkxMjQxMDMzODQ3NDIzMDI4.Gcb5NT.zxGqqKuKh7q_O-Q7ekhHEZI4CPwt4ExonFyMHw");
		jda.setActivity(Activity.playing("Schnappi schnappi"));
		jda.setStatus(OnlineStatus.IDLE);
		jda.addEventListeners(new Commands());
		jda.build();
		
		
	}

}
