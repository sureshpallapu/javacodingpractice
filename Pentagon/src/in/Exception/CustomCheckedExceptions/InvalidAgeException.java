package in.Exception.CustomCheckedExceptions;

//Custom Checked Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);  // Pass message to Exception class
 }
}

