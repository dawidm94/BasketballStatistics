package com.basketballstats.basketballStatistics.packages;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
public class Registration {
	private String name;
	private String emailAddress;
	private String password;
}
