package xyz.gnarbot.handlers.commands;

import xyz.gnarbot.handlers.Person;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Stores the initial data of a command class upon instantiation.
 *
 * @see CommandExecutor
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Command
{
    /**
     * Returns the aliases of this command.
     * @return The aliases of this command.
     */
    String[] aliases();
    
    /**
     * Returns the description of this command.
     * @return The description of this command.
     */
    String description() default "No descriptions provided.";
    
    /**
     * Returns the usage of this command.
     * @return The usage of this command.
     */
    String usage() default "";
    
    /**
     * Returns if the command is shown in _help.
     * @return Flag to show this command in help.
     */
    boolean showInHelp() default true;
    
    /**
     * Returns the permission required for this command.
     * @return The permission required for this command.
     */
    Person.Permission permissionRequired() default Person.Permission.USER;
}
