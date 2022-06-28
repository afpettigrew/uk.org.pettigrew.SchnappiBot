package uk.org.pettigrew.SchnappiBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

public class SchnappiBot
{
	public static void main(String[] args) throws LoginException
	{
		JDABuilder jda = JDABuilder.createDefault("OTkxMjY0NzYyNDg4OTUwODA0.Gg3FbX.pvwplF7iE3mC_CS1UOFS07ssnqyc-SFIlagwgM");
		jda.setActivity(Activity.playing("Schnappi schnappi"));
		jda.setStatus(OnlineStatus.IDLE);
		jda.addEventListeners(new Commands());
		jda.build();
		
		
	}

}
