package kr.kro.namohagae.puchingtest.dao;

import kr.kro.namohagae.puchingtest.dto.ReviewDto;
import kr.kro.namohagae.puchingtest.entity.Review;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDao {

    public List<ReviewDto.profile> findContentByReceiverNo(Integer startRownum, Integer endRownum,Integer memberNo);
    public List<ReviewDto.Information>findContentByWriterNo(Integer startRownum, Integer endRownum,Integer memberNo);
    public Integer countReceiver(Integer memberNo);
    public Integer countWriter(Integer memberNo);
    public Integer count(Integer receiverNo);

    public ReviewDto.writeview reviewWriteInfo(Integer senderNo,Integer receiverNo,Integer puchingNo);

    public void save(Review review);

    public Integer checkCountReviewByPuchingNo(Integer puchingNo);

    public void updateMemberPoint(Integer bonePoint,Integer senderNo);

    public void updateMemberGrade(Integer starPoint,Integer receiverNo);

    public void updatePuchingStatus(Integer puchingNo);

    public void updateMessageContentType(Integer puchingNo);
}
