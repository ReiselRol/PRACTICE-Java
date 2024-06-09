package Exercici2on01;

public class nCript {

	private static final char zeroChars [] = {'b', 'e', 'c', 'o', 'd', '%', '¿', '_', '=', '@', '[', 'ç', ',', '&', '(', '.', 'm', 'l'};
	private static final char oneChars [] = {'a', 'f', 'i', 'g', 'u', '$', '!', '*', '<', '~', ']', 'ñ', ';', '¬', ')', '-','n', 'j'};
	private static final char guionChars [] = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', 'x', 'y', 'z', 'Q', 'W', 'E', 'R', 'T'};
	private static final char slashChars [] = {'Y', 'U', 'I', 'O', 'P', 'Ç', 'Ñ', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'C'};

	private static final int maxKeyLenght = 10;
	private static final int binaryLenght = 4;
	private static final String defaultKey = "K";
	private static final int minMultNumber = 1;
	private static final int maxMultNumber = 4;
	
	public static String Encripta (String message) {
		return Encripta(message, defaultKey);
	}
	public static String Encripta (String message, String key) {
		String encriptedMessage = invertString(message);
		encriptedMessage = middleTransposition(encriptedMessage);
		encriptedMessage = encriptMessageWithKey(encriptedMessage, key);
		encriptedMessage = stringToBinaryEachChar(encriptedMessage);
		encriptedMessage = numbersToChars(encriptedMessage);
		return encriptedMessage;
	}
	public static String Desencripta (String message) {
		return Desencripta(message, defaultKey);
	}
	public static String Desencripta (String message, String key) {
		String unEncriptedMessage = "";
		unEncriptedMessage = unencriptCharsToNumber(message);
		unEncriptedMessage = unencriptBinaryToNumber(unEncriptedMessage);
		unEncriptedMessage = unencriptDecimalToChars(unEncriptedMessage, key);
		unEncriptedMessage = unmiddleTransposition(unEncriptedMessage);
		unEncriptedMessage = invertString(unEncriptedMessage);
		return unEncriptedMessage;
	}
	private static String middleTransposition (String message) {
		String transpositedMessage = "";
		final int messageLong = message.length();
		int totalUtilsChars = ( ( (messageLong / 2) % 2 ) == 0) ? messageLong / 2 : (messageLong - 1 ) / 2;
		String firstPart = "";
		String secondPart = "";
		for (int character = 0; character < totalUtilsChars; character++) firstPart += message.charAt(character);
		for (int character = totalUtilsChars; character < messageLong; character++) secondPart += message.charAt(character);
		transpositedMessage = secondPart + firstPart;
		return transpositedMessage;
	}
	private static String invertString (String messageToInvert) {
		String invertedMessage = "";
		final int messageLong = messageToInvert.length();
		for (int character = messageLong - 1; character > -1; character--) invertedMessage += messageToInvert.charAt(character);
		return invertedMessage;
	}
	private static int getKeyValue (String key) {
		int keyValue = 0;
		final int keyLenght = key.length();
		for (int character = 0; character < keyLenght && character < maxKeyLenght; character ++) keyValue += ((int)(key.charAt(character))) + character;
		return keyValue;
	}
	private static String encriptMessageWithKey (String message, String key) {
		String encriptedMessaged = "";
		final int messageLenght = message.length();
		final int keyValue = getKeyValue(key);
		int multiplier = minMultNumber;
		for (int character = 0; character < messageLenght; character++) {
			if (multiplier > maxMultNumber) multiplier = minMultNumber;
			String id = "";
			id += (int)(message.charAt(character)) * (multiplier * keyValue);
			encriptedMessaged += id + "_";
			multiplier ++;
		}
		return encriptedMessaged;
	}
	private static String stringToBinaryEachChar (String message) {
		String messageEncripted = "";
		final int messageLenght = message.length();
		for (int character = 0; character < messageLenght; character ++) {
			if (!(message.charAt(character) == '-') ) {
				if ((message.charAt(character) == '_') ) messageEncripted += '_';
				else {
					String binary = Integer.toBinaryString((Character.getNumericValue(message.charAt(character))));
					String binaryWithExtraDigits = String.format("%" + binaryLenght + "s", binary).replace(' ', '0');
					messageEncripted += binaryWithExtraDigits + "-";
				}
			}
		}
		return messageEncripted;
	}
	private static String numbersToChars (String message) {
		String messageEncripted = "";
		int charPosition = 0;
		final int messageLenght = message.length();
		for (int characters = 0; characters < messageLenght; characters++) {
			charPosition = (int)(Math.random()*oneChars.length);
			if (message.charAt(characters) == '1') messageEncripted += oneChars[charPosition];
			else if (message.charAt(characters) == '0') messageEncripted += zeroChars[charPosition];
			else if (message.charAt(characters) == '-') messageEncripted += guionChars[charPosition];
			else messageEncripted += slashChars[charPosition];
			
		}
		return messageEncripted;
	}
	private static String unencriptCharsToNumber (String message) {
		String unEncriptedMessage = "";
		final int messageLenght = message.length();
		for (int character = 0; character < messageLenght; character ++)  {
			int unencriptedNumber = getNumberFromChar(message.charAt(character));
			unEncriptedMessage += (unencriptedNumber == -1) ? "-" : ( (unencriptedNumber == -2) ? "_" : unencriptedNumber);
		}
		return unEncriptedMessage;
	}
	private static String unencriptBinaryToNumber (String message) {
		String unEncriptedMessage = "";
		final int messageLenght = message.length();
		for (int character = 0; character < messageLenght; character += binaryLenght + 1) {
			boolean isSlashOnChar = (message.charAt(character) == '_');
			if (isSlashOnChar)  {
				unEncriptedMessage += "_";
				character ++;
			}
			if (character + binaryLenght < messageLenght) {
				String binary = getBinary(message, character);
				unEncriptedMessage += parseBinaryToDecimal(binary);
			}
			

		}
		return unEncriptedMessage;
	}
	private static String unencriptDecimalToChars (String message, String key) {
		String unEncriptedMessage = "";
		final int messageLenght = message.length();
		double multiplier = minMultNumber;
		final int keyValue = getKeyValue(key);
		double numberFromMessageToCheck = 0;
		for (int character = 0; character < messageLenght; character++) {
			String charachter = "";
			charachter += message.charAt(character);
			if(!charachter.equals("_")) numberFromMessageToCheck = numberFromMessageToCheck * 10 + Integer.parseInt(charachter);
			double valueToDivideNumbreFromMessage = multiplier * keyValue;
			double possibleNextASCIIChar = numberFromMessageToCheck / valueToDivideNumbreFromMessage;
			if (message.charAt(character) == '_') {
				int calculatedChar = (int) (possibleNextASCIIChar);
				if (calculatedChar > 0 && calculatedChar < 256) {
					unEncriptedMessage += (char)possibleNextASCIIChar;
					multiplier ++;
					numberFromMessageToCheck = 0;
					if (multiplier > maxMultNumber) multiplier = minMultNumber;
				}
			}
		}
		return unEncriptedMessage;
	}
	private static String unmiddleTransposition (String message) {
		if (message.length() == 2) return message;
		String transpositedMessage = "";
		final int messageLong = message.length();
		int totalUtilsChars = ( ( messageLong % 2 ) == 0) ? messageLong / 2 : (messageLong + 1) / 2;
		String firstPart = "";
		String secondPart = "";
		for (int character = 0; character < totalUtilsChars; character++) firstPart += message.charAt(character);
		for (int character = totalUtilsChars; character < messageLong; character++) secondPart += message.charAt(character);
		transpositedMessage = secondPart + firstPart;
		return transpositedMessage;
	}
	private static int getNumberFromChar (char character) {
		boolean found = false;
        for (char element : zeroChars) {
            if (element == character) {
                found = true;
                break;
            }
        }
        if (found) return 0;
        else  {
        	for (char element : oneChars) {
                if (element == character) {
                    found = true;
                    break;
                }
            }
            if (found) return 1;
            else  {
            	for (char element : guionChars) {
                    if (element == character) {
                        found = true;
                        break;
                    }
                }
            	if (found)return -1;
            	else return -2;
            }
        }
	}
	private static int parseBinaryToDecimal (String binary) {
		
		final int binaryLenght = binary.length();
		int decimalValue = 0;
		for (int character = 0; character < binaryLenght; character++) {
			if (binary.charAt(character) == '1') {
				decimalValue += Math.pow(2, 4 - (character + 1));
			}
		}
        return decimalValue;
	}
	private static String getBinary (String message, int initialPosition) {
		String binary = "";
		int extraPosition = 0;
		do {
			binary += message.charAt(initialPosition + extraPosition);
			extraPosition ++;
		} while (extraPosition < binaryLenght);
		return binary;
	}
}
