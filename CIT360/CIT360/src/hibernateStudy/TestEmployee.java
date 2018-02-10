package hibernateStudy;

import java.lang.annotation.Annotation;
import org.hibernate.cfg.AnnotationConfiguration;

public class TestEmployee {

	public static void main(String[] args) {
		AnnotationConfigure config = new
		config.addAnnotatedClass(Employee.class);
		config.configure("hibernate.cfg.xml");
		
		new SchemaExport(config).create(true, true);

	}

}
