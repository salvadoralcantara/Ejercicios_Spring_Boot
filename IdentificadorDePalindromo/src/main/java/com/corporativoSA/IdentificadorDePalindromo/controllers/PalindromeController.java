package com.corporativoSA.IdentificadorDePalindromo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * Controller for the Palindrome Identifier.
 */
@RestController
public class PalindromeController {
    /**
     * Endpoint to identify if a word is a palindrome.
     * @param word word to be verified.
     * @return a message indicating if the word is a palindrome or not.
     */
    @GetMapping("/palindromo/{word}")
    public String palindromeIdentifier(@PathVariable String word){
        String answer = "";
        if(isPalindrome(word)){
            answer = "La palabra " + word + " SI es un palindromo.";
        } else {
            answer = "La palabra " + word + " NO es un palindromo.";
        }
        return answer;
    }
    /**
     * Method to identify if a word is a palindrome.
     * @param word word to be verified.
     * @return a true or false.
     */
    public boolean isPalindrome(String word){
        // Reverse the word with StringBuilder what is more efficient than a loop in this case.
        String reverseWord = new StringBuilder(word).reverse().toString();
        return word.equals(reverseWord);
    }
}
