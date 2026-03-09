public class LogLevels {
    
    public static String message(String logLine) {
        String[] output = logLine.split(":",2);
        return output[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] output = logLine.split(":",2);
        int first = output[0].indexOf('[');
        int last = output[0].indexOf(']');
        String raw = output[0].substring(first+1, last);
        return raw.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
