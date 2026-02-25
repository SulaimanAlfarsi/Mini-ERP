public class Complaint {

    private int complainId;
    private String description;
    private String priority;
    private String status;

    public Complaint(int complainId, String description, String priority){
        this.complainId =complainId;
        this.description= description;
        this.priority =priority;
    }

    public int getComplainId(){
        return complainId;
    }
    public String getDescription(){
        return description;
    }
    public String getPriority(){
        return priority;
    }
    public String getStatus(){
        return status;
    }
    public void closeComplaint(){
        this.status = "Closed";
    }
    @Override
    public String toString(){
        return "Complaint ID: " + complainId + "\n Description:" + description + "\n Priority"+ priority + "\n Status: "+ status;

    }


}
