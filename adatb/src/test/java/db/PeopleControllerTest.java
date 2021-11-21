package db;
import db.repository.PeopleModle;
import db.repository.PeopleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
class PeopleControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private PeopleRepository peopleRepository;

	@Test
	public void shouldNoMainPage() throws Exception {
		this.mockMvc.perform(get("/"))
				.andDo(print())
				.andExpect(status().is4xxClientError());
	}

	@Test
	public void shouldReturnPeoples() throws Exception {
		PeopleModle people = new PeopleModle(1L, 12, "1");

		Iterable<PeopleModle> all = peopleRepository.findAll();
		peopleRepository.save(people);

		this.mockMvc.perform(get("/people"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.[0].name", is("1")))
				.andExpect(jsonPath("$.[0].age", is(12)));
	}

	@Test
	public void shouldReturnPeoples2() throws Exception {
		PeopleModle people = new PeopleModle(1L, 22, "2");

		Iterable<PeopleModle> all = peopleRepository.findAll();
		peopleRepository.save(people);

		this.mockMvc.perform(get("/people"))
				.andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.[0].name", is("2")))
				.andExpect(jsonPath("$.[0].age", is(22)));
	}
}