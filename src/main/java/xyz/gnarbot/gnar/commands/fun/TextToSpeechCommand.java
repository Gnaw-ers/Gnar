package xyz.gnarbot.gnar.commands.fun;

import net.dv8tion.jda.core.MessageBuilder;
import xyz.gnarbot.gnar.Bot;
import xyz.gnarbot.gnar.handlers.commands.Command;
import xyz.gnarbot.gnar.handlers.commands.CommandExecutor;
import xyz.gnarbot.gnar.utils.Note;

@Command(aliases = {"tts"}, usage = "(string)", description = "Text to speech fun.")
public class TextToSpeechCommand extends CommandExecutor
{
    @Override
    public void execute(Note note, String label, String[] args)
    {
        if (args.length == 0)
        {
            note.replyError("Please provide a query.");
            return;
        }
        
        MessageBuilder builder = new MessageBuilder();
        builder.setTTS(true);
        builder.append(note.getContent().replaceFirst(Bot.getToken() + "tts ", ""));
        
        note.getChannel().sendMessage(builder.build()).queue();
    }
}
