package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import org.springframework.stereotype.Service;
@Service
public class Weather {
	public String weatherData() {
		String address="http://data.ex.co.kr/openapi/restinfo/restWeatherList";
		String data="";
		try {
			URL url=new URL(address);
			try {
				URLConnection uc=url.openConnection();
				BufferedReader in=new BufferedReader(new InputStreamReader(uc.getInputStream()));
				String line;
				while((line=in.readLine())!=null) {
					data+=line;
				}
				in.close();
				return data;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return data;
	}
	}

//	public static void main(String[] args) {
//		String address="http://data.ex.co.kr/openapi/restinfo/restWeatherList";
//		try {
//			URL url=new URL(address);
//			try {
//				URLConnection uc=url.openConnection();
//				BufferedReader in=new BufferedReader(new InputStreamReader(uc.getInputStream()));
//				String line;
//				while((line=in.readLine())!=null) {
//					System.out.println(line);
//				}
//				in.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//

