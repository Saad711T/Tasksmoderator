class Task {
    private String name;
    private String dueDate;
    private boolean isCompleted;
    public Task(String name, String dueDate) {
        this.name = name;
        this.dueDate = dueDate;
        this.isCompleted = false;
    }
    public String getName() {
        return name;
    }
    public String getDueDate() {
        return dueDate;
    }
    public boolean isCompleted() {
        return isCompleted;
    }
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
    public String toString() {
        return name + " (Due: " + dueDate + ") - " + (isCompleted ? "Completed" : "Incomplete");
    }
}
