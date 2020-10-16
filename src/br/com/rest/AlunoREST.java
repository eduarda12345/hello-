package br.com.rest;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.model.Aluno;

@Path("/Aluno")
public class AlunoREST {

	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAluno() {
		ArrayList<Aluno> Aluno = new ArrayList();	
		Aluno Eduarda = new Aluno( 1, "Eduarda ", 2000);
		Aluno.add(Eduarda);

		return Response.ok(Aluno).build();
	}

	@GET
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPersonagem(@PathParam("id") int id) {
		ArrayList<Aluno> Aluno = new ArrayList();

		Aluno Eduarda = new Aluno(1, "Eduarda", 2000);
		Aluno.add(Eduarda);

		return Response.ok(Aluno.get(id)).build();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addPersonagem(Aluno Aluno) {
		try {
			ArrayList<Aluno> personagens = new ArrayList();

			Aluno Eduarda = new Aluno(1 ,"Eduarda", 2000);
			Aluno.add(Eduarda);


			return Response.status(Response.Status.CREATED).entity(Aluno).build();
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
	}

	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deletaPersonagem(@PathParam("id") int id) {

		try {
			ArrayList<Aluno> alunos = new ArrayList();

			Aluno Eduarda = new Aluno (1, "eduarda", 2000);
			Aluno.add(Eduarda);
			
			Aluno.remove(id);
			
			for (Aluno a: alunos) {
				System.out.println("->> " + a.getNome());
			}

			return Response.status(Response.Status.OK).build();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).build();
		}

	}

}