package ru.skypro.homework.mapper;

import org.mapstruct.Mapper;
import ru.skypro.homework.dto.CreateOrUpdateComment;
import ru.skypro.homework.dto.rq.comment.Comment;
import ru.skypro.homework.entity.CommentEntity;

@Mapper(componentModel = "spring")
public interface MapperComment {

//
//
//    CommentEntity commentDtoToCommentEntity(Comment comment);
//    CommentEntity createOrUpdateCommentToEntity(CreateOrUpdateComment createOrUpdateComment);
}
