package book.store.exception;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(final String message) {
        super(message);
    }
}
