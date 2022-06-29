package uk.org.pettigrew.SchnappiBot;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent event)
	{
		String[] args = event.getMessage().getContentRaw().split(" ");
		
		for (int i = 0; i < args.length; i++)
		{
			if (args[i].equalsIgnoreCase("pumps"))
			{
				event.getChannel().sendMessage("Schnappi schnappi das kleines Krokodil").queue();
			}
			if(args[i].equalsIgnoreCase("*pumps*"));
			{
				event.getChannel().sendMessage("Schnappi schnappi das kleines Krokodil").queue();
			}
			if(args[i].equalsIgnoreCase("**pumps**"))
			{
				event.getChannel().sendMessage("Schnappi schnappi das kleines Krokodil").queue();
			}
			if(args[i].equalsIgnoreCase("***pumps***"))
			{
				event.getChannel().sendMessage("Schnappi schnappi das kleines Krokodil").queue();
			}
		}
	}

}
