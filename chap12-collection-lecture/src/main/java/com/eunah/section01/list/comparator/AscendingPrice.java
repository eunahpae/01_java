package main.java.com.eunah.section01.list.comparator;

import main.java.com.eunah.section01.list.dto.BookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        // 양수, 음수 위치를 서로 바꿔주면 내림차순으로 바뀜
        // 오름차순 정렬
        if (o1.getPrice() > o2.getPrice()) {
            result = 1;
        } else if (o1.getPrice() < o2.getPrice()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
