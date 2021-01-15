package om.trade.enums;

enum Weeks {

	MONDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}, TUESDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}, WEDNESDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}, THURSDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}, FRIDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}, SATURDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	}, SUNDAY {
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return null;
		}
	};

	String methodTest() {
		return "Enum Test From Enum Class";

	}

	String name = "java";

	abstract String getName();

}
