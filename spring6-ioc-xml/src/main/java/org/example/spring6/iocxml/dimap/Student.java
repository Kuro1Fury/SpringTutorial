package org.example.spring6.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {

    private String sid;
    private String sname;
    private Map<String, Teacher> teacherMap;
    private List<Course> courseList;

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void run() {
        System.out.println("sid: " + sid + ", sname: " + sname);
        System.out.println(teacherMap);
        System.out.println(courseList);
    }
}
