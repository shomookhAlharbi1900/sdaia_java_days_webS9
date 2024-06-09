package org.example.models;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.sql.ResultSet;
import java.sql.SQLException;

@XmlRootElement
public class jobs {
    private int Job_id ;
   private String job_title ;
   private double min_salary;
   private double max_salary;

//    public jobs(int Job_id, String job_title) {
//        this.Job_id = Job_id;
//        this.job_title = job_title;
//    }

    public jobs() {}

    public jobs(int Job_id, String job_title, double min_salary, double max_salary) {
        this.Job_id = Job_id;
        this.job_title = job_title;
        this.min_salary = min_salary;
        this.max_salary = max_salary;
    }

    public void setMin_salary(double min_salary) {
        this.min_salary = min_salary;
    }

    public void setMax_salary(double max_salary) {
        this.max_salary = max_salary;
    }

    public double getMin_salary() {
        return min_salary;
    }

    public double getMax_salary() {
        return max_salary;
    }

    public int getJob_id() {
        return Job_id;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_id(int Job_id) {
        this.Job_id = Job_id;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public jobs(ResultSet rs) throws SQLException {
        Job_id= rs.getInt("Job_id");
        job_title=rs.getString("job_title");
        min_salary = rs.getDouble("min_salary");
        max_salary =rs.getDouble("max_salary");
    }

    @Override
    public String toString() {
        return "jobs{" +
                "Job_id=" + Job_id +
                ", job_title='" + job_title + '\'' +
                ", min_salary=" + min_salary +
                ", max_salary=" + max_salary +
                '}';
    }
}
