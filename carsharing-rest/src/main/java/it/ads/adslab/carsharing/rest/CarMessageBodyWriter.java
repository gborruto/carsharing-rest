package it.ads.adslab.carsharing.rest;

import it.ads.adslab.carsharing.domain.Car;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;


@Provider
@Produces("text/plain")
public class CarMessageBodyWriter implements MessageBodyWriter<Car>{

	@Override
	public long getSize(Car arg0, Class<?> carClass, Type type, Annotation[] annotations,
			MediaType mediaType) {
		// TODO Auto-generated method stub
		return -1;
	}

	@Override
	public boolean isWriteable(Class<?> carClass, Type type, Annotation[] annotations,
			MediaType arg3) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void writeTo(Car car, Class<?> carClass, Type arg2, Annotation[] annotations,
			MediaType mediaType, MultivaluedMap<String, Object> map,
			OutputStream out) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("Your body message writer is not yet implemeted, ")
				.append("write your code here");
		
		out.write(sb.toString().getBytes(Charset.forName("UTF-8")));
		
		//DataOutputStream dos = new DataOutputStream(out);
		
		//dos.writeUTF(sb.toString());

		
	}

}
