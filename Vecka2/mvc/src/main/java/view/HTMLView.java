package view;

public class HTMLView {

    public static String renderHtmlMessage(String color, String operation, int result) {
        String header =
            "<style>" +
                "h1 {" +
                    "font-size: 72px;" +
                    "color: " + color + ";" +
                    "background: -webkit-linear-gradient(#eee, #333);" +
                "}" +
            "</style>";
        String message =
            "<h1>The result of your " + operation + " operation was: " + result + "</h1>" +
            "<p>Powered by AI &trade;</p>";
        return header + message;
    }
}
