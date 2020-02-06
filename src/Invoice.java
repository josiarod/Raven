import java.text.DecimalFormat;

public class Invoice {
    private String name;
    private String address;
    private String contactInformation;
    private int session;
    private int questions;



    public Invoice(){}

    public Invoice(String name, String address, String contactInformation,int session, int questions){
        this.name = name;
        this.address = address;
        this.contactInformation = contactInformation;
        this.session = session;
        this.questions = questions;
    }

    public String invoice(String name, String address){
        return "Raven's Invoice\n" +
                "To:\n" +
                 name+"\n"+
                 address+"\n";


    }

    public String items(int session, int questions ){
        final double sessionPrice = 100;
        final double questionsPrice = 0.35;
        double totalSession = session * sessionPrice;
        double totalQuestions = questions * questionsPrice;
        double totalDue = totalQuestions + totalSession;
         DecimalFormat df2 = new DecimalFormat("#.00");
        String s = "Session ";
        String q = "Question ";
        if(session > 1){
            s = "Sessions ";
        }

        if(questions > 1){
            q = "Questions ";
        }

        return  "Items:\n" +
                "Quantity Description Price Total\n" +
                 session + " " + s +df2.format(sessionPrice) +" " + df2.format(totalSession) +"\n" +
                questions + " "  + q + df2.format(questionsPrice) + " "+ df2.format(totalQuestions)+ "\n\n" +
                "Total Due: " +"$"+ df2.format(totalDue)+ "\n\n" +
                "Thank you for doing business with Raven.";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public int getQuestions() {
        return questions;
    }

    public void setQuestions(int questions) {
        this.questions = questions;
    }
}
