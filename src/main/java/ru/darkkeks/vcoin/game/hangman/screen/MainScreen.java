package ru.darkkeks.vcoin.game.hangman.screen;

import ru.darkkeks.vcoin.game.Handlers;
import ru.darkkeks.vcoin.game.Screen;
import ru.darkkeks.vcoin.game.StaticKeyboard;
import ru.darkkeks.vcoin.game.hangman.Hangman;
import ru.darkkeks.vcoin.game.hangman.HangmanMessages;
import ru.darkkeks.vcoin.game.hangman.HangmanSession;
import ru.darkkeks.vcoin.game.vk.keyboard.ButtonType;
import ru.darkkeks.vcoin.game.vk.keyboard.Keyboard;
import ru.darkkeks.vcoin.game.vk.keyboard.KeyboardButton;

public class MainScreen extends Screen<HangmanSession> {

    public MainScreen(Hangman hangman) {
        super(new StaticKeyboard<>(Keyboard.builder()
                .newRow()
                .addButton(new KeyboardButton(HangmanMessages.PLAY, ButtonType.POSITIVE))
                .addButton(new KeyboardButton(HangmanMessages.RULES, ButtonType.PRIMARY))
                .addButton(new KeyboardButton(HangmanMessages.SETTINGS, ButtonType.DEFAULT))
                .newRow()
                .addButton(new KeyboardButton(HangmanMessages.DEPOSIT, ButtonType.DEFAULT))
                .addButton(new KeyboardButton(HangmanMessages.BALANCE, ButtonType.DEFAULT))
                .addButton(new KeyboardButton(HangmanMessages.WITHDRAW, ButtonType.DEFAULT))
                .build()));

        addHandler(Handlers.exactMatch(HangmanMessages.PLAY, hangman::startGame));

        addHandler(Handlers.exactMatch(HangmanMessages.RULES, session -> {
            session.sendMessage(HangmanMessages.RULES_MESSAGE, getKeyboard(session));
        }));

        addHandler(Handlers.exactMatch(HangmanMessages.SETTINGS, session -> {
            SettingsScreen screen = hangman.getSettingsScreen();
            session.setScreen(screen);
            session.sendMessage(HangmanMessages.SETTINGS, screen.getKeyboard(session));
        }));

        addHandler(Handlers.exactMatch(HangmanMessages.START, session -> {
            session.sendMessage(HangmanMessages.RULES_MESSAGE, getKeyboard(session));
        }));

        addHandler(Handlers.exactMatch(HangmanMessages.DEPOSIT, hangman::handleDeposit));
        addHandler(Handlers.exactMatch(HangmanMessages.BALANCE, hangman::handleBalance));
        addHandler(Handlers.exactMatch(HangmanMessages.WITHDRAW, hangman::handleWithdraw));

        fallback(Handlers.any((message, session) -> {
            session.sendMessage(HangmanMessages.COMMANDS_MESSAGE, getKeyboard(session));
        }));
    }
}
