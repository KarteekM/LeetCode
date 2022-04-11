import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyUrl {

	public static void main(String[] args) {
		Codec codec = new Codec();
		String encoded = codec.encode("https://leetcode.com/problems/design-tinyurl");
		String decoded = codec.decode(encoded);
		System.out.println(decoded);
	}

}

class Codec {

	String encodedString;
	String decodedString;
	private static final String BASE_URL = "http://tinyurl.com/";
	private static final String ENCODER_RANGE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private Map<String, String> urlEncodedMapper = new HashMap<String, String>();
	private Map<String, String> encodedUrlMApper = new HashMap<String, String>();

	// Encodes a URL to a shortened URL.
	public String encode(String longUrl) {

		StringBuilder encodedString = new StringBuilder();
		if (urlEncodedMapper.containsKey(longUrl)) {
			return BASE_URL + urlEncodedMapper.get(longUrl);
		} else {

			do {

				for (int i = 0; i < 6; i++) {
					int index = (int) (Math.random() * ENCODER_RANGE.length());
					encodedString.append(ENCODER_RANGE.charAt(index));
				}

			} while (encodedUrlMApper.containsKey(encodedString));

			urlEncodedMapper.put(longUrl, encodedString.toString());
			encodedUrlMApper.put(encodedString.toString(), longUrl);
			return BASE_URL + encodedString;
		}

	}

	// Decodes a shortened URL to its original URL.
	public String decode(String shortUrl) {
		String[] split = shortUrl.split(BASE_URL);
		return encodedUrlMApper.get(split[1]);
	}
}