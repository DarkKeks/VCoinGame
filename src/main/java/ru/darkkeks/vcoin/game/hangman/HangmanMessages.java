package ru.darkkeks.vcoin.game.hangman;

public class HangmanMessages {


    public static final String START = "Начать";
    public static final String PLAY = "🎴 Играть";
    public static final String RULES = "📜 Правила";
    public static final String DEPOSIT = "💰 Пополнить баланс";
    public static final String BALANCE = "💰 Баланс";
    public static final String WITHDRAW = "⏪ Вывести";
    public static final String SUCCESS_WITHDRAW_MESSAGE = "✅ %.3f монет было успешно выведено!";
    public static final String NOT_ENOUGH_WITHDRAW_MESSAGE = "😢 На Вашем балансе недостаточно средств :(";
    public static final String GIVE_UP = "🏳️ Сдаться";
    public static final String LETTER_USED_ALREADY = "🔴 Вы уже использовали эту букву";
    public static final String NOT_ENOUGH_TO_PLAY = "😢 Чтобы начать игру, Вам необходимо %.3f монет";
    public static final String COMMANDS_MESSAGE = "❗ Включите отображение клавиатуры (в правом углу поля для ввода " +
            "сообщения)";
    public static final String WORD_MESSAGE = "❗ Загаданное слово: ";
    public static final String WIN_MESSAGE = "🏆 Вы выиграли. Ну ничего, в следующий раз победа будет на моей стороне!";
    public static final String LOSE_MESSAGE = "😢 Вы проиграли...";
    public static final String WITHDRAW_MESSAGE = "⏪ Отправьте количество монет, которые Вы хотите вывести...";
    public static final String SOMETHING_WENT_WRONG = "🔴 Что-то сломалось. Попробуйте немного позже 🔴";
    public static final String AMOUNT_HAS_TO_BE_POSITIVE = "❗ Вы можете выводить только положительное число монет!";
    public static final String DEPOSIT_SUCCESS = "✅ Ваш баланс пополнен на %.3f монет!";
    public static final String DEPOSIT_MESSAGE = "🔗 Для оплаты перейдите по следующей ссылке:\n%s";
    public static final String BALANCE_MESSAGE = "💰 Ваш баланс: %.3f монет";
    public static final String GAME_STATUS_MESSAGE = "📗 Отгаданные буквы: %s\n👿 Неверные попытки: %s";
    public static final String RULES_MESSAGE = "📜 Правила игры виселица\n\n" +
            "Я загадываю очень сложное слово, а Вы должны отгадать его! Но каким образом?...\n\n" +
            "Присылайте мне буквы, о которых хотите получить информацию. Если буква есть в слове, то я " +
            "покажу все позиции, где эта буква встречается. Но если этой буквы нет в слове, я добавлю на виселицу " +
            "одну часть Вашего тела. У вас есть всего 6 попыток, чтобы выиграть.\n\nМонеты забирает тот, кто выиграл!" +
            " Стоимость одной игры: %.3f \n\n🔴 Более подробно можно ознакомиться с правилами на википедии: " +
            "vk.cc/9hRoBS";

    public static final String[] IMAGES = new String[]{
            "photo-181264738_456239017",
            "photo-181264738_456239018",
            "photo-181264738_456239019",
            "photo-181264738_456239020",
            "photo-181264738_456239021",
            "photo-181264738_456239022",
            "photo-181264738_456239023",
    };

}
