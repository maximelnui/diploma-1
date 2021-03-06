package openkino.com.service;

import openkino.com.form.CardForm;
import openkino.com.models.Card;
import openkino.com.models.KinoUser;

import java.math.BigDecimal;
import java.util.List;

public interface CardService {
    Long saveCard(CardForm card, KinoUser kinoUser);

    void deleteCardById(Long id);

    List<Card> findCardsByIdKinoUser(KinoUser kinoUser);

    Long addBalance(Long id, BigDecimal money);
}
