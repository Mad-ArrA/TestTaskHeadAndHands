package test.handh;

/**
 * Класс исключения, при неправильном указании параметра существа, выведется ошибка
 */
public class CharacterException extends Exception{
    public CharacterException(String message){
        super(message);
    }
    String s = "Ошибка создания существа!";
    public String NameMessage(){
        return s;
    }
}
