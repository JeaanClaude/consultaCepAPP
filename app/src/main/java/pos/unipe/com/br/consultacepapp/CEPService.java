package pos.unipe.com.br.consultacepapp;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by aalve on 18/07/2018.
 */

public interface CEPService {

    @GET("ws/{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);
}
