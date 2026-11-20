package com.couplet.lyrics.data.api.playlist

import com.couplet.lyrics.domain.model.playlist.PlaylistExtractResult

interface PlaylistExtractor {
    fun canHandle(url: String): Boolean
    suspend fun extract(url: String): Result<PlaylistExtractResult>
}
