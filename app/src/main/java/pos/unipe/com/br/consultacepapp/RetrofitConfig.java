package pos.unipe.com.br.consultacepapp;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * Created by aalve on 18/07/2018.
 */

public class RetrofitConfig {

    private final Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://viacep.com.br/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public CEPService getCEPService() {
        return this.retrofit.create(CEPService.class);
    }
}
