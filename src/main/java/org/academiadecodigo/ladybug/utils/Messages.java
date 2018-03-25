package org.academiadecodigo.ladybug.utils;

public enum Messages {

    ERROR_MESSAGE("There was an error: "),
    WELCOME("\n" + Ansi.Blue.colorize("██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗    ████████╗ ██████╗ \n" +
		    "██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝    ╚══██╔══╝██╔═══██╗\n" +
		    "██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗         ██║   ██║   ██║\n" +
		    "██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝         ██║   ██║   ██║\n" +
		    "╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗       ██║   ╚██████╔╝\n" +
		    " ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝       ╚═╝    ╚═════╝ \n" + "" +
		    "                                                                                    \n")),
	LADYBUG("\n" + Ansi.Red.colorize("██╗      █████╗ ██████╗ ██╗   ██╗██████╗ ██╗   ██╗ ██████╗     ████████╗██╗ ██████╗██╗  ██╗███████╗████████╗██╗     ██╗███╗   ██╗███████╗██╗\n" +
			"██║     ██╔══██╗██╔══██╗╚██╗ ██╔╝██╔══██╗██║   ██║██╔════╝     ╚══██╔══╝██║██╔════╝██║ ██╔╝██╔════╝╚══██╔══╝██║     ██║████╗  ██║██╔════╝██║\n" +
			"██║     ███████║██║  ██║ ╚████╔╝ ██████╔╝██║   ██║██║  ███╗       ██║   ██║██║     █████╔╝ █████╗     ██║   ██║     ██║██╔██╗ ██║█████╗  ██║\n" +
			"██║     ██╔══██║██║  ██║  ╚██╔╝  ██╔══██╗██║   ██║██║   ██║       ██║   ██║██║     ██╔═██╗ ██╔══╝     ██║   ██║     ██║██║╚██╗██║██╔══╝  ╚═╝\n" +
			"███████╗██║  ██║██████╔╝   ██║   ██████╔╝╚██████╔╝╚██████╔╝       ██║   ██║╚██████╗██║  ██╗███████╗   ██║   ███████╗██║██║ ╚████║███████╗██╗\n" +
			"╚══════╝╚═╝  ╚═╝╚═════╝    ╚═╝   ╚═════╝  ╚═════╝  ╚═════╝        ╚═╝   ╚═╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝╚═╝  ╚═══╝╚══════╝╚═╝\n" + "  " +
			"                                                                                                                                          \n")),
	INITIALMESSAGE(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("Please login or register to access the ticketLine."))),
	ENTERUSERNAME(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("Enter your username: "))),
	ENTERPASSWORD(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("Enter your password: "))),
	CHOOSEUSERNAME(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("New username: "))),
	CHOOSEPASSWORD(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("New password: "))),
	CANTREGISTER(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("Unable to register, please try again! "))),
	CANTLOGIN(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("Wrong username or password. Try again "))),
	SELECTDAY(Ansi.HighIntensity.colorize(Ansi.Blue.colorize("Day: ")));

    String message;

    Messages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
