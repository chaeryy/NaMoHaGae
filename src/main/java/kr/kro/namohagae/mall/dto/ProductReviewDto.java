package kr.kro.namohagae.mall.dto;

import kr.kro.namohagae.mall.entity.ProductReview;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor(access= AccessLevel.PRIVATE)
public class ProductReviewDto {

    // 상품read에서 페이징 처리 때문에 5/4추가
    @Data
    public static class ReviewList {
        // 별점 내용 작성자 작성일
        private Integer productReviewStar;
        private String productReviewContent;
        private Integer productReviewWriter;
        private LocalDateTime productReviewWriteDate;
    }
    
    // 페이지네이션
    @Data
    @AllArgsConstructor
    public static class Pagination {
        private Integer pageNo;
        private Integer prev;
        private Integer start;
        private Integer end;
        private Integer next;
        private Integer productNo;
        private List<ReviewList> review;
    }
    
    // 리뷰 쓰기
    @Data
    public static class Write {
        private String productName;
        private String productImage;
        //
        private Integer productNo;
        private Integer orderDetailNo;
        private Integer productReviewWriter;
        private String productReviewContent;
        private Integer productReviewStar;

        public ProductReview toEntity(Integer memberNo) {
            return ProductReview.builder().productNo(productNo).orderDetailNo(orderDetailNo).productReviewWriter(memberNo).
                    productReviewContent(productReviewContent).productReviewStar(productReviewStar).productReviewWriteDate(LocalDateTime.now()).build();
        }
    }

}
