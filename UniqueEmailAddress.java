import java.util.HashSet;

public class UniqueEmailAddress {


	public int numUniqueEmails(String[] emails) {
		HashSet<String>  uniqueEmailAddresses = new HashSet<String>();
		for (String email:emails) {
			calculateValidEmails(email, uniqueEmailAddresses);
		}
		return uniqueEmailAddresses.size();
	}

	private void calculateValidEmails(String emailAddress,HashSet<String>  uniqueEmailAddresses) {
		
		String[] emailParts = emailAddress.split("@");
		String[] validParts =  emailParts[0].split("\\+");
		uniqueEmailAddresses.add(validParts[0].replace(".", "")+"@"+emailParts[1]);
	}

	public static void main(String[] args) {

		String emails[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" }; 
		System.out.println(new UniqueEmailAddress().numUniqueEmails(emails));
		String emails2[] = { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" };
		System.out.println(new UniqueEmailAddress().numUniqueEmails(emails2));

		String emails3[] = { "test.email+alex@leetcode.com", "test.email.leet+alex@code.com" };
		System.out.println(new UniqueEmailAddress().numUniqueEmails(emails3));

		String emails4[] = { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" };
		System.out.println(new UniqueEmailAddress().numUniqueEmails(emails4));

		String emails5[] = { "test.emailalex@leetcode.com", "test.e.mailbob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		System.out.println(new UniqueEmailAddress().numUniqueEmails(emails5));
	}
}
