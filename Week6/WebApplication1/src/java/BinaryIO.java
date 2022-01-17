import model.MyCustomer;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.*;
import java.util.ArrayList;

public class BinaryIO implements ServletContextListener {
    public void contextInitialized(ServletContextEvent e) {
        ServletContext sc = e.getServletContext();
        ArrayList<MyCustomer> data = null;
        String file = "/WEB-INF/MyCustomer.dat";
        InputStream is = sc.getResourceAsStream(file);
        if (is != null) {
            try {
                ObjectInputStream o = new ObjectInputStream(is);
                data = (ArrayList<MyCustomer>) o.readObject();
            } catch (Exception ex) {
                System.out.println("Input error!");
            }
            if (data != null) {
                System.out.println("Data retrieved!");
            } else {
                System.out.println("No data!");
                data = new ArrayList<MyCustomer>();
            }
        } else {
            System.out.println("File not found!");
            data = new ArrayList<MyCustomer>();
        }
        System.out.println(data.size());
        for (MyCustomer c : data) {
            System.out.println(c);
        }
        sc.setAttribute("data", data);
    }

    public void contextDestroyed(ServletContextEvent e) {
        ServletContext sc = e.getServletContext();
        ArrayList<MyCustomer> data =
                (ArrayList<MyCustomer>) sc.getAttribute("data");
        System.out.println(data.size());
        for (MyCustomer c : data) {
            System.out.println(c);
        }
        try {
            File f = new File(sc.getRealPath("/") + "WEB-INF/MyCustomer.dat");
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(f));
            o.writeObject(data);
            o.close();
            System.out.println("Done!");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
