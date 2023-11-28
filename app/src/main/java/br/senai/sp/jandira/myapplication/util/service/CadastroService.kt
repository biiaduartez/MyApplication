package br.senai.sp.jandira.myapplication.util.service

import br.senai.sp.jandira.myapplication.util.model.ApiResponse
import retrofit2.Call
import com.google.gson.JsonObject
import retrofit2.http.Body
import retrofit2.http.POST

interface CadastroService {
    @POST("/usuario/cadastrarUsuario")
    fun postCadastro(@Body body: JsonObject): Call<ApiResponse>
}