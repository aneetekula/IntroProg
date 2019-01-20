
public class Choice
{
        private String letter;
        public String question;
        public String message;
        
        public Choice()
        {
            //no-arg constructor
        }
        
        public String getQuestion()
        {
            question = ("Make the correct choice... \n\nWhich planet is closest to Earth?" + "\nA) Mars"
                        + "\nB) Venus" + "\nC) Moon" + "\nPlease enter your choice:");
            return question;
        }
        
        public String getQuestion2()
        {
            question = ("Make the correct choice ... \n\nWhich planet is farthest from the Sun?"  
                            + "\nA) Neptune"
                            + "\nB) Pluto"
                            + "\nC) Saturn"
                            + "\nD) Uranus"
                            + "\nPlease enter your choice: ");
            return question;
        }
        
        public String getQuestion3()
        {
            question = ("Make the correct choice ... \n\nWhich Apollo mission was first successful to reaching the "
                        + "moon?"
                            + "\nA) Apollo 14"
                            + "\nB) Apollo 12"
                            + "\nC) Apoll0 18"
                            + "\nD) Apollo 13"
                            + "\nPlease enter your choice: ");
            return question;
        }
        
        public void setChoice(String l)
        {
            letter = l;
        }
        
        public String getChoice()
        {
            return letter;            
        }
        
        public String classify()
        {
            if (letter.length() > 1)
            {
                message = "You entered an INVALID choic!";
            }
            else
            {
                letter = letter.toUpperCase();
                if (letter.equals("A"))
                {
                    message = "Incorrect";
                }
                else if (letter.equals("B"))
                {
                    message = "Correct";
                }
                else if (letter.equals("C"))
                {
                    message = "Incorrect";
                }
                else 
                {
                    message = "You entered an INVALID choic!";
                }
            }
            return message;
        }
        
        public String classify2()
        {
            if (letter.length() > 1)
            {
                message = "You entered an INVALID choic!";
            }
            else
            {
                letter = letter.toUpperCase();
                if (letter.equals("A"))
                {
                    message = "Correct";
                }
                else if (letter.equals("B"))
                {
                    message = "Incorrect";
                }
                else if (letter.equals("C"))
                {
                    message = "Incorrect";
                }
                else if (letter.equals("D"))
                {
                    message = "Incorrect";
                }
                else 
                {
                    message = "You entered an INVALID choic!";
                }
            }
            return message;
        }
        
        public String classify3()
        {
            if (letter.length() > 1)
            {
                message = "You entered an INVALID choic!";
            }
            else
            {
                letter = letter.toUpperCase();
                if (letter.equals("A"))
                {
                    message = "Incorrect";
                }
                else if (letter.equals("B"))
                {
                    message = "Incorrect";
                }
                else if (letter.equals("C"))
                {
                    message = "Incorrect";
                }
                else if (letter.equals("D"))
                {
                    message = "Correct";
                }
                else 
                {
                    message = "You entered an INVALID choic!";
                }
            }
            return message;
        }
}