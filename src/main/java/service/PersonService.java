package service;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.List;
import java.util.ArrayList;
import beans.Person;

/*
 * 
 * A hardcoded Person
 */

@ManagedBean(name="personService", eager=true)
@ApplicationScoped
public class PersonService {

	public List<Person> getPersonList(){
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Amaury Esparza", "Juan de la Barrera", 22));
		personList.add(new Person("Kevin Salomon", "Volcanes", 22));
		personList.add(new Person("Sergio Paredes", "Pozo Bravo", 22));
		personList.add(new Person("Ezequiel", "San Ignacio", 22));
		return personList;
	}
}
