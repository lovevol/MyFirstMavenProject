/**
 * Created by lh
 * on 2017/6/15.
 */
public interface AccountEmailService {
    void sendMail(String to,String subject,String htmlText) throws Exception;
}
