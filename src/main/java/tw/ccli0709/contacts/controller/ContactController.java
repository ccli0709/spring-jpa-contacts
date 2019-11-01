package tw.ccli0709.contacts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tw.ccli0709.contacts.model.ContactModel;
import tw.ccli0709.contacts.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	ContactService contactService;

	@GetMapping("/all")
	public Iterable<ContactModel> getAll() {
		return contactService.all();
	}

	@GetMapping("/join_test")
	public List<Object[]> joinTest() {
		return contactService.joinTest();
	}

	@GetMapping("/uid/{uid}")
	public ContactModel getContactByUid(@PathVariable String uid) {
		return contactService.findByUid(uid);
	}

	@GetMapping("/findByCname")
	public Iterable<ContactModel> findByCname(@RequestParam(value = "cname", defaultValue = "") String cname) {
		return contactService.findByCname(cname);
	}

	@GetMapping("/findByFuzzyQuery")
	public Iterable<ContactModel> findByFuzzyQuery(@RequestParam(value = "keyword", defaultValue = "") String keyword) {
		return contactService.findByFuzzyQuery(keyword);
	}

}
