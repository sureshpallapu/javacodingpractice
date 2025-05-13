package in.Exception.CustomUnCheckedExceptions;

//Custom Unchecked Exception
class NegativeNumberException extends RuntimeException {
 public NegativeNumberException(String message) {
     super(message);
 }
}
