package ru.skypro.homework.mapper;

import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.rq.comment.Comment;
import ru.skypro.homework.dto.CreateOrUpdateComment;
import ru.skypro.homework.entity.CommentEntity;
import ru.skypro.homework.entity.UserEntity;
import ru.skypro.homework.repository.UserRepository;

import java.util.Optional;

@Service
public class CommentMapper {

    private final UserRepository userRepository;

    public CommentMapper(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public CommentEntity commentDtoToCommentEntity(Comment comment) {
        CommentEntity commentEntity = new CommentEntity();
        Optional<UserEntity> userEntity = userRepository.findById(comment.getAuthor());
        if (userEntity.isEmpty()) {
            throw new RuntimeException("Такого пользователя нету");
        }
//        commentEntity.setAuthor(userRepository.findById(comment.getAuthor()).get());
        commentEntity.setAuthor(userRepository.findById(comment.getAuthor()));
        commentEntity.setAuthor(userRepository.findById(comment.getAuthorImage()));
        commentEntity.setAuthor(userRepository.findById(comment.getAuthorFirstName()));
        commentEntity.setCreatedAt(comment.getCreatedAt());
        commentEntity.setId(comment.getId());
        commentEntity.setText(comment.getText());
        return commentEntity;
    }

    public CreateOrUpdateComment createOrUpdateCommentEntity(Comment comment) {
        CreateOrUpdateComment createOrUpdateComment = new CreateOrUpdateComment();
        createOrUpdateComment.setText(comment.getText());
        return createOrUpdateComment;
    }



}
