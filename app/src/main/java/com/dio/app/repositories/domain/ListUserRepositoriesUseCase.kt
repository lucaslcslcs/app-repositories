package com.dio.app.repositories.domain

import com.dio.app.repositories.core.UseCase
import com.dio.app.repositories.data.model.Repo
import com.dio.app.repositories.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
    ) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}