import com.cashmoney.studentlist.CSVParser;
import com.cashmoney.studentlist.Student;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        Student a = new Student("Bill", "Billbob");
        CSVParser csvParser = new CSVParser();
        ArrayList<Student> test = new ArrayList<>();
        test = csvParser.allStudents();
        writer.println(a.getName() + " " + a.getEmail());
        writer.print(test);
    }
}
