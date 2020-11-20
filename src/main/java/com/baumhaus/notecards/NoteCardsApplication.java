package com.baumhaus.notecards;

import com.baumhaus.notecards.model.Card;
import com.baumhaus.notecards.model.CardType;
import com.baumhaus.notecards.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteCardsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(NoteCardsApplication.class, args);
	}

	@Autowired
	private CardRepository cardRepository;

	@Override
	public void run(String...args) throws Exception {

		cardRepository.save(Card.builder()
				.userId(5L)
				.description("The one ring to rule them all")
				.type(CardType.OFFER)
				.firstName("Frodo")
				.title("An old ring")
				.build());

		cardRepository.save(Card.builder()
				.userId(7L)
				.description("A powerful item to rule them all")
				.type(CardType.NEED)
				.firstName("Saruman")
				.title("Want an old ring")
				.build());

		cardRepository.save(Card.builder()
				.userId(8L)
				.description("A friendship to last a lifetime")
				.type(CardType.OFFER)
				.firstName("Sam")
				.title("Friendship")
				.build());

		cardRepository.save(Card.builder()
				.userId(9L)
				.description("Let us meet and have second breakfast")
				.type(CardType.MEET)
				.firstName("Pippen")
				.title("A second breakfast")
				.build());


	}
}
