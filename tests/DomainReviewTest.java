package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(41, 48, 32, 92);
        if (DomainReview.score(item) != 126) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("watch")) throw new AssertionError("domain lane mismatch");
    }
}
