package AssignmentD.question3;
class StudentsDetails {
    String name;
    String branch;
    double percentage;

   public  StudentsDetails(String name, String branch, double percentage) {
        this.name = name;
        this.branch = branch;
        this.percentage = percentage;
    }

    void increasePercentageForCSE() {
        if (branch.equalsIgnoreCase("CSE")) {
            percentage = percentage + (percentage * 5 / 100);
        }
    }

    void display() {
        System.out.println(
            "Name: " + name +
            " Branch: " + branch +
            " Percentage: " + percentage
        );
    }
}
