package webScrapper;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;
public class webScrapper {

	public static void main(String[] args) {
		try {
			// Get agent to get web browser and website
			Document doc = Jsoup.connect("https://www.goodreads.com/quotes/tag/qoutes-to-live-by")
					.userAgent("Mozilla/17.0").get();
			// Find all div elements with tag "quoteText"
			Elements temp = doc.select("div.quoteText");
			int i = 0;

			for (Element quoteList : temp) {
				//create an array for the quotes.
				String a[] = new String[30];
				//Get the quote by using the division tag.
				String quote = quoteList.getElementsByTag("div").first().text();
				
				i++;
				
				System.out.println(i + ". " + quoteList.getElementsByTag("div").first().text() + "\n");
			}
		} catch (IOException e) {

		}
		
	}
}
