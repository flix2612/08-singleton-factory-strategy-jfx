package ohm.softa.a08.api;

import com.google.gson.Gson;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {
	private final OpenMensaAPI mensaApiInstance;
	private static OpenMensaAPIService instance = null;

	private OpenMensaAPIService() {
		Gson gson = new Gson();

		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create(gson))
			.baseUrl("https://openmensa.org/api/v2/")
			.build();

		mensaApiInstance = retrofit.create(OpenMensaAPI.class);
	}

	public static OpenMensaAPIService getInstance() {
		if (instance == null) {
			instance = new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getApi() {
		return mensaApiInstance;
	}
}

