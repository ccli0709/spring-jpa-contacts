package tw.ccli0709.contacts.service;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import tw.ccli0709.contacts.dao.Tbdu01Dao;
import tw.ccli0709.contacts.entity.Tbdu01;
import tw.ccli0709.contacts.model.ContactModel;

@Service
public class ContactService {

	@Autowired
	private Tbdu01Dao tbdu01Dao;

	public Iterable<ContactModel> all() {

		Pageable pageable = PageRequest.of(0, 20);
		Page<Tbdu01> page = tbdu01Dao.findAll(pageable);

		Iterator<Tbdu01> it = page.iterator();
		List<ContactModel> result = Lists.newArrayList();

		while (it.hasNext()) {
			Tbdu01 vo = it.next();
			ContactModel model = new ContactModel(vo);
			result.add(model);
		}

		return result;
	}

	public Iterable<ContactModel> findByCname(String cname) {
		Iterator<Tbdu01> it = tbdu01Dao.findByCnameLike("%" + cname + "%").iterator();
		List<ContactModel> result = Lists.newArrayList();

		while (it.hasNext()) {
			Tbdu01 vo = it.next();
			ContactModel model = new ContactModel(vo);
			result.add(model);
		}

		return result;
	}

	public Iterable<ContactModel> findByFuzzyQuery(String keyword) {
		Iterator<Tbdu01> it = tbdu01Dao.findByFuzzyQuery("%" + keyword + "%").iterator();
		List<ContactModel> result = Lists.newArrayList();

		while (it.hasNext()) {
			Tbdu01 vo = it.next();
			ContactModel model = new ContactModel(vo);
			result.add(model);
		}

		return result;
	}

	public List<Object[]> joinTest() {
		return tbdu01Dao.findByNativeJoin();
	}

	public ContactModel findByUid(String uid) {
		Tbdu01 vo = tbdu01Dao.findByIdUserno(uid);
		return new ContactModel(vo);
	}

}
