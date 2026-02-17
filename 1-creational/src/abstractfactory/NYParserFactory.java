package abstractfactory;

public class NYParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType){
            case "FEEDBACK" -> new NYFeedbackXMLParser();
            case "ERROR" -> new NYErrorXMLParser();
            case "ORDER" -> new NYOrderXMLParser();
            default -> null;
        };
    }
}
