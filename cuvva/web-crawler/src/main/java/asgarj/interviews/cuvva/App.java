/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package asgarj.interviews.cuvva;

import asgarj.interviews.cuvva.crawler.WebCrawler;
import asgarj.interviews.cuvva.scraper.WebScraper;

public class App {
    public static final String INITIAL_URL = "http://www.cuvva.com";

    public static void main(String[] args) throws InterruptedException {
        new WebCrawler(INITIAL_URL, new WebScraper()).crawler();
    }
}
