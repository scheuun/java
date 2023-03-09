package ch07.ex06.case08;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	List<Container<?>> containers = new ArrayList<>();// 컨테이너 사용 시점

	public void put(Container<?> container) {
		containers.add(container);
	}
}
