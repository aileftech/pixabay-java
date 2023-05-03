package tech.ailef.pixabay.img;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

public class TestMain {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String pixabayKey = "16037743-99ae48125680bf566318f5ab4";
		PixabayScraper o = new PixabayScraper(pixabayKey, "dog");
		System.out.println(o.getBestImages());

	}
}
