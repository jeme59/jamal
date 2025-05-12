public class UserProfile {
    private String email;
    private String gender;
    private String trainingType;
    private int workoutDays;
    private String[] schedule;

    public UserProfile(String email, String gender, String trainingType, int workoutDays) {
        this.email = email;
        this.gender = gender;
        this.trainingType = trainingType;
        this.workoutDays = workoutDays;
        this.schedule = new String[workoutDays];
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public int getWorkoutDays() {
        return workoutDays;
    }

    public String[] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[] schedule) {
        this.schedule = schedule;
    }
}





//public class UserProfile {
//    private String email;
//    private String gender;
//    private String trainingType;
//    private int workoutDays;
//    private String[] schedule;
//
//    public UserProfile(String email, String gender, String trainingType, int workoutDays) {
//        this.email = email;
//        this.gender = gender;
//        this.trainingType = trainingType;
//        this.workoutDays = workoutDays;
//        this.schedule = new String[workoutDays];
//    }
//
//    // Getter and Setter Methods
//    public String getEmail() {
//        return email;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String getTrainingType() {
//        return trainingType;
//    }
//
//    public int getWorkoutDays() {
//        return workoutDays;
//
//    }
//
//    public void setSchedule(String[] schedule) {
//        this.schedule = schedule;
//    }
//
//    public String[] getSchedule() {
//        return schedule;
//    }
//}
