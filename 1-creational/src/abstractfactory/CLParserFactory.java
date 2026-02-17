package abstractfactory;

public class CLParserFactory implements AbstractParserFactory {
    @Override
    public XMLParser getParser(String parserType) {
        return switch (parserType){
            case "FEEDBACK" -> new CLFeedbackXMLParser();
            case "ERROR" -> new CLErrorXMLParser();
            case "ORDER" -> new CLOrderXMLParser();
            default -> null;
        };
    }
}
