package view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.annotation.PostConstruct;

import beans.Person;
import service.PersonService;

import java.util.List;

@ManagedBean(name="personView")
@ViewScoped
public class PersonView {

	private List<Person> personList;
	
	@ManagedProperty("#{personService}")
	private PersonService personService;
	
	@SuppressWarnings("restriction")
	@PostConstruct
	public void init(){
		personList = personService.getPersonList();
	}
	
	public List<Person> getPersonList(){
		return personList;
	}
	
	public void setPersonService(PersonService personService){
		this.personService = personService;
	}
}
