package mockitoproject01;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class NaverBookApi {

	public String getBookInfo(String author) throws IOException {
		String clientId = "dbMkrZUheXceExArp5l5";//���ø����̼� Ŭ���̾�Ʈ ���̵�";
		String clientSecret = "19yjXwwcVJ";//���ø����̼� Ŭ���̾�Ʈ ��ũ��";

		String text = URLEncoder.encode(author, "UTF-8"); //�˻���";
		String apiURL = "https://openapi.naver.com/v1/search/book.json?query="+ text + "&display=10&start=1&sort=date"; // ������ json ���

		URL url = new URL(apiURL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("X-Naver-Client-Id", clientId);
		con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
		int responseCode = con.getResponseCode();
		BufferedReader br;
		if(responseCode==200) { 
			br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
		} else {  // ���� �߻�
			br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "UTF-8"));
		}
		String inputLine;
		StringBuffer response = new StringBuffer();
		while ((inputLine = br.readLine()) != null) {
			response.append(inputLine);
		}
		br.close();
		String json = response.toString();
	
		return json;

	}
}


	