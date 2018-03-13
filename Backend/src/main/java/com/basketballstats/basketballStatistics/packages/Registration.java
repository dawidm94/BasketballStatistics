package com.basketballstats.basketballStatistics.packages;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Registration {
	private String firstName;
	private String email;
	private String password;
}
